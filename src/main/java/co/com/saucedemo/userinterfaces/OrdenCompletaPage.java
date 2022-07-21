package co.com.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class OrdenCompletaPage {

    public static final Target MENSAJE_FINALIZACION =
            Target.the("Mensaje de finalizacion de orden").locatedBy("//h2[@class='complete-header']");

    public OrdenCompletaPage() {
    }
}
