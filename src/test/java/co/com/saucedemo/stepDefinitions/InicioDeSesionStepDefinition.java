package co.com.saucedemo.stepDefinitions;

import co.com.saucedemo.integrations.ExcepcionTitulo;
import co.com.saucedemo.interactions.AbrirPlataforma;
import co.com.saucedemo.questions.ElTituloDeLaPagina;
import co.com.saucedemo.tasks.IniciarSesion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.saucedemo.userinterfaces.ProductosPage.TITULO_PAGINA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class InicioDeSesionStepDefinition {

    @Dado("{string} ingresa a la pagian de SauceDemo")
    public void ingresaALaPagianDeSauceDemo(String actor) {
        theActorCalled(actor).attemptsTo(
                AbrirPlataforma.deSauceDemo()
        );
    }

    @Cuando("ingresa usuario {string} y clave {string}")
    public void ingresaUsuarioYClave(String usuario, String clave) {
        theActorInTheSpotlight().attemptsTo(
                IniciarSesion.enSwagLabs(usuario, clave)
        );
    }

    @Entonces("observa el titulo de {string}")
    public void observaElTituloDe(String mensaje) {
        theActorInTheSpotlight()
                .should(
                        seeThat(
                                ElTituloDeLaPagina.es(), equalToIgnoringCase(mensaje)
                        ).orComplainWith(
                                ExcepcionTitulo.class, "Error al validar el titulo"
                        )
                );

        theActorInTheSpotlight().attemptsTo(
                Ensure.that(TITULO_PAGINA).text().isEqualToIgnoringCase(mensaje)
        );

    }

}
