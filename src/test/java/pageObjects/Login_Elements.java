package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.DriverInstance;

public class Login_Elements {
	
	DriverInstance context;
    public Login_Elements(DriverInstance context) {
	this.context=context;
    PageFactory.initElements(context.getDriver(), this);

}
	
	@FindBy(xpath = "(//input[@type='email' and @name='email'])[1]")
	WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[text()='Login']")
	WebElement Login_btn;
	
	@FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
	WebElement ErrorMsg;
	
	

	public void enter_Username(String Username) {
		username.sendKeys(Username);
	}
	
	public void enter_Password(String Password) {
		password.sendKeys(Password);
		
	}
	
	public void click_Login_Btn() {
		
		Login_btn.click();
	}
	
	public String errorMessage() {
		
	return ErrorMsg.getText();	
	}
	
}

