package com.amazon.stepdefinitions;

import com.amazon.tasks.BuscarCancion;
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
import static com.amazon.page.ModalAccountAndList.MUSIC_LIBRARY;
import static com.amazon.page.ResultadosBusqueda.TITLE_RESULTADOS_MUSICA;

public class EscucharCancionStepDefinitions {
    @Cuando("ingreso {string} en la seccion de musica")
    public void entroAmazonMusic(String item) {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com"),
                BuscarCancion.cancionSeleccionada(item)

        );
    };
    @Entonces("deben verse los resultados de la busqueda")
    public void verResultadosCanciones() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(TITLE_RESULTADOS_MUSICA).isEnabled()
        );
    };
};
