package co.com.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.saucedemo.userinterfaces.InicioSesionPage.TXT_CLAVE;
import static co.com.saucedemo.userinterfaces.InicioSesionPage.TXT_USUARIO;
import static co.com.saucedemo.userinterfaces.InicioSesionPage.BTN_INICIAR_SESION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesion implements Task {

    private final String usuario;
    private final String clave;

    public IniciarSesion(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(TXT_USUARIO),
                Enter.theValue(clave).into(TXT_CLAVE),
                Click.on(BTN_INICIAR_SESION)
        );
    }

    public static Performable enSwagLabs(String usuario, String clave) {
        return instrumented(IniciarSesion.class, usuario, clave);
    }
}
