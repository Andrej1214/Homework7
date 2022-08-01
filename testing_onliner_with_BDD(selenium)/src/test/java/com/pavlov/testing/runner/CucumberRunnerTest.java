package com.pavlov.testing.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        monochrome = true,
        glue = "com.pavlov.testing",
        features = "src/test/resources/com.pavlov.testing.features"
)
public class CucumberRunnerTest {
}
