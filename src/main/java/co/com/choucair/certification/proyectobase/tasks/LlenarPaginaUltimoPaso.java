package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.DatosFormularioRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.certification.proyectobase.userinterface.UltimoPaso.*;

public class LlenarPaginaUltimoPaso implements Task
{
    public List<DatosFormularioRegistro> datosFormularioRegistro;
    public LlenarPaginaUltimoPaso(List<DatosFormularioRegistro> datosFormularioRegistro) {
        this.datosFormularioRegistro = datosFormularioRegistro;
    }
    public static LlenarPaginaUltimoPaso laPagina(List<DatosFormularioRegistro> datosFormularioRegistro)
    {
      return Tasks.instrumented(LlenarPaginaUltimoPaso.class,datosFormularioRegistro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Enter.theValue(datosFormularioRegistro.get(0).getPassword()).into(PASSWORD),
                    Enter.theValue(datosFormularioRegistro.get(0).getPassword()).into(CONFIRM_PASSWORD),
                    Click.on(CHECK_STAY_INFORMED),
                    Click.on(CHECK_TERMS_OF_USE),
                    Click.on(CHECK_PRIVACY),
                    Click.on(COMPLETE_SETUP));
    }
}
