package framework;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/site/cucumber-pretty"},

        features = {"src/test/resources/features"},
        tags = {"@scroll"},
        glue = {"stepdefinition"}
)

public class TestRunner {


}
