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


public class LlenarFormularioRegistroUsuario implements Task
{
    public List<DatosFormularioRegistro> datosFormularioRegistros;


    public LlenarFormularioRegistroUsuario(List<DatosFormularioRegistro> datosFormularioRegistros) {
        this.datosFormularioRegistros = datosFormularioRegistros;
    }
    public static LlenarFormularioRegistroUsuario laPagina(List<DatosFormularioRegistro> datosFormularioRegistros)
    {
        return Tasks.instrumented(LlenarFormularioRegistroUsuario.class, datosFormularioRegistros);
    }
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
