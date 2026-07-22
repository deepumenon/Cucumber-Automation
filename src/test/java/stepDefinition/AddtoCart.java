package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import driver.DriverInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Header_Elements;
import pageObjects.Login_Elements;
import pageObjects.ProductsPage_Elements;
import utils.ReadExcel;

public class AddtoCart {

	DriverInstance context;
	Login_Elements login;
	Header_Elements header;
	ProductsPage_Elements products;
	
	
	
	public AddtoCart(DriverInstance context) {
		this.context = context;
		
		login = new Login_Elements(context);
		header = new Header_Elements(context);
		products = new ProductsPage_Elements(context);
			
	}
	
	@Given("login to application as {string} and {string}")
	public void loginToApplicationAsAnd(String username, String password) {
		header.click_login_link();
		login.enter_Username(username);
		login.enter_Password(password);
		login.click_Login_Btn();
	 
	}
	@Given("Navigate to product and Search as {string}")
	public void navigateToProductAndSearchAs(String product) {
	
		header.productsPage();
		products.serachBox(product);
		products.searchBtn();
		
	}
	@When("User should add the product to cart")
	public void userShouldAddTheProductToCart() {
		products.viewproduct();
		products.quantity();
		products.addToCart();
		
	
	}
	@Then("verify product added to cart {string}")
	public void verifyProductAddedToCart(String product) throws IOException {
		
		products.viewCart();
		String verifyProduct= context.getDriver().findElement(By.xpath("//a[text()='Men Tshirt']")).getText();
				  Assert.assertEquals(verifyProduct, product);
				  System.out.println("Product validation successful");  
					ReadExcel excel = new ReadExcel();
					excel.Excel();	
		
	}
	
	
	
}
