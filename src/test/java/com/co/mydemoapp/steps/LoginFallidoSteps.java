package com.co.mydemoapp.steps;

import com.co.mydemoapp.tasks.Login;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.co.mydemoapp.utils.Constantes.CONTRASENA;
import static com.co.mydemoapp.utils.Constantes.USUARIO_BLOQUEADO;

public class LoginFallidoSteps {

    @When("el usuario ingresa credenciales con un usuario bloqueado")
    public void ingresaCredencialesUsuarioBloqueado() {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(Login.conCredencialesBloqueado(USUARIO_BLOQUEADO, CONTRASENA));
    }

    @Then("debe aparecer un mensaje de error indicando que el usuario está bloqueado")
    public void seMuestraMensajeDeUsuarioBloqueado() {
        Login.validarMensajeError();
    }
}
