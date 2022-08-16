package com.dafiti.StepDefinitions;

import com.dafiti.Questions.ValidacionRegistro;
import com.dafiti.Tasks.RegistroUsuario;
import com.dafiti.UserInterface.RegistroPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegistroStepDefinition {

    @Managed (driver = "firefox")
    private WebDriver navegador;
    private Actor jessicajsi = Actor.named("jessicajsi");

    private RegistroPage registroPage = new RegistroPage();

    @Before
    public void configuracion (){
        jessicajsi.can(BrowseTheWeb.with(navegador)); //indica que el actor puede abrir el navegador
    }

    @Given("Que el usuario se encuentre en la pagina web")
    public void queElUsuarioSeEncuentreEnLaPaginaWeb() {
        jessicajsi.wasAbleTo(Open.browserOn(registroPage));
    }

    @When("El usuario registra los datos solicitados para crear su cuenta")
    public void elUsuarioRegistraLosDatosSolicitadosParaCrearSuCuenta() {
        jessicajsi.attemptsTo(RegistroUsuario.informacionRegistro());
    }

    @Then("El usuario visualizara la pagina de inicio")
    public void elUsuarioVisualizaraLaPaginaDeInicio() {
        jessicajsi.should(seeThat("el actor puede ver", ValidacionRegistro.validarRegistro(), Matchers.equalTo(true)));
    }
}
