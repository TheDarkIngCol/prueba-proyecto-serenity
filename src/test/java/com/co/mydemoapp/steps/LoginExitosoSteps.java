package com.co.mydemoapp.steps;

import com.co.mydemoapp.tasks.Login;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.co.mydemoapp.utils.Constantes.CONTRASENA;
import static com.co.mydemoapp.utils.Constantes.USUARIO;

public class LoginExitosoSteps {

    @When("el usuario ingresa credenciales válidas")
    public void ingresarCredencialesValidas() {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(Login.conCredencialesExitoso(USUARIO, CONTRASENA));
    }

    @Then("el usuario es redirigido a la pantalla principal")
    public void validarPantallaPrincipal() {
        // Validación pendiente, puedes agregar un Question para verificar pantalla
    }
}
