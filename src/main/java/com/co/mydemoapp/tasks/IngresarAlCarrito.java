package com.co.mydemoapp.tasks;

import com.co.mydemoapp.questions.TargetQuestion;
import com.co.mydemoapp.ui.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.logging.Logger;

import static com.co.mydemoapp.ui.CartPage.CHECKOUT_BUTTON;
import static com.co.mydemoapp.ui.CartPage.ICON_CART;
import static org.assertj.core.api.Assertions.assertThat;

public class IngresarAlCarrito implements Task {

    public static IngresarAlCarrito ahora() {
        return Tasks.instrumented(IngresarAlCarrito.class);
    }

    public static String obtenerMensaje() {
        Actor actor = OnStage.theActorInTheSpotlight();
        String mensaje = TargetQuestion.title(CartPage.TEXT_PRODUCT).answeredBy(actor);
        assertThat(mensaje).contains("Sauce Labs Backpack");
        Logger.getLogger(Login.class.getName()).info("El producto que selecciono es: " + mensaje);
        return mensaje;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ICON_CART)
        );
    }

}
