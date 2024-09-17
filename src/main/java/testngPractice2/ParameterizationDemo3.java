package testngPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizationDemo3 {
	
	 public WebDriver driver;
	 
	
	 @Test(description="launch the browser setup",priority=1)
	 @Parameters({"browser"})
	 public void setup(@Optional String browser) {
		 
		 if(browser.equalsIgnoreCase("firefox")) {    //1
				
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
		 else if(browser.equalsIgnoreCase("chrome")) {   //2
				
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
		 else if(browser.equalsIgnoreCase("edge")) {   //2
				
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
		 
		 else {                                        //4
				
				System.out.println("invalid browser");
			}
			
		 
		 WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		 driver.get("https://phptravels.com/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.navigate().refresh();
		 
	 } 
	 
	  @Test(description="click on log in button",priority=2)
	  @Parameters({"browser"})
	  public void Clickonbtn(@Optional String browser) {
		  
		   WebElement btn2=driver.findElement(By.xpath("//strong[text()='Login']"));
		  btn2.click();
	  }
	  
		 @Test(description="enter the id and password",priority=3)
		  @Parameters({"browser"})
		 		 public void EnterCred (@Optional String browser){
			 
			 WebElement username=driver.findElement(By.id("email"));
			 username.sendKeys("akashumap1313@gmail.com");
			 System.out.println(username);
			 
			 WebElement passd=driver.findElement(By.id("password"));
			 passd.sendKeys("Akash@1313");
			 System.out.println(passd);
			 
			 WebElement btn=driver.findElement(By.xpath("//button[@id='submit']"));
			 btn.click();
			
			 
			 
		 }
		
		@Test(description="finish the page",priority=4)
		  @Parameters({"browser"})
		public void finish(@Optional String browser) throws InterruptedException {
			 
			 Thread.sleep(2000);
			 driver.close();
		 
		 
	 }

}
