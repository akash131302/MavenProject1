package testNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {
	
	public WebDriver driver;
	
	@BeforeTest
	
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://app.phptravels.com/login");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
	}
	
	@Test(description = "directly enter the log in page",priority=1,invocationCount = 2)
	public void Loginpage() {
		
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("akashumap1313@gmail.com");
		System.out.println(username);
		WebElement paasd=driver.findElement(By.id("password"));
		paasd.sendKeys("Akash@1313");
		System.out.println( paasd);
		WebElement btn=driver.findElement(By.xpath("//button[@id='submit']"));
	}
	
	@AfterTest
	
	public void tearDown() {
		driver.close();
	}

}
