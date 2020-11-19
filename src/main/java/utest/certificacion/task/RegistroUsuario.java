package utest.certificacion.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utest.certificacion.userinterfaces.FormularioUtest;
import utest.certificacion.userinterfaces.HomeUtest;

public class RegistroUsuario implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomeUtest.BTN_REGISTRO),
                Enter.theValue("Cristian").into(FormularioUtest.TXT_PRIMERNOMBRE),
                Enter.theValue("Guerra").into(FormularioUtest.TXT_APELLLIDO),
                Enter.theValue("criguex@gmail.com").into(FormularioUtest.TXT_CORREO));

    }
    public static RegistroUsuario registro(){
        return Tasks.instrumented(RegistroUsuario.class);
    }
}
