package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.DatosFormularioRegistro;
import co.com.choucair.certification.proyectobase.questions.Response;
import co.com.choucair.certification.proyectobase.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinition
{
    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("A user wants to register on UTest.com webpage")
    public void unUsuarioQuiereRegistrarseEnUTestCom() throws Exception{
        OnStage.theActorCalled("Fabian").wasAbleTo(AbrirPagina.laPagina());
    }
    @When("The user enters the data to register on UTest.com webpage")
    public void elUsuarioIngresaLosDatosParaRealizarElRegistro (List<DatosFormularioRegistro> datosFormularioRegistro) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormularioRegistroUsuario.laPagina(datosFormularioRegistro),
                LlenarPaginaLocation.laPagina(datosFormularioRegistro),
                LlenarPaginaDevices.laPagina(datosFormularioRegistro),
                LlenarPaginaUltimoPaso.laPagina(datosFormularioRegistro));
    }
    @Then("Registration is complete when the Complete Setup button is pressed")
    public void elRegistroEsExitosoCuandoSeVeElBotonCompleteSetup(List<DatosFormularioRegistro> datosFormularioRegistro) throws Exception
    {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Response.aThe(datosFormularioRegistro)));
    }
}
