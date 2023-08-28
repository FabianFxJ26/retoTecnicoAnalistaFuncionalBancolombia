package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.model.DatosFormularioRegistro;
import co.com.choucair.certification.proyectobase.userinterface.UltimoPaso;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


import java.util.List;

public class Response implements Question<Boolean>
{
    private List<DatosFormularioRegistro> datosFormularioRegistro;

    public Response(List<DatosFormularioRegistro> datosFormularioRegistro) {
        this.datosFormularioRegistro = datosFormularioRegistro;
    }
    public static Response aThe(List<DatosFormularioRegistro> datosFormularioRegistro)
    {
        return new Response(datosFormularioRegistro);
    }
    @Override
    public Boolean answeredBy(Actor actor)
    {
        String buttonTextCompleteSetup = Text.of(UltimoPaso.COMPLETE_SETUP).viewedBy(actor).asString();
        System.out.println("El valor de complete test es: " +datosFormularioRegistro.get(0).getExit().equals(buttonTextCompleteSetup));
        return datosFormularioRegistro.get(0).getExit().equals(buttonTextCompleteSetup);
    }
}
