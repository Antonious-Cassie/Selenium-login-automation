package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait; 

public class NegativeLoginPage {
	
	
		WebDriver driver;
		WebDriverWait wait; 
		
		By usernameField = By.name("username");
		By passwordField = By.name("password");
		By submitButton = By.tagName("button");
		By errorMessage = By.cssSelector(".oxd-alert-content-text");
		
		
		public NegativeLoginPage(WebDriver driver) {
			this.driver = driver; 	
			 this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		}
		
		
		public void openLoginPage() {
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
		}
		
		
		public void enterUsername(String username) {
			driver.findElement(usernameField).sendKeys(username);
			
		}
		
		public void enterPassword(String password) {
			driver.findElement(passwordField).sendKeys(password);
			
		}
		
		public void clickSubmitButton() {
			driver.findElement(submitButton).click();
		}
		
		public String getErrorMessageText() {
		    return wait.until(d -> d.findElement(errorMessage)).getText();
		}
		
		public void executeLogin(String username, String password) {
			enterUsername(username);
			enterPassword(password);
			clickSubmitButton();
		}
		
		
		
		

}
