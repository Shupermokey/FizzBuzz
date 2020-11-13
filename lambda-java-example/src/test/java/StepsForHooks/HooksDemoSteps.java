package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksDemoSteps {
	
	WebDriver driver = null;
	
	//Before and after execute for every scenario
	@Before("@smoke")
	public void browserSetUp() {
		System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	@After(order=1)
	public void teardown() {
		driver.close();
		driver.quit();
	}
	@After(order=2)
	public void teardown2() {
		System.out.println("IN TEARDOWN 2");
	}
	
	
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    
	}

	@When("^user enters valid username and password$")
	public void user_enters_valid_username_and_password() throws Throwable {
	    
	}

	@And("^clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		
	}

	@Then("^user is navigated to the home page$")
	public void user_is_navigated_to_the_home_page() throws Throwable {
	    
	}

}
