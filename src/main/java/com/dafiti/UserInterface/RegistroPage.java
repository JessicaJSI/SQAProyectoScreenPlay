package com.dafiti.UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.dafiti.com.co/")
//@DefaultUrl("https://secure.dafiti.com.co/customer/account/login/")

public class RegistroPage extends PageObject {

    public static final Target BTN_REGISTRATE = Target.the("Ir a formulario de registro nuevo")
            .located(By.xpath("//*[text()='Registrate']"));
    public static final Target TXT_CORREO = Target.the("ingresar correo")
            .located(By.id("RegistrationForm_email"));
    public static final Target TXT_CONTRASENA = Target.the("ingresar contraseña")
            .located(By.id("RegistrationForm_password"));
    public static final Target TXT_CONFIRMAR_CONTRASENA = Target.the("ingresar contraseña de nuevo")
            .located(By.id("RegistrationForm_password2"));
    public static final Target TXT_NOMBRE = Target.the("Ingresar nombre")
            .located(By.id("RegistrationForm_first_name"));
    public static final Target TXT_APELLIDOS = Target.the("Ingresar apellidos")
            .located(By.id("RegistrationForm_last_name"));
    public static final Target TXT_NUMERO_ID = Target.the("Ingresar numero de identidad")
            .located(By.id("RegistrationForm_identification"));
    public static final Target LST_TIPO_ID = Target.the("Seleccionar tipo de identificación")
            .located(By.id("RegistrationForm_identification_type"));
    public static final Target TXT_DIA_NACIMIENTO = Target.the("Ingresar día de nacimiento")
            .located(By.id("RegistrationForm_day"));
    public static final Target TXT_MES_NACIMIENTO = Target.the("Ingresar mes de nacimiento")
            .located(By.id("RegistrationForm_month"));
    public static final Target LST_ANO_NACIMIENTO = Target.the("Seleccionar año de nacimiento")
            .located(By.id("RegistrationForm_year"));
    public static final Target LST_SEXO = Target.the("Seleccionar el sexo")
            .located(By.id("RegistrationForm_gender"));
    public static final Target CHK_OFERTAS = Target.the("Quitar recibir ofertas por correo")
            .located(By.id("RegistrationForm_is_newsletter_subscribed"));
    public static final Target BTN_ENVIAR_DATOS = Target.the("Enviar datos de registro")
            .located(By.id("createAccountButton"));
    public static final Target BTN_POPUP = Target.the("popup pagina")
            .located(By.id("onesignal-slidedown-container"));
    public static final Target BTN_POPUP_CANCELAR = Target.the("Cerrar ventana popup")
            .located(By.id("onesignal-slidedown-cancel-button"));
}
