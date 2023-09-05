package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class FormularioRegistro
{
    public static final Target FIRST_NAME = Target.the("Campo de texto donde el usuario diligencia"+
    "su nombre").located(By.id("firstName"));
    public static final Target LAST_NAME= Target.the("Campo de texto donde el usuario diligencia" +
            "su apellido").located(By.id("lastName"));
    public static final Target EMAIL= Target.the("Campo de texto donde el usuario diligencia" +
            "su apellido").located(By.id("email"));
    public static final Target MONTH= Target.the("Campo de texto donde el usuario diligencia" +
            "el mes de nacimiento").located(By.id("birthMonth"));
    public static final Target DAY= Target.the("Campo de texto donde el usuario diligencia" +
            "el anio de nacimiento").located(By.id("birthDay"));
    public static final Target YEAR= Target.the("Campo de texto donde el usuario diligencia" +
            "el anio de nacimiento").located(By.id("birthYear"));
    public static final Target BOTON_NEXT_LOCATION= Target.the("Boton donde el usurio" +
            "da click siguiente ubicacion").located(By.xpath("//a[@class='btn btn-blue']"));
}
