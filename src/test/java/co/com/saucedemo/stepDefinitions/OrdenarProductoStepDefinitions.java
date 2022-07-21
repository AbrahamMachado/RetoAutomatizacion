package co.com.saucedemo.stepDefinitions;

import co.com.saucedemo.integrations.ExcepcionTitulo;
import co.com.saucedemo.questions.MensajeDeConfirmacion;
import co.com.saucedemo.tasks.AgregarProducto;
import co.com.saucedemo.tasks.RealizarOrdenProducto;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;

import static co.com.saucedemo.userinterfaces.OrdenCompletaPage.MENSAJE_FINALIZACION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalToIgnoringCase;


public class OrdenarProductoStepDefinitions {

    @Cuando("agrega un producto al carrito de compras")
    public void agregaUnProductoAlCarritoDeCompras() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarProducto.on()
        );
    }

    @Cuando("procede a realizar la orden del producto")
    public void procedeARealizarLaOrdenDelProducto(DataTable usuarios) {
        List<List<String>> rows = usuarios.asLists(String.class);
        for (List<String> columns : rows) {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    RealizarOrdenProducto.on(columns.get(0), columns.get(1), columns.get(2))
            );
        }
    }

    @Entonces("ve en pantalla el mensaje {string}")
    public void veEnPantallaElMensaje(String mensaje) {
        theActorInTheSpotlight().should(
                seeThat(
                        MensajeDeConfirmacion.es(), equalToIgnoringCase(mensaje)
                ).orComplainWith(
                        ExcepcionTitulo.class,"Error en el mensaje de finalizacion"
                )
        );
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(MENSAJE_FINALIZACION).text().isEqualToIgnoringCase(mensaje)
        );
    }

}
