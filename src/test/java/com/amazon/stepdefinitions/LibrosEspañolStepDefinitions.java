package com.amazon.stepdefinitions;

import com.amazon.tasks.EntrarLibrosEspañol;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.amazon.page.LibrosPremiadosPage.LIBROS_ESPAÑOL_TITLE;

public class LibrosEspañolStepDefinitions {
    @Cuando("voy a la seccion de libros en español")
    public void visualizoUnItem() {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com"),
                EntrarLibrosEspañol.librosEspañol()
        );
    }

    @Entonces("debe verse \"libros en español\" en la pagina de libros")
    public void verNumeroItemsEnElHistorialDeNavegacion() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(LIBROS_ESPAÑOL_TITLE).isEnabled()
        );
    }
}
