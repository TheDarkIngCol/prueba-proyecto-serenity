package com.co.mydemoapp.tasks;

import com.co.mydemoapp.ui.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarProducto implements Task {

    public static SeleccionarProducto ahora() {
        return Tasks.instrumented(SeleccionarProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductsPage.PRODUCT_BAG)
        );
    }
}
