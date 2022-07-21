package co.com.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductosPage {

    public static final Target TITULO_PAGINA =
            Target.the("Titulo de la pagina").located(By.className("title"));
    public static final Target AGREGAR_CARRITO =
            Target.the("Botones para agregar al carrito").locatedBy("//button[text()='Add to cart']");

    public static final Target CARRITO_COMPRAS =
            Target.the("Carrito de compras").located(By.id("shopping_cart_container"));

    private ProductosPage() {
    }
}
