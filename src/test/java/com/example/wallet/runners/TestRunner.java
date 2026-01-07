package com.example.wallet.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * This is the entry point for running Cucumber tests with TestNG.
 * It wires together - Feature files, Step definitions and Reporting plugins
 */
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.example.wallet.steps"},
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber-report.json"
        },
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
