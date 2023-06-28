package com.amazon.stepdefinitions;

import com.amazon.tasks.CambiarLenguaje;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import static com.amazon.page.CabeceraPage.*;

public class CambiarLenguajeStepDefinitions {
    @Cuando("selecciono español como idioma")
    public void visualizoUnItem() {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com"),
                CambiarLenguaje.cambiarLenguaje()
        );
    };
    @Entonces("en la barra de búsqueda se debería mostrar \"Buscar en Amazon\"")
    public void verNumeroItemsEnElHistorialDeNavegacion() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(INPUT_BARRA_BUSQUEDA_ESPAÑOL).isEnabled()
        );
    };
};
