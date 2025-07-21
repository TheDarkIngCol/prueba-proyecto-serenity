package com.co.mydemoapp.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class AbrirApp implements Task {

    public static AbrirApp on(Target bagProduct) {
        return Tasks.instrumented(AbrirApp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    }
}
