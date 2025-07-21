package com.co.mydemoapp.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.core.pages.WebElementState;
import org.hamcrest.Matcher;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EsperasTarget implements Interaction {

    private static final int TIMEOUT = 60;
    private final Target target;
    private final Matcher<WebElementState> matcher;
    private final int timeout;

    public EsperasTarget(Target target, Matcher<WebElementState> matcher, int timeout) {
        this.target = target;
        this.matcher = matcher;
        this.timeout = timeout;
    }

    public static Performable esperarElemento(Target target, Matcher<WebElementState> matcher) {
        return instrumented(EsperasTarget.class, target, matcher, TIMEOUT);
    }

    public static Performable tiempoEspera(Target target, Matcher<WebElementState> matcher, int timeout) {
        return instrumented(EsperasTarget.class, target, matcher, timeout);
    }

    @Override
    public <A extends Actor> void performAs(A actor) {
        actor.attemptsTo(
                WaitUntil.the(target, matcher)
                        .forNoMoreThan(timeout)
                        .seconds()
        );
    }
}
