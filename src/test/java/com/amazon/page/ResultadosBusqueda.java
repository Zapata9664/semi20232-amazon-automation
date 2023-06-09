package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class ResultadosBusqueda {
    public static Target ITEM_COMPRA = Target.the("item buscado").locatedByFirstMatching("//img[@data-image-latency=\"s-product-image\"]");
    public static Target ITEM_COMPRA_HEALTH = Target.the("item buscado con envio a Canada").locatedByFirstMatching("//span[@data-component-type=\"s-product-image\"]");
    public static Target TITLE_RESULTADOS_MUSICA = Target.the("boton historial de navegacion").locatedBy("//music-horizontal-item[@data-key=\"El RemateAlcolirykoz & Armando Hernándezundefined\"]");

}