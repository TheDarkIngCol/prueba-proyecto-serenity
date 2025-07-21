package com.co.mydemoapp.tasks;

import com.co.mydemoapp.ui.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.co.mydemoapp.utils.Constantes.*;

public class LlenarCheckout implements Task {

    public static LlenarCheckout ahora() {
        return Tasks.instrumented(LlenarCheckout.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(NOMBRE_USUARIO).into(CheckoutPage.NAME_FIELD),
                Enter.theValue(DIRECCION_USUARIO).into(CheckoutPage.ADDRESS_FIELD_1),
                Enter.theValue(DIRECCION_SECUNDARIA).into(CheckoutPage.ADDRESS_FIELD_2),
                Enter.theValue(CIUDAD).into(CheckoutPage.CITY_FIELD),
                Enter.theValue(DEPARTAMENTO).into(CheckoutPage.STATE_FIELD),
                Enter.theValue(CODIGO_ZIP).into(CheckoutPage.POSTAL_FIELD),
                Enter.theValue(PAIS).into(CheckoutPage.COUNTRY_FIELD),
                Click.on(CheckoutPage.PAYMENT_BUTTON),
                Enter.theValue(CARD_NAME).into(CheckoutPage.CARD_NAME),
                Enter.theValue(CARD_NUMBER).into(CheckoutPage.CARD_NUMBER_SELECTOR),
                Enter.theValue(EXPEDITION_DATE).into(CheckoutPage.EXPEDITION_DATE_SELECTOR),
                Enter.theValue(CODE_SECURITY).into(CheckoutPage.CODE_SECURITY_SELECTOR),
                Click.on(CheckoutPage.BUTTON_REVIEW_ORDEN)
        );
    }
}
