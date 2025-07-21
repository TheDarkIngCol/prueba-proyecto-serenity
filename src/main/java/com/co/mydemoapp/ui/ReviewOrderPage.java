package com.co.mydemoapp.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class ReviewOrderPage {

    public static final Target BUTTON_PLACE_ORDER = Target.the("Boton de revision de orden")
            .located(MobileBy.xpath("//android.widget.Button[@content-desc=\"Completes the process of checkout\"]"));
}
