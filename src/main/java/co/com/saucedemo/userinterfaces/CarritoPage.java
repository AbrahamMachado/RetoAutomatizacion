package co.com.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoPage {

    public static final Target COSTO_PRODUCTO =
            Target.the("Costo del producto").locatedBy("(//div[@class='inventory_item_price'])[{0}]");
    public static final Target CHECKOUT =
            Target.the("Checkout").located(By.id("checkout"));

    private CarritoPage(){
    }
}
