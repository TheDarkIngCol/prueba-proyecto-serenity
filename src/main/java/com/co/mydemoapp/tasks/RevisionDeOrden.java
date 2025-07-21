package com.co.mydemoapp.tasks;

import com.co.mydemoapp.ui.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class RevisionDeOrden implements Task {

    public static RevisionDeOrden ahora() {
        return Tasks.instrumented(RevisionDeOrden.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckoutPage.BUTTON_PAYMENT)
        );
    }
}
