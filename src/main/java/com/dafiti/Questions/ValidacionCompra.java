package com.dafiti.Questions;

import com.dafiti.UserInterface.MensajeCarritoPage;
import com.dafiti.UserInterface.MensajeRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionCompra implements Question {

    @Override
    public Boolean answeredBy(Actor actor) {
        return MensajeCarritoPage.MSJ_CANT_PRODUCTOS.resolveFor(actor).isVisible();
    }

    public static Question validarCompra () {
        return new ValidacionCompra();
    }

}
