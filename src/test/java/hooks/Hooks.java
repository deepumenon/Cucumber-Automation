package hooks;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driver.DriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends DriverInstance {

	DriverInstance context;

	public Hooks(DriverInstance context) {
		this.context =context;

	}

	@BeforeStep
	public void beforeTest(Scenario scenario) {
		// scenario.log("Before - Deepak");
		System.out.println("Scenario Name: " + scenario.getName());
	}

	@AfterStep
	public void afterTest(Scenario scenario) {
		// scenario.log("After - Deepak");

	}

	@Before
	public void beforeScenario(Scenario scenario) {
		WebDriver driver = new ChromeDriver();
		context.setDriver(driver);
		
		context.getDriver().get("https://automationexercise.com/");
		context.getDriver().manage().window().maximize();
		context.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// System.out.println("TestNG Print");

		// String scenarioname = scenario.getName();
		// System.out.println(scenarioname);

	}

	@After
	public void afterScenario(Scenario scenario) {

		Boolean failed = scenario.isFailed();
		// System.out.println(failed);
		if (failed) {
			byte[] ScreenshotAS = ((TakesScreenshot) context.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(ScreenshotAS, "image/png", "Screenshot");
		}
		System.out.println("Result: " + scenario.getStatus());
		context.getDriver().quit();
	}

}
