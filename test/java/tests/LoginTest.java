package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

    public static void main(String[] args) throws InterruptedException {

    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.google.com/"); 
    	
    	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
    	
    	driver.manage().window().maximize();
    	
    	//Type username Admin into Username field
    	
    	WebElement usernameInput = driver.findElement(By.name("username"));
    	usernameInput.sendKeys("Admin");
    	
    		
    	//Type password admin123 into Password field
    	
    	WebElement passwordInput = driver.findElement(By.name("password"));
    	passwordInput.sendKeys("admin123");
    		
    	//Push Submit button
    	
    	
    	WebElement submitButton = driver.findElement(By.tagName("button"));
    	submitButton.click();
    	Thread.sleep(2000);
    	
        driver.quit();
    }
}