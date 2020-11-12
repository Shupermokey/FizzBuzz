package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	private By txt_username = By.id("name");
	private By txt_pass = By.id("password");
	private By btn_login = By.id("login");
	private By btn_logout = By.id("logout");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUsername(String username) {
		
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(txt_pass).sendKeys(pass);
	}
	
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	
	public void checkLogOutIsDisplayed() {
		driver.findElement(btn_logout).isDisplayed();
	}
	
	public void loginValidUser(String username, String pass) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_pass).sendKeys(pass);
		driver.findElement(btn_login).click();
	}
}
