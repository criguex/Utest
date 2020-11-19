package utest.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUtest {
    public static final Target BTN_REGISTRO=Target.the("boton de registro").located(By.xpath("//*[@class='unauthenticated-nav-bar__sign-up']"));
}
