package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); //when this is called all the WebElements will be initialized for this webpage
										//when i used LoginPage_PF.class it would not run, need to use 'this'
	}
	
	@FindBy(id = "name")
	WebElement txt_username;
	
	@FindBy(id = "password")
	WebElement txt_pass;
	
	@FindBy(id = "login")
	WebElement btn_login;

	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	public void enterPassword(String pass) {
		txt_pass.sendKeys(pass);
	}
	public void clickLogin() {
		btn_login.click();
	}

	
}
