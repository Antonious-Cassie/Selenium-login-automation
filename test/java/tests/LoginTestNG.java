package tests;	
	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

	public class LoginTestNG {
	
	WebDriver driver;
	LoginPage loginPage;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		loginPage = new LoginPage(driver);
	}
		
	@Test
	
	public void testLoginFunctionality() {
	
	loginPage.executeLogin("Admin", "admin123");
	
	String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"; 
	Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
	
	Assert.assertTrue(driver.getPageSource().contains("Dashboard"));
	
	}
	
	

				

	@AfterMethod
	public void closeTest() {
		driver.quit();
	}
		
	}

