package co.com.saucedemo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/inicioDeSesion.feature",
        glue = "co.com.saucedemo.stepDefinitions",
        plugin = {"rerun:target/rerunFailed/inicioDeSesionRerun", "pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class InicioDeSesionRunner {
}
