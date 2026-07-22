package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.DriverInstance;

public class ProductsPage_Elements {
	
	DriverInstance context;

	 public ProductsPage_Elements(DriverInstance context) {
		this.context = context;
		PageFactory.initElements(context.getDriver(), this);

	}
	

	@FindBy(xpath = ".//input[@id='search_product']")
	WebElement searchbox;
	
	@FindBy(xpath = ".//button[@id='submit_search']")
	WebElement searchbtn;
	
	@FindBy(xpath = "(//a[contains(text(),'View Product')])[1]")
	WebElement viewproduct;
	
	@FindBy(xpath = ".//input[@name='quantity']")
	WebElement quantity;
	
	@FindBy(xpath = "//button[@type='button' and contains(.,'Add to cart')]")
	WebElement addToCart;
	
	@FindBy(xpath = "//a[u[text()='View Cart']]")
	WebElement viewCart;
	

	
	public void serachBox(String product) {
		searchbox.sendKeys(product);;
		
	}
	
	public void searchBtn() {
		searchbtn.click();
		
	}
	
	public void viewproduct() {
		viewproduct.click();
		
	}
	
	public void quantity() {
		
		quantity.sendKeys("2");
	}

	public void addToCart() {
		addToCart.click();
		
	}
	
	public void viewCart() {
		
		viewCart.click();
	}
	
}
