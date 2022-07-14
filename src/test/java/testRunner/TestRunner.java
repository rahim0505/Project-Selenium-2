package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = { "Features" }, 
		glue = { "steps" }, 
		dryRun = true, 
		monochrome = true, 
		//tags = "",		
		plugin = { "pretty","json:target/json-report/cucumber.json"}
		
		)

public class TestRunner {

}
