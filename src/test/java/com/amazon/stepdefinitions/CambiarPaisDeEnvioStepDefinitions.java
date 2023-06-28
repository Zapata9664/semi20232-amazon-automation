package com.amazon.stepdefinitions;

import com.amazon.tasks.CambiarPaisDeEnvio;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.amazon.page.DetalleItem.TEXT_ENVIO_CANADA;
import static com.amazon.page.InicioPage.ITEM_BUSQUEDA_INICIO;
import static com.amazon.page.ResultadosBusqueda.ITEM_COMPRA_HEALTH;

public class CambiarPaisDeEnvioStepDefinitions {
        @Cuando("cuando selecciono Canada como mi nuevo lugar de envio")
        public void visualizoUnItem() {
            OnStage.theActorCalled("comprador").attemptsTo(
                    Open.url("https://www.amazon.com"),
                    CambiarPaisDeEnvio.cambiarPaisEnvio()
            );
        }

        @Entonces("en los detalles de mis articulos debe aparecer \"Envio a canada\"")
        public void verNumeroItemsEnElHistorialDeNavegacion() {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    Click.on(ITEM_BUSQUEDA_INICIO),
                    Click.on(ITEM_COMPRA_HEALTH),
                    Ensure.that(TEXT_ENVIO_CANADA).isEnabled()
            );
        }
}
