package co.com.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionUsuarioPage {
    public static final Target NOMBRE =
            Target.the("Nombre de usuario").located(By.id("first-name"));
    public static final Target APELLIDO =
            Target.the("Apellido de usuario").located(By.id("last-name"));
    public static final Target CODIGO_POSTAL =
            Target.the("Codigo postal de usuario").located(By.id("postal-code"));
    public static final Target CONTINUAR =
            Target.the("Continuar transaccion").located(By.id("continue"));

    public InformacionUsuarioPage() {
    }
}
