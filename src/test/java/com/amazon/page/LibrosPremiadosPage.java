package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class LibrosPremiadosPage {
    public static Target AWARD_WINNERS = Target.the("seccion libros premiados").locatedBy(" //b[text()=\"Book Awards\"]");
}
