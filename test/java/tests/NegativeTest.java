package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait; 
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.NegativeLoginPage;

import org.testng.annotations.AfterMethod;

import java.time.Duration;



public class NegativeTest {

	WebDriver driver; 
	NegativeLoginPage loginPage; 

	@BeforeMethod 
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		loginPage = new NegativeLoginPage(driver); 
		loginPage.openLoginPage();
		
	}
		
	@Test 
	public void NegativeLoginFunctionality() {
		
		loginPage.executeLogin("wrongName", "admin123"); 
		String actualText = loginPage.getErrorMessageText();
        Assert.assertEquals(actualText, "Invalid credentials");
		
	}
	
	@AfterMethod
	public void closeTest() {
		driver.quit();
	}
}
	

	
	

