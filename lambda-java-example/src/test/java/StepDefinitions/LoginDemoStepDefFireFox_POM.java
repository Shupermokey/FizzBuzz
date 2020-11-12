/*
 * package StepDefinitions;
 * 
 * import java.util.concurrent.TimeUnit; import org.openqa.selenium.By; import
 * org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.firefox.FirefoxDriver;
 * 
 * import Pages.LoginPage; import cucumber.api.java.en.Given; import
 * cucumber.api.java.en.Then; import cucumber.api.java.en.When;
 * 
 * public class LoginDemoStepDefFireFox_POM {
 * 
 * WebDriver driver = null; LoginPage loginPage;
 * 
 * 
 * @Given("^Browser is open$") public void browser_is_open() throws Throwable {
 * System.out.println("Inside Step - browser is open"); String projectPath =
 * System.getProperty("user.dir");
 * System.out.println("Project path is: "+projectPath);
 * 
 * System.setProperty("webdriver.gecko.driver",projectPath+
 * "/src/test/java/Drivers/geckodriver.exe"); driver = new FirefoxDriver();
 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 * driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); }
 * 
 * @Given("^user is on the login page$") public void user_is_on_the_login_page()
 * throws Throwable {
 * System.out.println("Inside Step - user is on the login page");
 * driver.navigate().to("https://example.testproject.io/web/");
 * 
 * 
 * }
 * 
 * @When("^user enters their (.*) and (.*)$") public void
 * user_enters_their_username_and_password(String username, String password)
 * throws Throwable {
 * System.out.println("Inside Step - user enters their credentials"); loginPage
 * = new LoginPage(driver); loginPage.enterUsername(username);
 * loginPage.enterPassword(password); Thread.sleep(2000);
 * loginPage.clickLogin(); }
 * 
 * @Then("^the user is navigated to the home page$") public void
 * the_user_is_navigated_to_the_home_page() throws Throwable {
 * System.out.println("Inside Step - user is navigated to the home page");
 * loginPage.checkLogOutIsDisplayed(); Thread.sleep(2000); driver.close();
 * driver.quit(); }
 * 
 * }
 */