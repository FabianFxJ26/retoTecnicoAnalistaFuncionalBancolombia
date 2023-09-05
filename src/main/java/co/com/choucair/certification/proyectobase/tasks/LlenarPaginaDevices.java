package co.com.choucair.certification.proyectobase.tasks;


import co.com.choucair.certification.proyectobase.model.DatosFormularioRegistro;
import co.com.choucair.certification.proyectobase.userinterface.Dispositivos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.certification.proyectobase.userinterface.Dispositivos.*;

/**
 * Reto tecnico automatizacion CHOUCAIR
 * Clase donde se evalua la tarea llenar formulario dispositivos
 * datos personales
 * @author Elkin Fabian Alfonso Bermudez
 * @version 1.0
 */
public class LlenarPaginaDevices implements Task
{
  private List<DatosFormularioRegistro> datosFormularioRegistro;
    public LlenarPaginaDevices(List<DatosFormularioRegistro> datosFormularioRegistro) {
        this.datosFormularioRegistro = datosFormularioRegistro;
    }
    public static LlenarPaginaDevices laPagina(List<DatosFormularioRegistro> datosFormularioRegistro)
    {
        return Tasks.instrumented(LlenarPaginaDevices.class,datosFormularioRegistro);
    }
    @Override
    public <T extends Actor> void performAs(T actor)
    {
      actor.attemptsTo(
              Click.on(CONTAINER_COMPUTER),
              Enter.theValue(datosFormularioRegistro.get(0).getComputer()).into(COMPUTER),
              Hit.the(Keys.ARROW_DOWN).into(COMPUTER),
              Hit.the(Keys.ENTER).into(COMPUTER),
              Click.on(CONTAINER_VERSION),
              Enter.theValue(datosFormularioRegistro.get(0).getVersion()).into(VERSION),
              Hit.the(Keys.ARROW_DOWN).into(VERSION),
              Hit.the(Keys.ENTER).into(VERSION),
              Click.on(CONTAINER_LANGUAGE),
              Enter.theValue(datosFormularioRegistro.get(0).getLanguage()).into(LANGUAGE),
              Hit.the(Keys.ARROW_DOWN).into(LANGUAGE),
              Hit.the(Keys.ENTER).into(LANGUAGE),
              Click.on(CONTAINER_MOBILE_DEVICE),
              Enter.theValue(datosFormularioRegistro.get(0).getMobileDevice()).into(MOBILE_DEVICE),
              Hit.the(Keys.ARROW_DOWN).into(MOBILE_DEVICE),
              Hit.the(Keys.ENTER).into(MOBILE_DEVICE),
              Click.on(CONTAINER_MODEL),
              Enter.theValue(datosFormularioRegistro.get(0).getModel()).into(MODEL),
              Hit.the(Keys.ARROW_DOWN).into(MODEL),
              Hit.the(Keys.ENTER).into(MODEL),
              Click.on(CONTAINER_OPERATING_SYSTEM),
              Enter.theValue(datosFormularioRegistro.get(0).getOperatingSystem()).into(OPERATING_SYSTEM),
              Hit.the(Keys.ARROW_DOWN).into(OPERATING_SYSTEM),
              Hit.the(Keys.ENTER).into(OPERATING_SYSTEM),
              Click.on(LAST_STEP)
      );
    }
}
