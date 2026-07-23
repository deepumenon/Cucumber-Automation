package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features= {"src/test/java/Features/"} ,
		dryRun = false,
		glue = {"stepDefinition", "hooks"},
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		plugin = {
				"pretty",
		        "html:target/cucumber-reports.html",
		        "json:target/cucumber.json", // <-- THIS IS REQUIRED FOR JENKINS
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		//tags = "@smoke"
		
		
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
