package co.com.colorlib.tasks;

import co.com.colorlib.model.ColorlibData;
import co.com.colorlib.userinterface.ColorlibLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {

    private ColorlibData dataLoguin;

    public Login(ColorlibData dataLoguin) {
        this.dataLoguin = dataLoguin;
    }

    public static Login onThePage(ColorlibData dataLoguin) {
        return Tasks.instrumented(Login.class, dataLoguin);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataLoguin.getUsername()).into(ColorlibLoginPage.INPUT_USER),
                Enter.theValue(dataLoguin.getPasswordColorlib()).into(ColorlibLoginPage.INPUT_PASSWORD),
                Click.on(ColorlibLoginPage.BUTTON_SIGN_IN),
                Check.whether(WebElementQuestion.the(ColorlibLoginPage.BUTTON_SIGN_IN), isVisible()).andIfSo(Click.on(ColorlibLoginPage.BUTTON_SIGN_IN)).otherwise()
                );

    }
}
