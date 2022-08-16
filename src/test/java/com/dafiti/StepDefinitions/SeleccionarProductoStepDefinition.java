package com.dafiti.StepDefinitions;

import com.dafiti.Questions.ValidacionCompra;
import com.dafiti.Questions.ValidacionRegistro;
import com.dafiti.Tasks.BusquedaXBarra;
import com.dafiti.Tasks.BusquedaXCategoria;
import com.dafiti.Tasks.IrCarroCompras;
import com.dafiti.Tasks.RegistroUsuario;
import com.dafiti.UserInterface.RegistroPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

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
        jessicajsi.attemptsTo(BusquedaXBarra.buscarProductoXBarra(),
                IrCarroCompras.irCarroDeCompras()
        );
    }

    @Then("El usuario visualizara los productos en el carrito de compras")
    public void elUsuarioVisualizaraLosProductosEnElCarritoDeCompras() {
        jessicajsi.should(seeThat("el actor puede ver la cantidad de productos comprados", ValidacionCompra.validarCompra(), Matchers.equalTo(true)));
    }

}
