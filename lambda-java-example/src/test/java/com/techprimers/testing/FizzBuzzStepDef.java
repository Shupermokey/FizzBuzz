package com.techprimers.testing;

import org.junit.jupiter.api.Assertions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FizzBuzzStepDef { 
 
	FizzBuzz fizzBuzz;
	String result;
	
	@Given("^Create a FizzBuzz game play$")
	public void createAFizzBuzzGamePlay() throws Throwable{
		fizzBuzz = new FizzBuzz();
		
	}
	
	@When("^I play with number (\\d+)$")
	public void iPlayWithNumber(int number) throws Throwable{
		result = fizzBuzz.play(number);
		
	}
	
	@Then("^The result is \"([^\"]*)\"$")
	public void theResultIs(String resultString) throws Throwable{
		Assertions.assertEquals(result,resultString);
	}
	

}
