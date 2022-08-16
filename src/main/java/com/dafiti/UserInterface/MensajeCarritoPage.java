package com.dafiti.UserInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MensajeCarritoPage {

    public static final Target BTN_CARRITO = Target.the("Ir al carrito de compras")
            .located(By.id("cart-head"));
    public static final Target MSJ_CANT_PRODUCTOS = Target.the("Mensaje de validacion seleccion de productos")
            .located(By.xpath("//*[@class='cart-count' and text()='2']"));

}
