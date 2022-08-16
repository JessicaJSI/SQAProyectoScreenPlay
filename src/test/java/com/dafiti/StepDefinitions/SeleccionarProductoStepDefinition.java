package com.dafiti.StepDefinitions;

import com.dafiti.Tasks.BusquedaXBarra;
import com.dafiti.Tasks.BusquedaXCategoria;
import com.dafiti.Tasks.RegistroUsuario;
import com.dafiti.UserInterface.RegistroPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SeleccionarProductoStepDefinition {

    @Managed(driver = "firefox")
    private WebDriver navegador;
    private Actor jessicajsi = Actor.named("jessicajsi");

    private RegistroPage registroPage = new RegistroPage();

    @Before
    public void configuracion (){
        jessicajsi.can(BrowseTheWeb.with(navegador)); //indica que el actor puede abrir el navegador
    }

    @When("El usuario busca un producto por categoria y subcategoria y lo agrega")
    public void elUsuarioBuscaUnProductoPorCategoriaYSubcategoriaYLoAgrega() {
        jessicajsi.attemptsTo(BusquedaXCategoria.buscarProductoXCategoria());
    }

    @When("El usuario busca un producto por la barra de busqueda")
    public void elUsuarioBuscaUnProductoPorLaBarraDeBusqueda() {
        jessicajsi.attemptsTo(BusquedaXBarra.buscarProductoXBarra());
    }

    @Then("El usuario visualizara los productos en el carrito de compras")
    public void elUsuarioVisualizaraLosProductosEnElCarritoDeCompras() {

    }

}
