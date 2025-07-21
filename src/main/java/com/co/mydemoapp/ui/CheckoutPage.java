package com.co.mydemoapp.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {

    public static final Target NAME_FIELD = Target.the("nombre del usuario")
            .located(MobileBy.id("com.saucelabs.mydemoapp.android:id/fullNameET"));

    public static final Target ADDRESS_FIELD_1 = Target.the("dirección número 1")
            .located(MobileBy.id("com.saucelabs.mydemoapp.android:id/address1ET"));

    public static final Target ADDRESS_FIELD_2 = Target.the("dirección número 2")
            .located(MobileBy.id("com.saucelabs.mydemoapp.android:id/address2ET"));

    public static final Target CITY_FIELD = Target.the("ciudad del usuario")
            .located(MobileBy.id("com.saucelabs.mydemoapp.android:id/cityET"));

    public static final Target STATE_FIELD = Target.the("estado del usuario")
            .located(MobileBy.id("com.saucelabs.mydemoapp.android:id/stateET"));

    public static final Target POSTAL_FIELD = Target.the("código postal")
            .located(MobileBy.id("com.saucelabs.mydemoapp.android:id/zipET"));

    public static final Target COUNTRY_FIELD = Target.the("país")
            .located(MobileBy.id("com.saucelabs.mydemoapp.android:id/countryET"));

    public static final Target PAYMENT_BUTTON = Target.the("botón de pago")
            .located(MobileBy.xpath("//android.widget.Button[@content-desc=\"Saves user info for checkout\"]"));

    public static final Target CARD_NAME = Target.the("titular tarjeta")
            .located(MobileBy.xpath("//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/nameET\"]"));

    public static final Target CARD_NUMBER_SELECTOR = Target.the("numero de tarjeta")
            .located(MobileBy.xpath("//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/cardNumberET\"]"));

    public static final Target EXPEDITION_DATE_SELECTOR = Target.the("fecha de expedicion")
            .located(MobileBy.xpath("//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/expirationDateET\"]"));

    public static final Target CODE_SECURITY_SELECTOR = Target.the("codigo de seguridad")
            .located(MobileBy.xpath("//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/securityCodeET\"]"));

    public static final Target BUTTON_REVIEW_ORDEN = Target.the("boton de finalizar")
            .located(MobileBy.xpath("//android.widget.Button[@content-desc=\"Saves payment info and launches screen to review checkout data\"]"));

    public static final Target BUTTON_PAYMENT = Target.the("boton de finalizar pago")
            .located(MobileBy.id("com.saucelabs.mydemoapp.android:id/paymentBtn"));
}
