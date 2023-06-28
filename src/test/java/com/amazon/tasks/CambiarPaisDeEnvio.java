package com.amazon.tasks;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.page.CabeceraPage.BUT_DELIVERY_TO;
import static com.amazon.page.SeleccionarDestino.*;

public class CambiarPaisDeEnvio {
    public static Performable cambiarPaisEnvio() {
        return Task.where("cambiar pais de envio",
                Click.on(BUT_DELIVERY_TO),
                Click.on(BUT_DELIVERY_COUNTRY),
                Click.on(BUT_ENVIO_CANADA),
                Click.on(BUT_DONE)
        );
    }
}