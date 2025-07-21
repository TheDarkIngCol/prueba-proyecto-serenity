package com.co.mydemoapp.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target USER_INPUT = Target.the("Input de usuario")
            .located(MobileBy.xpath("//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/nameET\"]"));

    public static final Target USER_PASSWORD = Target.the("Input de contraseña")
            .located(MobileBy.xpath("//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/passwordET\"]"));

    public static final Target LOGIN_BUTTON = Target.the("boton de login")
            .located(MobileBy.xpath("//android.widget.Button[@content-desc=\"Tap to login with given credentials\"]"));

    public static final Target MENSAJE_ERROR = Target.the("mensaje de error")
            .located(MobileBy.id("com.saucelabs.mydemoapp.android:id/passwordErrorTV"));
}
