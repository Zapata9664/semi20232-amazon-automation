package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionarDestino {
    public static Target BUT_DELIVERY_COUNTRY  = Target.the("boton para seleccionar el pais de envio").located(By.id("GLUXCountryValue"));
    public static Target BUT_DELIVERY_CANADA  = Target.the("boton para cambiar el pais de envio a canada").locatedBy("//a[text()=\"Canada\"]");
    public static Target BUT_DONE  = Target.the("boton hecho").locatedBy("//button[text()=\"Done\"]");


}
