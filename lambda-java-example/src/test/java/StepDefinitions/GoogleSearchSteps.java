package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver = null;
	
	@Given("^the browser is open$")
	public void the_browser_is_open() throws Throwable {
	    System.out.println("Inside Step - browser is open");
	    String projectPath = System.getProperty("user.dir");
	    System.out.println("Project path is: "+projectPath);
	    
	    System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/java/Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	   // driver.manage().window().maximize();
	}

	@Given("^the user is on the google search page$")
	public void the_user_is_on_the_google_search_page() throws Throwable {
		System.out.println("Inside Step - user is on the google search page");
		driver.navigate().to("https://google.com");
	}

	@When("^the user enters a text in the search box$")
	public void the_user_enters_a_text_in_the_search_box() throws Throwable {
		System.out.println("Inside Step - user enters a text in the search");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		Thread.sleep(2000);
	}

	@When("^hits enter$")
	public void hits_enter() throws Throwable {
		System.out.println("Inside Step - user hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("^the user is navegated to the search results$")
	public void the_user_is_navegated_to_the_search_results() throws Throwable {
		System.out.println("Inside Step - user is navegated to the results");
		driver.getPageSource().contains("Online Courses");
		driver.close();
		driver.quit();
	}
}
