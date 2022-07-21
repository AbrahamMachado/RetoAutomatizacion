package co.com.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioSesionPage {

    public static final Target TXT_USUARIO =
            Target.the("Caja de texto usuario").located(By.id("user-name"));
    public static final Target TXT_CLAVE =
            Target.the("Caja de texto clave").located(By.id("password"));
    public static final Target BTN_INICIAR_SESION =
            Target.the("Boton iniciar sesion").located(By.id("login-button"));

    private InicioSesionPage() {
    }
}
