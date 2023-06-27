package com.amazon.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.amazon.page.CabeceraPage.*;
import static com.amazon.page.DetalleItem.TEXT_ENVIO_CANADA;
import static com.amazon.page.InicioPage.ITEM_INIT;
import static com.amazon.page.ResultadosBusqueda.ITEM_COMPRA_HEALTH;
import static com.amazon.page.SeleccionarDestino.*;

public class CambiarPaisDeEnvioStepDefinitions {
        @Cuando("cambio mi lugar de envio a Canada")
        public void visualizoUnItem() {
            OnStage.theActorCalled("comprador").attemptsTo(
                    Open.url("https://www.amazon.com"),
                    Click.on(BUT_DELIVERY_TO),
                    Click.on(BUT_DELIVERY_COUNTRY),
                    Click.on(BUT_DELIVERY_CANADA),
                    Click.on(BUT_DONE)
            );
        }

        @Entonces("en mis articulos debe aparecer Envio a canada")
        public void verNumeroItemsEnElHistorialDeNavegacion() {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    Click.on(ITEM_INIT),
                    Click.on(ITEM_COMPRA_HEALTH),
                    Ensure.that(TEXT_ENVIO_CANADA).isEnabled()
            );
        }
}
