package com.dafiti.UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BusquedaXCategoriaPage extends PageObject {

    public static final Target BTN_CATEGORIA_HOMBRE = Target.the("Seleccionar categoria del producto")
            .located(By.xpath("//*[@href='https://www.dafiti.com.co/masculino/' and @class='segment nav-superior']"));
    public static final Target BTN_PRODUCTO_JEANS = Target.the("Seleccionar producto tipo jeans")
            .located(By.id("cpgn-JEANSM-NA-COM01"));
    public static final Target BTN_JEAN_KOAJ = Target.the("seleccionar jean de koaj original")
            .located(By.xpath("//*[text()='KOAJ-PANTALON KOAJ GERALD SKINNY 2/22']"));
    public static final Target BTN_DESPLEGAR_TALLAS = Target.the("Desplegar lista de tallas")
            .located(By.xpath("//*[text()='Seleccione una talla']"));
    public static final Target LST_TALLA_JEAN = Target.the("Seleccionar talla del jean")
            .located(By.xpath("//li[@class='prd-option-item opt-item-5']"));
    public static final Target BTN_AGREGAR_AL_CARRITO = Target.the("Agregar zapatos al carrito")
            .located(By.id("AddToCart"));

    public static final Target BTN_POPUP = Target.the("popup pagina")
            .located(By.id("onesignal-slidedown-container"));
    public static final Target BTN_POPUP_CANCELAR = Target.the("Cerrar ventana popup")
            .located(By.id("onesignal-slidedown-cancel-button"));
}
