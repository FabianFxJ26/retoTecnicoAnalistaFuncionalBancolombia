package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Reto tecnico automatizacion CHOUCAIR
 * Clase donde evalua el formulario que debe diligenciar el usuario con sus
 * datos personales
 * @author Elkin Fabian Alfonso Bermudez
 * @version 1.0
 */
public class FormularioRegistro
{
    //Atributo que se asocia con el campo de texto first name de la pagina UTest
    public static final Target FIRST_NAME = Target.the("Campo de texto donde el usuario diligencia"+
    "su nombre").located(By.id("firstName"));
    //Atributo que se asocia con el campo de texto last name de la pagina UTest
    public static final Target LAST_NAME= Target.the("Campo de texto donde el usuario diligencia" +
            "su apellido").located(By.id("lastName"));
    //Atributo que se asocia con el campo de texto email de la pagina UTest
    public static final Target EMAIL= Target.the("Campo de texto donde el usuario diligencia" +
            "su apellido").located(By.id("email"));
    //Atributo que se asocia con el campo de mes de nacimiento de la pagina UTest
    public static final Target MONTH= Target.the("Campo de texto donde el usuario diligencia" +
            "el mes de nacimiento").located(By.id("birthMonth"));
    //Atributo que se asocia con el campo dia de nacimiento de la pagina UTest
    public static final Target DAY= Target.the("Campo de texto donde el usuario diligencia" +
            "el anio de nacimiento").located(By.id("birthDay"));
    //Atributo que se asocia con el campo anio de nacimiento de la pagina UTest
    public static final Target YEAR= Target.the("Campo de texto donde el usuario diligencia" +
            "el anio de nacimiento").located(By.id("birthYear"));
    //Atributo que se asocia con el boton de siguiente en la pagina UTest
    public static final Target BOTON_NEXT_LOCATION= Target.the("Boton donde el usurio" +
            "da click siguiente ubicacion").located(By.xpath("//a[@class='btn btn-blue']"));
}
