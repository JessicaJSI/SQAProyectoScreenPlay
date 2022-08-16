package com.dafiti.Tasks;

import com.dafiti.Utils.DatosExcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.io.IOException;
import static com.dafiti.UserInterface.RegistroPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegistroUsuario implements Task {

    DatosExcel datosExcel = new DatosExcel();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            actor.attemptsTo(
                    //Switch.toAlert();
                    WaitUntil.the(BTN_POPUP, isNotVisible()).forNoMoreThan(30).seconds(),
                    Click.on(BTN_POPUP_CANCELAR),
                    Click.on(BTN_REGISTRATE),
                    Enter.theValue(datosExcel.leerDatosExcel("Datos.xlsx", "Registro", 1, 0)).into(TXT_CORREO),
                    Enter.theValue(datosExcel.leerDatosExcel("Datos.xlsx","Registro",1,1)).into(TXT_CONTRASENA),
                    Enter.theValue(datosExcel.leerDatosExcel("Datos.xlsx","Registro",1,2)).into(TXT_CONFIRMAR_CONTRASENA),
                    Enter.theValue(datosExcel.leerDatosExcel("Datos.xlsx","Registro",1,3)).into(TXT_NOMBRE),
                    Enter.theValue(datosExcel.leerDatosExcel("Datos.xlsx","Registro",1,4)).into(TXT_APELLIDOS),
                    SelectFromOptions.byVisibleText(datosExcel.leerDatosExcel("Datos.xlsx","Registro",1,5)).from(LST_TIPO_ID),
                    Enter.theValue(datosExcel.leerDatosExcel("Datos.xlsx","Registro",1,6)).into(TXT_NUMERO_ID),
                    Enter.theValue(datosExcel.leerDatosExcel("Datos.xlsx","Registro",1,7)).into(TXT_DIA_NACIMIENTO),
                    Enter.theValue(datosExcel.leerDatosExcel("Datos.xlsx","Registro",1,8)).into(TXT_MES_NACIMIENTO),
                    SelectFromOptions.byVisibleText(datosExcel.leerDatosExcel("Datos.xlsx","Registro",1,9)).from(LST_ANO_NACIMIENTO),
                    SelectFromOptions.byVisibleText(datosExcel.leerDatosExcel("Datos.xlsx","Registro",1,10)).from(LST_SEXO),
                    Click.on(CHK_OFERTAS)
                    //Click.on(BTN_ENVIAR_DATOS)
            );
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static RegistroUsuario informacionRegistro (){
        return instrumented (RegistroUsuario.class);
    }

}
