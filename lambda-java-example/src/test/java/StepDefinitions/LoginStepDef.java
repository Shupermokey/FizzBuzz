package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {

	/*
	 * @Given("^user is on login page$") public void verifyLoginPage() {
	 * System.out.println("Hello World"); }
	 */

	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		System.out.println("Inside Step - user is on login page");
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		System.out.println("Inside Step - user enters username and password");
	}

	@When("^clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		System.out.println("Inside Step - user clicks on login button");
	}

	@Then("^user is navigated to the home page$")
	public void user_is_navigated_to_the_home_page() throws Throwable {
		System.out.println("Inside Step - user is navigated to the home page");
	}


}
