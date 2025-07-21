package com.co.mydemoapp.runners;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {
                "com.co.mydemoapp.hooks",
                "com.co.mydemoapp.steps",
        },
        plugin = {"pretty", "json:target/cucumber-report.json"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class TestRunner {}
