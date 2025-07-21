package com.co.mydemoapp.steps;

import com.co.mydemoapp.tasks.AbrirMenu;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;

public class MenuSteps {

    @Given("el usuario navega al login desde el menú")
    public void elUsuarioNavegaAlLoginDesdeElMenu() {

        OnStage.theActorInTheSpotlight().attemptsTo(AbrirMenu.ahora());
    }
}
