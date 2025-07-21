package com.co.mydemoapp.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutCompletePage {

    public static final Target MESSAGE_TEXT = Target.the("Mensaje de confirmacion de compra")
            .located(MobileBy.xpath("//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/orderTV\"]"));
}
