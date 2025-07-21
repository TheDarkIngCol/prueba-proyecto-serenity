package com.co.mydemoapp.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class MenuPage {

    public static final Target MENU_ICON = Target.the("icono menú")
            .located(MobileBy.id("com.saucelabs.mydemoapp.android:id/menuIV"));

    public static final Target LOGIN_BUTTON = Target.the("boton de login")
            .located(MobileBy.xpath("//android.widget.TextView[@content-desc=\"Login Menu Item\"]"));
}
