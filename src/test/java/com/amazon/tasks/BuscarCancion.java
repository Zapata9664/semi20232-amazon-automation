package com.amazon.tasks;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.openqa.selenium.Keys;

import static com.amazon.page.CabeceraMusicPage.INPUT_BARRA_BUQEDA_MUSICA;
import static com.amazon.page.CabeceraPage.ACCOUNT_AND_LIST;
import static com.amazon.page.ModalAccountAndList.MUSIC_LIBRARY;

public class BuscarCancion {
    public static Performable cancionSeleccionada(String item) {
        return Task.where("{0} buscando el item ´" + item + "´",
                MoveMouse.to(ACCOUNT_AND_LIST),
                Click.on(MUSIC_LIBRARY),
                Enter.theValue(item).into(INPUT_BARRA_BUQEDA_MUSICA).thenHit(Keys.ENTER)
        );
    }
}
