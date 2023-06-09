package com.amazon.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class AgregarCarritoStepDefinitions {

    @Cuando("agrego un {string} al carrito")
    public void agregoUnItemAlCarrito(String item) {
        OnStage.theActorCalled("comprador").attemptsTo(

        );
    }

    @Entonces("debe verse {int} item(s) en el carrito de compras")
    public void verNumeroItemsEnCarrito(Integer numeroitems) {
        OnStage.theActorInTheSpotlight().attemptsTo(

        );
    }
}
