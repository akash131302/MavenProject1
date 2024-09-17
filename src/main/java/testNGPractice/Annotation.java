package testNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotation {
	
	WebDriver driver;
	  
	  @BeforeSuite   //PreCondition
	  
	  public void setup() {
		  
		  WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		  //driver.get("https://www.facebook.com/login/");
		 driver.get("https://www.w3schools.com/");
		  
		  driver.manage().deleteAllCookies();
		  driver.navigate().refresh();
		  driver.manage().window().maximize();
	  }
	  
	  @Test(description = "click on HomePge login button",priority = 1)//invocationCount = 2)
	  
	  public void ClickOnLoginbtn() {
		  
		//  WebDriver driver=new ChromeDriver();
		  WebElement btn=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/a[1]"));
		  btn.click();
		  
	  }
	   
	  @Test(description = "Enter the username and password",priority=2,enabled =true)
	  
	  public void Entercred() {
		  
		
		 // WebDriver driver=new ChromeDriver();
		 WebElement username=driver.findElement(By.id("email"));
		 username.sendKeys("akashumap@1313");
		 WebElement pass1=driver.findElement(By.id("password"));
		 pass1.sendKeys("Akash@1313");
		 
		
		  
		 // WebElement username1=driver.findElement(By.xpath("//input[@id='email']"));
		 // username1.sendKeys("akashumap1313@gmail.com");
		 //WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		  //password.sendKeys("Akash@1313");
		 
		 
		
	  }
	  
	  @Test(description="click on loginBtn for login page ",priority=3,dependsOnMethods ="Entercred()" )
	  
	  public void LoginBtn() {
	  
	 
	 // WebDriver driver=new ChromeDriver();
	 WebElement logbtn=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[5]/div/form/div[3]/button[2]"));
	  logbtn.click();
	  }
		  
	  
	  
	  
	  
	  
	  
		  
	@AfterSuite   //postcondition
	
	public void tearup() {
		
		//WebDriver driver=new ChromeDriver();
		
		driver.close();
		  
	}  
	  }


