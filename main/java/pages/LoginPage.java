package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

	WebDriver driver;
	By usernameInputLocator = By.name("username");
	By passwordInputLocator = By.name("password");
	By submitButtonLocator = By.tagName("button");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver; 	
	
	}
	
	public void enterUsername(String username) {
		driver.findElement(usernameInputLocator).sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordInputLocator).sendKeys(password);
		
	}
	
	public void clickSubmitButton() {
		driver.findElement(submitButtonLocator).click();
	}
	
	public void executeLogin(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickSubmitButton();
	}
	
	
}
