package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

/**
 * Reto tecnico automatizacion CHOUCAIR
 * Clase donde evalua las precondiciones para iniciar el caso de prueba
 * @author Elkin Fabian Alfonso Bermudez
 * @version 1.0
 */
/*
* URL pagina para iniciar caso de prueba*/
@DefaultUrl("https://utest.com")
public class InicioPagina extends PageObject {
    /*
    * Uso localizador para ubicar el boton Join Today
    * */
    public static final Target BOTON_JOIN_TODAY = Target.the("Boton para disparar " +
            "el proceso de registro usuario").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
