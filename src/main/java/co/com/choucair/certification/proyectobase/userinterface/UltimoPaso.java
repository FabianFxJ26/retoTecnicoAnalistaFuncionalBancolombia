package co.com.choucair.certification.proyectobase.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UltimoPaso
{
    public static final Target PASSWORD = Target.the("Campo donde el usuario ingresa la contrasenia")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Campo donde el usuario confirma la contrasenia")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_STAY_INFORMED = Target.the("Campo check donde se esta informado para el registro")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECK_TERMS_OF_USE = Target.the("Campo check terminos de uso")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_PRIVACY = Target.the("Campo check privacidad")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE_SETUP = Target.the("Boton donde se completa el registro")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
