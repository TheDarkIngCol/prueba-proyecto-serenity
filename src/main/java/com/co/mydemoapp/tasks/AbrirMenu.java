package com.co.mydemoapp.tasks;

import com.co.mydemoapp.ui.MenuPage;
import com.co.mydemoapp.utils.EsperasUtil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AbrirMenu implements Task {

    public static AbrirMenu ahora() {
        return Tasks.instrumented(AbrirMenu.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MenuPage.MENU_ICON, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(MenuPage.MENU_ICON),
                Click.on(MenuPage.LOGIN_BUTTON)
        );
    }
}
