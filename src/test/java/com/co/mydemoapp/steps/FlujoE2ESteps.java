package com.co.mydemoapp.steps;

import com.co.mydemoapp.tasks.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class FlujoE2ESteps {

    @When("el usuario realiza un flujo completo")
    public void flujoCompleto() {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        FlujoE2E.ahora()
                );
    }

    @Then("finaliza la compra del producto seleccionado")
    public void compraSatisfactoria() {

    }
}
