package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.DriverInstance;

public class Header_Elements {

	DriverInstance context;
    public Header_Elements(DriverInstance context) {
	this.context=context;
    PageFactory.initElements(context.getDriver(), this);

}
    @FindBy(xpath = "//a[contains(text(),'Signup / Login')]")
    WebElement Login_link;
    
	@FindBy(xpath = "//a[contains(.,'Home')]")
	WebElement home;
	
	@FindBy(xpath = "//a[contains(.,'Products')]")
	WebElement products;
	
	@FindBy(xpath = "//a[contains(.,'Cart')]")
	WebElement cart;
	
	@FindBy(xpath = "//a[contains(.,'Logged in as')]/b[text()='deepak']")
	WebElement loggedin_username;
	
	
	
	public void homePage() {
		
		home.click();
	}
	
	public void productsPage() {
		
		products.click();
		
	}
	
	public void cartPage() {
		
		cart.click();
	}
	
	public String loggedinusername() {

		return loggedin_username.getText();
		
	}

	public void click_login_link() {
		
		Login_link.click();
	}

}
