package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
@DefaultUrl("https://utest.com")
public class InicioPagina extends PageObject {
    public static final Target BOTON_JOIN_TODAY = Target.the("Boton para disparar " +
            "el proceso de registro usuario").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
