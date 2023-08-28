package co.com.choucair.certification.proyectobase.runners;

/**
 * Reto tecnico automatizacion CHOUCAIR
 * @author Elkin Fabian Alfonso Bermudez
 * @version 1.0
 */
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/registroUsuario.feature",
        tags = "@stories",
        glue = "co.com.choucair.certification.proyectobase.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags
{

}
