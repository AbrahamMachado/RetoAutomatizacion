package co.com.saucedemo.tasks;

import co.com.saucedemo.enums.VariableSesion;
import co.com.saucedemo.userinterfaces.CarritoPage;
import co.com.saucedemo.userinterfaces.ConfirmacionPage;
import co.com.saucedemo.userinterfaces.InformacionUsuarioPage;
import co.com.saucedemo.userinterfaces.ProductosPage;
import co.com.saucedemo.utils.Utilities;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarOrdenProducto implements Task {

    private String nombre;
    private String apellido;
    private String codigo;

    public RealizarOrdenProducto(String nombre, String apellido, String codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductosPage.CARRITO_COMPRAS),
                Click.on(CarritoPage.CHECKOUT),
                Enter.keyValues(nombre).into(InformacionUsuarioPage.NOMBRE),
                Enter.keyValues(apellido).into(InformacionUsuarioPage.APELLIDO),
                Enter.keyValues(codigo).into(InformacionUsuarioPage.CODIGO_POSTAL),
                Click.on(InformacionUsuarioPage.CONTINUAR)
        );
        String precio_prod_carrito = actor.recall(VariableSesion.PRECIO_PRODUCTO.toString());
        String precio_prod = ConfirmacionPage.TOTAL_PRODUCTO.resolveFor(actor).getText();
        if(Utilities.getValor(precio_prod_carrito).equals(Utilities.getValor(precio_prod))){
            actor.attemptsTo(
                    Click.on(ConfirmacionPage.FINALIZAR)
            );
        }else {
            System.out.println("Los precios no coinciden");
            System.out.println("actor"+Utilities.getValor(precio_prod_carrito));
            System.out.println("cobro"+Utilities.getValor(precio_prod));
        }
    }

    public static Performable on(String nombre, String apellido, String codigo) {
        return instrumented(RealizarOrdenProducto.class, nombre, apellido, codigo);
    }
}
