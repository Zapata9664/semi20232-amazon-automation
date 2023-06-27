package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HistorialNavegacionPage {
    public static Target LIST_ITEMS_HISTORIAL = Target.the("lista de items en historial de navegacion").locatedBy("//div[@data-card-metrics-id=\"p13n-browsing-history_desktop-ybh_0\"]//div[@data-offset]");

}
