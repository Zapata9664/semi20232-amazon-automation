package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoPage {
    public static Target LIST_ITEMS = Target.the("lista de items en el carrito").locatedBy("//div[@data-name='Active Items']/div[@data-item-count]");

}