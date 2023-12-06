package TestRunner;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/features",
        glue={"Stepdefs","Utils"},
        monochrome = true,
        plugin = {"html:report/WebReport"},
        tags ="@well"
)

public class TestRunner {


}
