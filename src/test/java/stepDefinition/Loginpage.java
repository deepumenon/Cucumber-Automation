package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import driver.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Header_Elements;
import pageObjects.Login_Elements;

public class Loginpage{


	DriverInstance context;
	Login_Elements login;
	Header_Elements header;
	

	public Loginpage(DriverInstance context) {
		this.context =context;
		 login= new  Login_Elements(context);
		 header = new Header_Elements(context);
		 


	}

		 //WebDriver driver;
		
		 
		@And("user clicks on login link")
		public void userClicksOnLoginLink() {			
			
			header.click_login_link();
		}

		@When("user clicks the login button")
		public void userClicksTheLoginButton() {
			login.click_Login_Btn();

		}

		@Then("login should be success")
		public void loginShouldBeSuccess() {
			String Text = header.loggedinusername();
			System.out.println(Text);
		}

		@Given("user enters the password as pass")
		public void userEntersThePasswordAsPass() {
			
			//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Deepak123");
			context.getDriver().findElement(By.xpath("//input[@type='password']")).sendKeys("Deepak123");;

		}

		@Then("login should be fail")
		public void loginShouldBeFail() {
			String Errmsg = login.errorMessage();

			Assert.assertEquals(Errmsg, "Your email or password is incorrect!");

		}

		@Given("user enters the username as {string}")
		public void userEntersTheUsernameAs(String username) {
			login.enter_Username(username);
			

		}

		@Given("user enters the password as {string}")
		public void userEntersThePasswordAs(String password) {
			login.enter_Password(password);

		}

	
}
