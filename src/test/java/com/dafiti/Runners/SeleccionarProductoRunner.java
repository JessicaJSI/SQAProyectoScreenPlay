package com.dafiti.Runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/seleccionarProductos.feature",
        glue = "com/dafiti/StepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class SeleccionarProductoRunner {
}
