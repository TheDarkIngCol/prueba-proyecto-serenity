package com.co.mydemoapp.tasks;

import com.co.mydemoapp.questions.TargetQuestion;
import com.co.mydemoapp.ui.CheckoutCompletePage;
import com.co.mydemoapp.ui.CheckoutPage;
import com.co.mydemoapp.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.logging.Logger;

public class OrdenFinalizada implements Task {

    public static OrdenFinalizada ahora() {
        return Tasks.instrumented(OrdenFinalizada.class);
    }

    public static String validarMensajeDeCheckout() {
        Actor actor = OnStage.theActorInTheSpotlight();
        String mensaje = TargetQuestion.title(CheckoutCompletePage.MESSAGE_TEXT).answeredBy(actor);
        Logger.getLogger(Login.class.getName()).info("Mensaje de checkout exitoso: " + mensaje);
        return mensaje;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        );
    }
}
