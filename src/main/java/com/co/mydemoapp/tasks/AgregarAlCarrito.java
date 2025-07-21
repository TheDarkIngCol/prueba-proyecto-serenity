package com.co.mydemoapp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.mydemoapp.ui.AddProductPage.ADD_TO_CART;

public class AgregarAlCarrito implements Task {

    public static AgregarAlCarrito ahora() {
        return Tasks.instrumented(AgregarAlCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ADD_TO_CART)
        );
    }

}
