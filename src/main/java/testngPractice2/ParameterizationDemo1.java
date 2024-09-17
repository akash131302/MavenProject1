package testngPractice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizationDemo1 {
	
	public WebDriver driver;
	
	@Test
	@Parameters({"keyword"})
	public void para(@Optional String keyword) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.navigate().refresh();

	WebElement txt=driver.findElement(By.name("q"));
	txt.sendKeys(keyword);

	Thread.sleep(2000);
		driver.close();
	}
}
