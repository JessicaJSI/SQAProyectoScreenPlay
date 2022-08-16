package com.dafiti.UserInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MensajeRegistroPage {

    public static final Target MSJ_REGISTRO = Target.the("Mensaje de validacion registro")
            .located(By.xpath("(//*[@class='titleAccount pbs mbm'])[1]"));

}
