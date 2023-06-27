package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AsidePage {
    public static Target BUT_AWARD_WINNERS = Target.the("botón libros ganadores").locatedBy("//a[text()=\"Award Winners\"]");
}
