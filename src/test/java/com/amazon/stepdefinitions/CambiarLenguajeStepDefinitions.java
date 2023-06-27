package com.amazon.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import java.lang.Thread;

import static com.amazon.page.CabeceraPage.*;
import static com.amazon.page.HistorialNavegacionPage.LIST_ITEMS_HISTORIAL;

public class CambiarLenguajeStepDefinitions {
    @Cuando("cambio el lenguaje a español")
    public void visualizoUnItem() {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com"),
                MoveMouse.to(BUT_LANGUAGE),
                Click.on(BUT_LANGUAGE_ESPAÑOL)
        );
    }

    @Entonces("debe verse Buscar Amazon en la barra de busqueda")
    public void verNumeroItemsEnElHistorialDeNavegacion() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(INPUT_BARRA_BUSQUEDA_ESPAÑOL).isEnabled()
        );
    }
}
