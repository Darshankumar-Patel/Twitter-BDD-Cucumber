package utils;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import gherkin.formatter.model.Feature;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/resources",glue = {"stepDefs"},plugin = "json:target/cucmber.json",tags = "@RunThis")


public class RunCuckesTest {

}
