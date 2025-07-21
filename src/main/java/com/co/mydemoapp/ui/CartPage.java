package com.co.mydemoapp.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
    public static final Target ICON_CART = Target.the("Boton del carrito")
            .located(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]"));

    public static final Target TEXT_PRODUCT = Target.the("Producto Seleccionado")
            .located(MobileBy.xpath("//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\"]"));

    public static final Target CHECKOUT_BUTTON = Target.the("Boton Checkout")
            .located(MobileBy.xpath("//android.widget.Button[@content-desc=\"Confirms products for checkout\"]"));
}
