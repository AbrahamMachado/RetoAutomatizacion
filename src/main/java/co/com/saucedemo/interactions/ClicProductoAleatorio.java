package co.com.saucedemo.interactions;

import co.com.saucedemo.enums.VariableSesion;
import co.com.saucedemo.userinterfaces.CarritoPage;
import co.com.saucedemo.userinterfaces.ProductosPage;
import co.com.saucedemo.utils.Utilities;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.RememberThat;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicProductoAleatorio implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> Lista_Productos = ProductosPage.AGREGAR_CARRITO.resolveAllFor(actor);
        String item = String.valueOf(Utilities.getRandom(Lista_Productos)+1);
        actor.attemptsTo(
                RememberThat.theValueOf(VariableSesion.PRECIO_PRODUCTO.toString()).is(CarritoPage.COSTO_PRODUCTO.of(item).resolveFor(actor).getText())
        );
        Lista_Productos.get(Integer.parseInt(item)-1).click();
    }

    public static Performable on() {
        return instrumented(ClicProductoAleatorio.class);
    }
}
