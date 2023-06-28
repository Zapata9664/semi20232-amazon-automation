package com.amazon.tasks;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static com.amazon.page.AsideFilter.BUT_BOOKS_SPANISH;
import static com.amazon.page.CabeceraPage.*;

public class EntrarLibrosEspañol {
    public static Performable librosEspañol() {
        return Task.where("entrar a la seccion de libros premiados",
                Click.on(BUT_BUSCAR_POR_SECCION),
                Click.on(BUTTON_BOOKS),
                Click.on(BUT_BUSCAR_LUPA),
                Click.on(BUT_BOOKS_SPANISH)
        );
    }
}
