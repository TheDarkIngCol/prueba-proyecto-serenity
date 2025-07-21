package com.co.mydemoapp.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class AddProductPage {

    public static final Target ADD_TO_CART = Target.the("Boton de añadir al carrito")
            .located(MobileBy.xpath("//android.widget.Button[@content-desc=\"Tap to add product to cart\"]"));
}
