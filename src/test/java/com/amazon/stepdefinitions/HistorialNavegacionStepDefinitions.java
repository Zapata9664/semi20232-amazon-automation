package com.amazon.stepdefinitions;

import com.amazon.tasks.BuscarItem;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.amazon.page.CabeceraPage.*;
import static com.amazon.page.HistorialNavegacionPage.LIST_ITEMS_HISTORIAL;

public class HistorialNavegacionStepDefinitions {
    @Cuando("visualizo un {string} en el historial de navegacion")
    public void visualizoUnItem(String item) {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com"),
                BuscarItem.itemSeleccionado(item)
        );
    }

    @Entonces("debe verse {int} item(s) en el historial de navegación")
    public void verNumeroItemsEnElHistorialDeNavegacion(Integer numeroitems) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                MoveMouse.to(ACCOUNT_AND_LIST),
                Click.on(BUTTON_HISTORIAL),
                Ensure.that(LIST_ITEMS_HISTORIAL).textValues().hasSize(numeroitems)
        );
    }


}
