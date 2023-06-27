package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CabeceraPage {
    public static Target INPUT_BARRA_BUSQUEDA = Target.the("barra de busqueda").located(By.id("twotabsearchtextbox"));
    public static Target BUT_CARRITO  = Target.the("boton carrito").located(By.id("nav-cart"));
    public static Target ACCOUNT_AND_LIST = Target.the("boton acount and list").located(By.id("nav-link-accountList"));
    public static Target BUTTON_HISTORIAL = Target.the("boton historial de navegacion").locatedBy("//div[@id=\"nav-al-your-account\"]/a/child::span[text()=\"Browsing History\"]");
    public static Target MUSIC_LIBRARY = Target.the("boton biblioteca de musica").locatedBy("//div[@id=\"nav-al-your-account\"]/a/child::span[text()=\"Music Library\"]");
    public static Target INPUT_BARRA_BUSQUEDA_ESPAÑOL = Target.the("input barra de busqueda en español").locatedBy("//label[text()=\"Buscar Amazon\"]\n");
    public static Target BUT_LANGUAGE = Target.the("boton cambiar el lenguaje").locatedBy("//div[text()=\"EN\"]");
    public static Target BUT_LANGUAGE_ESPAÑOL = Target.the("boton cambiar el lenguaje a español").locatedBy("//div[@id=\"nav-flyout-icp\"]//span[text()=\"español\"]\n");
    public static Target BUT_SEACRH_BY_SECTION = Target.the("boton para buscar por secciones").located(By.id("searchDropdownBox"));
    public static Target BUTTON_BOOKS = Target.the("boton seccion books").locatedBy("//select[@id=\"searchDropdownBox\"]/child::option[text()=\"Books\"]");
    public static Target BUT_SEARCH_LAND = Target.the("boton para buscar lupa").located(By.id("nav-search-submit-button"));
    public static Target BUT_DELIVERY_TO = Target.the("boton para buscar por secciones").located(By.id("glow-ingress-block"));

}