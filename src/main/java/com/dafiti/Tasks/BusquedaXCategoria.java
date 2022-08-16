package com.dafiti.Tasks;

import com.dafiti.Utils.DatosExcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.dafiti.UserInterface.BusquedaXCategoriaPage.*;
import static com.dafiti.UserInterface.RegistroPage.BTN_POPUP;
import static com.dafiti.UserInterface.RegistroPage.BTN_POPUP_CANCELAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class BusquedaXCategoria implements Task {

    DatosExcel datosExcel = new DatosExcel();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            actor.attemptsTo(
                    //WaitUntil.the(BTN_POPUP, isNotVisible()).forNoMoreThan(30).seconds(),
                    //Click.on(BTN_POPUP_CANCELAR),
                    Click.on(BTN_CATEGORIA_HOMBRE),
                    Click.on(BTN_PRODUCTO_JEANS),
                    new ScrollToTarget(BTN_JEAN_KOAJ),
                    Click.on(BTN_JEAN_KOAJ),
                    Click.on(BTN_DESPLEGAR_TALLAS),
                    Click.on(LST_TALLA_JEAN),
                    //SelectFromOptions.byVisibleText(datosExcel.leerDatosExcel("Datos.xlsx","TallaJeans",1,0)).from(LST_TALLA_JEAN),
                    Click.on(BTN_AGREGAR_AL_CARRITO)
            );
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static BusquedaXCategoria buscarProductoXCategoria() { return instrumented (BusquedaXCategoria.class); }

}
