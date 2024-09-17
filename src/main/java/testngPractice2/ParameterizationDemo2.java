package testngPractice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizationDemo2 {
	
	public WebDriver driver;
	
	@Test
	@Parameters({"keyword","browser"})
	public void setup(@Optional String keyword,String browser) throws InterruptedException {
		
	if(browser.equalsIgnoreCase("chrome")) {    //1
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {   //2
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {  //3
			
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver ();
		}
		else {                                        //4
			
			System.out.println("invalid browser");
		}
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	
	 
	
	 WebElement txt11=driver.findElement(By.name("q"));
	 txt11.sendKeys(keyword);
	 
	 Thread.sleep(3000);
			
		
		
		 
	 
		 driver.close();
} 

}
