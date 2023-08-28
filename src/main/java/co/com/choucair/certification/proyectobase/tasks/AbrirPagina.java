package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.InicioPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

/**
 * Reto tecnico automatizacion CHOUCAIR
 * Clase donde se verifica que el usuario halla realizado la accion de abrir la pagina
 * @author Elkin Fabian Alfonso Bermudez
 * @version 1.0
 */
public class AbrirPagina implements Task {
    private InicioPagina pagina;
    public static AbrirPagina laPagina()
    {
      return Tasks.instrumented(AbrirPagina.class);
    }
    /*
    * Funcion que confirma que el usuario abrio la pagina y dio click sobre el boton JOIN TODAY
    * */
    @Override
    public <T extends Actor> void performAs(T actor) {
          actor.attemptsTo(Open.browserOn(pagina), Click.on((InicioPagina.BOTON_JOIN_TODAY)));
    }
}
