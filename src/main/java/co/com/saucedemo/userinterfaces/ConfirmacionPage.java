package co.com.saucedemo.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmacionPage {

    public static final Target TOTAL_PRODUCTO =
            Target.the("Total de productos").located(By.xpath("//div[contains(text(),'Item total: $')]"));
    public static final Target IMPUESTO =
            Target.the("Valor impuesto").located(By.xpath("//div[contains(text(),'Tax: $')]"));
    public static final Target TOTAL_ORDEN =
            Target.the("Total de la orden").located(By.xpath("//div[contains(text(),'Total: $')]"));
    public static final Target FINALIZAR =
            Target.the("Boton finalizar").located(By.id("finish"));

    public ConfirmacionPage() {
    }
}
