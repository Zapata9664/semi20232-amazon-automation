package com.amazon.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.amazon.page.AsidePage.BUT_AWARD_WINNERS;
import static com.amazon.page.CabeceraPage.*;
import static com.amazon.page.LibrosPremiadosPage.AWARD_WINNERS;

public class LibrosPremiadosStepDefinitions {
    @Cuando("voy a la seccion de libros premiados")
    public void visualizoUnItem() {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com"),
                Click.on(BUT_SEACRH_BY_SECTION),
                Click.on(BUTTON_BOOKS),
                Click.on(BUT_SEARCH_LAND),
                Click.on(BUT_AWARD_WINNERS)
        );
    }

    @Entonces("debe verse book awards en la pagina de libros")
    public void verNumeroItemsEnElHistorialDeNavegacion() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(AWARD_WINNERS).isEnabled()
        );
    }
}
