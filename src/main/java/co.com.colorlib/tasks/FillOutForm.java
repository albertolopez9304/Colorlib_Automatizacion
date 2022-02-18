package co.com.colorlib.tasks;

import co.com.colorlib.model.ColorlibData;
import co.com.colorlib.userinterface.FillOutFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillOutForm implements Task {

    private ColorlibData dataForm;

    public FillOutForm(ColorlibData dataForm) {
        this.dataForm = dataForm;
    }

    public static FillOutForm withData(ColorlibData dataForm) {
        return Tasks.instrumented(FillOutForm.class, dataForm);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataForm.getRequerid()).into(FillOutFormPage.INPUT_REQUIRED),
                Enter.theValue(dataForm.getEmail()).into(FillOutFormPage.INPUT_EMAIL),
                Enter.theValue(dataForm.getPassword()).into(FillOutFormPage.INPUT_PASSWORD),
                Enter.theValue(dataForm.getPassword()).into(FillOutFormPage.INPUT_CONFIRM_PASSWORD),
                Enter.theValue(dataForm.getDate()).into(FillOutFormPage.INPUT_DATE),
                Enter.theValue(dataForm.getUrl()).into(FillOutFormPage.INPUT_URL),
                Enter.theValue(dataForm.getDigits()).into(FillOutFormPage.INPUT_DIGITS),
                Enter.theValue(dataForm.getRange()).into(FillOutFormPage.INPUT_RANGE),
                Click.on(FillOutFormPage.INPUT_POLICY),
                Click.on(FillOutFormPage.BUTTON_VALIDATE)
        );

    }
}
