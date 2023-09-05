package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class Direccion
{
    public static final Target CITY=Target.the("Campo donde el usuario diligenciala ciudad")
            .located(By.id("city"));
    public static final Target POSTAL_CODE=Target.the("Campo donde el usuario diligencia el codigo postal")
            .located(By.id("zip"));
    public static final Target CONTAINER_COUNTRY=Target.the("Lista paises")
        .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target COUNTRY=Target.the("Campo seleccion pais")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target DEVICES= Target.the("Boton donde el usurio" +
            "da click y se redirige a dispositivos").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
