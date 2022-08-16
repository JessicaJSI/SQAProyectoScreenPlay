package com.dafiti.Tasks;

import com.dafiti.Utils.DatosExcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;

import static com.dafiti.UserInterface.BusquedaXBarraPage.*;
import static com.dafiti.UserInterface.BusquedaXCategoriaPage.BTN_POPUP;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;


public class BusquedaXBarra implements Task {

    DatosExcel datosExcel = new DatosExcel();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            actor.attemptsTo(
                    WaitUntil.the(BTN_POPUP, isNotVisible()).forNoMoreThan(30).seconds(),
                    Enter.theValue(datosExcel.leerDatosExcel("Datos.xlsx","Buscar",1,0)).into(TXT_BARRA_BUSQUEDA),
                    Click.on(BTN_BARRA_BUSQUEDA),
                    new ScrollToTarget(BTN_ZAPATOS_TELLENZI),
                    Click.on(BTN_ZAPATOS_TELLENZI),
                    //Click.on(BTN_DESPLEGAR_TALLAS),
                    //Click.on(LST_TALLA_ZAPATO),
                    //SelectFromOptions.byVisibleText(datosExcel.leerDatosExcel("Datos.xlsx","TallaZapatos",1,0)).from(LST_TALLA_ZAPATO),
                    Click.on(BTN_AGREGAR_AL_CARRITO)
            );
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static BusquedaXBarra buscarProductoXBarra() { return instrumented (BusquedaXBarra.class); }


}
