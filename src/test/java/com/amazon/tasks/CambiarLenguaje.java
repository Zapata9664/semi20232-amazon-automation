package com.amazon.tasks;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static com.amazon.page.CabeceraPage.BUT_LENGUAJE;
import static com.amazon.page.ModalAccountAndList.BUT_LANGUAGE_ESPAÑOL;

public class CambiarLenguaje {
    public static Performable cambiarLenguaje() {
        return Task.where("cambiar lenguaje",
                MoveMouse.to(BUT_LENGUAJE),
                Click.on(BUT_LANGUAGE_ESPAÑOL)
        );
    }
}
