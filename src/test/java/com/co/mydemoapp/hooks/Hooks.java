package com.co.mydemoapp.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Managed(driver = "appium")
    WebDriver driver;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Usuario").can(BrowseTheWeb.with(driver));
    }
}
