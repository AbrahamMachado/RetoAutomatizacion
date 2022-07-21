package co.com.saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.saucedemo.userinterfaces.ProductosPage.TITULO_PAGINA;

public class ElTituloDeLaPagina implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TITULO_PAGINA.resolveFor(actor).getText();
    }

    public static ElTituloDeLaPagina es(){
        return new ElTituloDeLaPagina();
    }
}
