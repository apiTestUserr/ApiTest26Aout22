package www.helper.fr;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions (
		
		
		
		features = "src/test/resources/Authentication.feature",
		
		glue ="www.orange.hrrm.stepDefinitions",
		
		plugin = { "pretty", "html:target/cucumberOrangeHRM-report.html"}
		
		
		)




public class Runner {

}
