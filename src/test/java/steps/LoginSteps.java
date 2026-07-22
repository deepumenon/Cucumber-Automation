/*
 * package steps;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.testng.Assert;
 * 
 * import driver.DriverInstance; import io.cucumber.java.en.And; import
 * io.cucumber.java.en.Given; import io.cucumber.java.en.Then; import
 * io.cucumber.java.en.When; import pageObjects.Login_Elements;
 * 
 * public class LoginSteps extends DriverInstance {
 * 
 * public LoginSteps(WebDriver driver) { super(driver); // TODO Auto-generated
 * constructor stub }
 * 
 * //WebDriver driver; Login_Elements login= new Login_Elements(driver);
 * 
 * 
 * 
 * 
 * @And("user clicks on login link") public void userClicksOnLoginLink() { //
 * Write code here that turns the phrase above into concrete actions //
 * driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click(
 * );
 * 
 * login.click_login_link(); }
 * 
 * 
 * @Given("user enters the username as deepak") public void
 * userEntersTheUsernameAsDeepak() { // Write code here that turns the phrase
 * above into concrete actions
 * driver.findElement(By.xpath("(//input[@type='email' and @name='email'])[1]"))
 * .sendKeys("deepak1223@gmail.com");
 * 
 * 
 * }
 * 
 * @And("user enters the password as pass1234") public void
 * userEntersThePasswordAsPass1234() { // Write code here that turns the phrase
 * above into concrete actions
 * driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Deepak");
 * 
 * }
 * 
 * @When("user clicks the login button") public void userClicksTheLoginButton()
 * { // Write code here that turns the phrase above into concrete actions
 * //driver.findElement(By.
 * xpath("//button[@type='submit' and contains(text(),'Login')]")).click();
 * login.click_Login_Btn();
 * 
 * }
 * 
 * @Then("login should be success") public void loginShouldBeSuccess() { //
 * Write code here that turns the phrase above into concrete actions String Text
 * = driver.findElement(By.
 * xpath("//a[contains(.,'Logged in as')]/b[text()='deepak']")).getText();
 * System.out.println(Text); //driver.quit(); }
 * 
 * @Given("user enters the password as pass") public void
 * userEntersThePasswordAsPass() { // Write code here that turns the phrase
 * above into concrete actions
 * driver.findElement(By.xpath("//input[@type='password']")).sendKeys(
 * "Deepak123");
 * 
 * 
 * }
 * 
 * @Then("login should be fail") public void loginShouldBeFail() { // Write code
 * here that turns the phrase above into concrete actions String Errmsg =
 * driver.findElement(By.
 * xpath("//p[text()='Your email or password is incorrect!']")).getText();
 * 
 * Assert.assertEquals(Errmsg, "Your email or password is incorrect!");
 * //driver.quit();
 * 
 * }
 * 
 * @Given("user enters the username as {string}") public void
 * userEntersTheUsernameAs(String username) { // Write code here that turns the
 * phrase above into concrete actions
 * //driver.findElement(By.xpath("(//input[@type='email' and @name='email'])[1]"
 * )).sendKeys(username); login.enter_Username(username);
 * 
 * 
 * }
 * 
 * @Given("user enters the password as {string}") public void
 * userEntersThePasswordAs(String password) { // Write code here that turns the
 * phrase above into concrete actions
 * 
 * //driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password
 * ); login.enter_Password(password);
 * 
 * }
 * 
 * }
 */