package utest.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioUtest {
    public static final Target TXT_PRIMERNOMBRE=Target.the("Caja de texto primer nombre").located(By.xpath("//*[@id='firstName']"));
    public static final Target TXT_APELLLIDO=Target.the("Caja de texto primer apellido").located(By.xpath("//*[@id='lastName']"));
    public static final Target TXT_CORREO=Target.the("Caja de texto primer apellido").located(By.xpath("//*[@id='email']"));

}
