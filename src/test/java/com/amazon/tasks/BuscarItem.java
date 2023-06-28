package com.amazon.tasks;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.amazon.page.CabeceraPage.INPUT_BARRA_BUSQUEDA;

public class BuscarItem {
    public static Performable itemSeleccionado(String item) {
        return Task.where("{0} buscando el item ´" + item + "´",
                Enter.theValue(item).into(INPUT_BARRA_BUSQUEDA).thenHit(Keys.ENTER),
                SeleccionarItem.itemSeleccionado()
        );
    }

    public static Performable onlyBuscarItem(String item) {
        return Task.where("{0} buscando el item ´" + item + "´",
                Enter.theValue(item).into(INPUT_BARRA_BUSQUEDA).thenHit(Keys.ENTER),
                SeleccionarItem.onlyItemSeleccionado()
        );
    }
}
