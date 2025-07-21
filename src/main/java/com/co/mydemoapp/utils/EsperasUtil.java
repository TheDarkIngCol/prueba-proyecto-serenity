package com.co.mydemoapp.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;

public class EsperasUtil {

    public static void esperarVisibilidad(Actor actor, Target target, int segundos) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(segundos));
        wait.until(ExpectedConditions.visibilityOf(target.resolveFor(actor)));
    }

    public static void esperarClickeable(Actor actor, Target target, int segundos) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(segundos));
        wait.until(ExpectedConditions.elementToBeClickable(target.resolveFor(actor)));
    }
}
