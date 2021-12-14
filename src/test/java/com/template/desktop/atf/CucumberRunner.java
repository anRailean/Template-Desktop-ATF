package com.template.desktop.atf;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber/cucumber.json", "html:target/cucumber/test-report.html"},
        features = "classpath:features/",
        tags = "@Example",
        glue = {"classpath:com.template.desktop.atf.stepdef"}
)
public class CucumberRunner {
}