package com.co.mydemoapp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.mydemoapp.ui.CartPage.CHECKOUT_BUTTON;
import static com.co.mydemoapp.utils.Constantes.CONTRASENA;
import static com.co.mydemoapp.utils.Constantes.USUARIO;

public class FlujoE2E implements Task {

    public static FlujoE2E ahora() {
        return Tasks.instrumented(FlujoE2E.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AbrirMenu.ahora(),
                Login.conCredencialesExitoso(USUARIO, CONTRASENA),
                SeleccionarProducto.ahora(),
                AgregarAlCarrito.ahora(),
                IngresarAlCarrito.ahora(),
                Click.on(CHECKOUT_BUTTON),
                LlenarCheckout.ahora(),
                RevisionDeOrden.ahora()
        );
        OrdenFinalizada.validarMensajeDeCheckout();
    }
}
