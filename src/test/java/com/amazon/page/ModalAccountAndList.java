package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class ModalAccountAndList {
    public static Target BUTTON_HISTORIAL = Target.the("boton historial de navegacion").locatedBy("//div[@id=\"nav-al-your-account\"]/a/child::span[text()=\"Browsing History\"]");
    public static Target MUSIC_LIBRARY = Target.the("boton biblioteca de musica").locatedBy("//div[@id=\"nav-al-your-account\"]/a/child::span[text()=\"Music Library\"]");
    public static Target BUT_LANGUAGE_ESPAÑOL = Target.the("boton cambiar el lenguaje a español").locatedBy("//div[@id=\"nav-flyout-icp\"]//span[text()=\"español\"]\n");



}
