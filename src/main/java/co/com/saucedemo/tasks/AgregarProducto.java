package co.com.saucedemo.tasks;

import co.com.saucedemo.interactions.ClicProductoAleatorio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClicProductoAleatorio.on()
        );
    }

    public static Performable on() {
        return instrumented(AgregarProducto.class);
    }
}
