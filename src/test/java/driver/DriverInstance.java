package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.ReadExcel;

public class DriverInstance {

	private WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
}
