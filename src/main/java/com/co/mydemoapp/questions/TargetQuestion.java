package com.co.mydemoapp.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class TargetQuestion implements Question<String> {

    private final Target target;

    public TargetQuestion(Target target) {
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        WebElementFacade element = target.resolveFor(actor);
        return element.getText();
    }

    public static Question<String> title(Target target) {
        return new TargetQuestion(target);
    }
}
