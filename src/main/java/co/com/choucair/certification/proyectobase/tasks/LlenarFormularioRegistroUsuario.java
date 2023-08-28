package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.DatosFormularioRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.certification.proyectobase.userinterface.FormularioRegistro.*;

/**
 * Reto tecnico automatizacion CHOUCAIR
 * Clase donde se evalua la tarea llenar formulario registro usuario
 * datos personales
 * @author Elkin Fabian Alfonso Bermudez
 * @version 1.0
 */
public class LlenarFormularioRegistroUsuario implements Task
{
    public List<DatosFormularioRegistro> datosFormularioRegistros;

    /**
     * Constructor de la clase donde creo lista compuesta datos formulario de registro
     * @param datosFormularioRegistros
     */
    public LlenarFormularioRegistroUsuario(List<DatosFormularioRegistro> datosFormularioRegistros) {
        this.datosFormularioRegistros = datosFormularioRegistros;
    }
    public static LlenarFormularioRegistroUsuario laPagina(List<DatosFormularioRegistro> datosFormularioRegistros)
    {
        return Tasks.instrumented(LlenarFormularioRegistroUsuario.class, datosFormularioRegistros);
    }

    /**
     * El actor ingresa el valor de todos los campo del formulario de registro de usuario al array datosFormulario
     * @param actor
     * @param <T>
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datosFormularioRegistros.get(0).getFirstName()).into(FIRST_NAME),
        Enter.theValue(datosFormularioRegistros.get(0).getLastName()).into(LAST_NAME),
        Enter.theValue(datosFormularioRegistros.get(0).getEmail()).into(EMAIL),
                SelectFromOptions.byVisibleText(datosFormularioRegistros.get(0).getBirthMonth()).from(MONTH),
                SelectFromOptions.byVisibleText(datosFormularioRegistros.get(0).getBirthDay()).from(DAY),
                SelectFromOptions.byVisibleText(datosFormularioRegistros.get(0).getBirthYear()).from(YEAR),
                Click.on(BOTON_NEXT_LOCATION));
    }
}
