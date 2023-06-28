package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class LibrosPremiadosPage {
    public static Target LIBROS_ESPAÑOL_TITLE = Target.the("seccion libros premiados").locatedBy("//b[text()=\"Libros en Español\"]");
}
