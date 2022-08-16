package com.dafiti.UserInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BusquedaXBarraPage extends PageObject {

    public static final Target TXT_BARRA_BUSQUEDA = Target.the("Ingresar producto a buscar")
            .located(By.id("searchInput"));
    public static final Target BTN_BARRA_BUSQUEDA = Target.the("Ir al resultado de busqueda")
            .located(By.xpath("//*[@class='icon-magnifier searchButton sel-search-button']"));
    public static final Target BTN_ZAPATOS_TELLENZI = Target.the("Seleccionar camisa croydon")
            .located(By.xpath("//*[text()='Reloj Fossil Hombre Fs5210']"));
    public static final Target BTN_DESPLEGAR_TALLAS = Target.the("Desplegar lista de tallas")
            .located(By.xpath("(//span[text()='Seleccione una talla' and @class='size'])[1]"));
    public static final Target LST_TALLA_ZAPATO = Target.the("Seleccionar talla del zapato")
            .located(By.xpath("//li[@class='prd-option-item opt-item-1']"));
    public static final Target BTN_AGREGAR_AL_CARRITO = Target.the("Agregar zapatos al carrito")
            .located(By.id("AddToCart"));
}
