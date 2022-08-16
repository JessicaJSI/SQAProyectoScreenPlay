package com.dafiti.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import com.dafiti.UserInterface.MensajeRegistroPage;

public class ValidacionRegistro implements Question {

    @Override
    public Boolean answeredBy(Actor actor) {
        return MensajeRegistroPage.MSJ_REGISTRO.resolveFor(actor).isVisible();
    }

    public static Question validarRegistro () {
        return new ValidacionRegistro();
    }

}
