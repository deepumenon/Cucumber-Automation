/*
 * package steps;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.JavascriptExecutor;
 * import org.openqa.selenium.WebDriver; import org.testng.Assert;
 * 
 * import driver.DriverInstance; import io.cucumber.java.en.Given; import
 * io.cucumber.java.en.Then; import io.cucumber.java.en.When; import
 * pageObjects.Login_Elements;
 * 
 * public class AddToProduct extends DriverInstance {
 * 
 * //WebDriver driver;
 * 
 * public AddToProduct(WebDriver driver) { super(driver); // TODO Auto-generated
 * constructor stub } Login_Elements login = new Login_Elements(driver);
 * 
 * 
 * @Given("login to application as {string} and {string}") public void
 * loginToApplicationAsAnd(String username, String password) {
 * 
 * 
 * login.click_login_link(); login.enter_Username(username);
 * login.enter_Password(password); login.click_Login_Btn();
 * 
 * driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click(
 * );
 * driver.findElement(By.xpath("(//input[@type='email' and @name='email'])[1]"))
 * .sendKeys(username);
 * driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
 * driver.findElement(By.
 * xpath("//button[@type='submit' and contains(text(),'Login')]")).click();
 * 
 * 
 * 
 * String Text = driver.findElement(By.
 * xpath("//a[contains(.,'Logged in as')]/b[text()='deepak']")).getText();
 * System.out.println(Text);
 * 
 * }
 * 
 * @Given("Navigate to product and Search as {string}") public void
 * navigateToProductAndSearchAs(String product) {
 * 
 * 
 * 
 * driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();
 * //driver.findElement(By.xpath("//div[@id='dismiss-button-element']")).click()
 * ;
 * 
 * 
 * try { WebElement closeAd =
 * driver.findElement(By.xpath("//div[@id='dismiss-button']")); if
 * (closeAd.isDisplayed()) { closeAd.click(); } } catch (NoSuchElementException
 * e) { System.out.println("Ad not displayed"); }
 * 
 * driver.findElement(By.xpath("//input[@type='text']")).sendKeys(product);
 * driver.findElement(By.xpath("//button[@type='button']")).click();
 * 
 * JavascriptExecutor js = (JavascriptExecutor) driver;
 * js.executeScript("window.scrollBy(0,500)"); }
 * 
 * @When("User should add the product to cart") public void
 * userShouldAddTheProductToCart() {
 * driver.findElement(By.xpath("(//a[contains(@class,'add-to-cart')])[1]")).
 * click(); driver.findElement(By.linkText("View Cart")).click();
 * 
 * 
 * }
 * 
 * @Then("verify product added to cart {string}") public void
 * verifyProductAddedToCart(String product) {
 * 
 * String verifyProduct=
 * driver.findElement(By.xpath("//a[text()='Men Tshirt']")).getText();
 * Assert.assertEquals(verifyProduct, product);
 * System.out.println("Product validation successful"); //driver.quit(); }
 * 
 * }
 */