package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.DriverInstance;

public class HomePage_Elements {

	DriverInstance context;

	public HomePage_Elements(DriverInstance context) {
		this.context = context;
		PageFactory.initElements(context.getDriver(), this);

	}

	@FindBy(xpath = ".//h2[text()='All Products']")
	WebElement allProducts;

	@FindBy(xpath = ".//h2[text()='Category']")
	WebElement category;

	@FindBy(xpath = ".//h2[text()='Brands']")
	WebElement brands;

	@FindBy(xpath = "//h2[text()='recommended items']")
	WebElement recommded_Items;

}
