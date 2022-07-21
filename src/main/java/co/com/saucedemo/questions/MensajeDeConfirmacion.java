package co.com.saucedemo.questions;

import co.com.saucedemo.userinterfaces.OrdenCompletaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MensajeDeConfirmacion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return OrdenCompletaPage.MENSAJE_FINALIZACION.resolveFor(actor).getText();
    }

    public static MensajeDeConfirmacion es(){
        return new MensajeDeConfirmacion();
    }

}
