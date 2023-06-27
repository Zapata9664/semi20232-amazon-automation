package com.amazon.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.Keys;

import static com.amazon.page.CabeceraMusicPage.INPUT_BARRA_BUQEDA_MUSICA;
import static com.amazon.page.CabeceraPage.*;
import static com.amazon.page.TituloPodcast.*;

public class EscucharPodcastStepDefinitions {
    @Cuando("ingreso {string} en la seccion de musica")
    public void entroALaSesionPodcast(String item) {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com"),
                MoveMouse.to(ACCOUNT_AND_LIST),
                Click.on(MUSIC_LIBRARY),
                Enter.theValue(item).into(INPUT_BARRA_BUQEDA_MUSICA).thenHit(Keys.ENTER)

        );
    }

    @Entonces("debe aparecer el texto Resultados de búsqueda para {string}")
    public void verSesionPodcast(String item) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(TITLE_RESULTADOS_MUSICA).isEnabled()
        );
    }
}
