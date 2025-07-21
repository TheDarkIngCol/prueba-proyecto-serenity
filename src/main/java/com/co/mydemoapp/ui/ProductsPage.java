package com.co.mydemoapp.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class ProductsPage {

    public static final Target PRODUCT_BAG = Target.the("Producto Maleta")
            .located(MobileBy.xpath("(//android.widget.ImageView[@content-desc=\"Product Image\"])[1]"));

}
