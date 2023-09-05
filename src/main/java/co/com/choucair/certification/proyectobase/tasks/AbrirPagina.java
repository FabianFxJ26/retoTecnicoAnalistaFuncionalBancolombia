package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.InicioPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;


public class AbrirPagina implements Task {
    private InicioPagina pagina;
    public static AbrirPagina laPagina()
    {
      return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
          actor.attemptsTo(Open.browserOn(pagina), Click.on((InicioPagina.BOTON_JOIN_TODAY)));
    }
}
