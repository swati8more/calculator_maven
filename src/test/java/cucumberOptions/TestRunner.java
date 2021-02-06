package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\Akshay\\eclipse-workspace\\Calculator_automation\\src\\test\\java\\features\\Calculations.feature",
		glue= "stepDefinition")
public class TestRunner {

}
