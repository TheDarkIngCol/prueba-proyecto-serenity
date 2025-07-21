package com.co.mydemoapp.steps;

import com.co.mydemoapp.tasks.FlujoE2ECarrito;
import com.co.mydemoapp.tasks.SeleccionarProducto;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class AgregarProductoSteps {

    @When("el usuario selecciona un producto")
    public void seleccionarElProducto() {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        FlujoE2ECarrito.ahora()
                );
    }

    @Then("el usuario se agregara en el carrito de compras")
    public void carritoConProducto() {

    }
}
