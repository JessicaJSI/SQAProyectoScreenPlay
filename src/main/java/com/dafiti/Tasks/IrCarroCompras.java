package com.dafiti.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;

import static com.dafiti.UserInterface.MensajeCarritoPage.BTN_CARRITO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IrCarroCompras implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            actor.attemptsTo(
                    WaitUntil.the(BTN_CARRITO, isVisible()).forNoMoreThan(30).seconds(),
                    Click.on(BTN_CARRITO)
            );
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static IrCarroCompras irCarroDeCompras() { return instrumented (IrCarroCompras.class); }


}
