package com.co.mydemoapp.tasks;

import com.co.mydemoapp.ui.CartPage;
import com.co.mydemoapp.ui.MenuPage;
import com.co.mydemoapp.utils.EsperasUtil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static com.co.mydemoapp.utils.Constantes.CONTRASENA;
import static com.co.mydemoapp.utils.Constantes.USUARIO;

public class FlujoE2ECarrito implements Task {

    public static FlujoE2ECarrito ahora() {
        return Tasks.instrumented(FlujoE2ECarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AbrirMenu.ahora(),
                Login.conCredencialesExitoso(USUARIO, CONTRASENA),
                SeleccionarProducto.ahora(),
                AgregarAlCarrito.ahora(),
                IngresarAlCarrito.ahora()
        );
        IngresarAlCarrito.obtenerMensaje();
    }


}
