package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.DatosFormularioRegistro;
import co.com.choucair.certification.proyectobase.userinterface.Direccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;
/**
 * Reto tecnico automatizacion CHOUCAIR
 * Clase donde se realiza las acciones sobre el formulario interfaz locacion
 * datos personales
 * @author Elkin Fabian Alfonso Bermudez
 * @version 1.0
 */
public class LlenarPaginaLocation implements Task
{
    public List<DatosFormularioRegistro> datoFormularioRegistro;

    /**
     * Constructor de la clase
     * @param datoFormularioRegistro
     */
    public LlenarPaginaLocation(List<DatosFormularioRegistro> datoFormularioRegistro) {
        this.datoFormularioRegistro = datoFormularioRegistro;
    }
    public static LlenarPaginaLocation laPagina (List<DatosFormularioRegistro> datoFormularioRegistro)
    {
         return Tasks.instrumented(LlenarPaginaLocation.class,datoFormularioRegistro);
    }
    /**
     * El actor ingresa el valor de todos los campo del formulario de location al array datosFormulario
     * @param actor
     * @param <T>
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
     actor.attemptsTo(Enter.theValue(datoFormularioRegistro.get(0).getCity()).into(Direccion.CITY),
             Hit.the(Keys.ARROW_DOWN).into(Direccion.CITY),
             Hit.the(Keys.ENTER).into(Direccion.CITY),
             Enter.theValue(datoFormularioRegistro.get(0).getPostalCode()).into(Direccion.POSTAL_CODE),
             Click.on(Direccion.CONTAINER_COUNTRY),
             Enter.theValue(datoFormularioRegistro.get(0).getCountry()).into(Direccion.COUNTRY),
             Click.on(Direccion.DEVICES));
    }
}
