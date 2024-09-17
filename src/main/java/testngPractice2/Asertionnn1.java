package testngPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Asertionnn1  {
	
 static WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
	}
	
	@Test(description="get the website title",priority=1)
	public void GetTitle() {
		
		String ExpectedResult="Automation Practice Site";
		String ActualResult=driver.getTitle();
		
		Assert.assertEquals(ActualResult, ExpectedResult);
		
		//String Title=driver.getTitle();
		//System.out.println(Title)
		
  
		
	}
	
	@Test(description="click the login button",priority=2)
	public void Clickonbtn() {
		
		WebElement btn=driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
		
		boolean ActualResult=btn.isDisplayed();//hard assert (default)
		Assert.assertTrue(ActualResult);
		btn.click();
	}
	
	@Test(description="enter the id and password",priority=3)
	public void Enterinfo() {
		
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("Akash Umap");
		
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("Akash@1313");
		
	}
	
	@Test(description="click the log in button",priority=4)
	public void Loginbtn() {
		
		WebElement btn2=driver.findElement(By.xpath("//input[@name='login']"));
		SoftAssert sa=new SoftAssert();//soft Assert(Verify)
		sa.assertTrue(btn2.isDisplayed());
		
		String ActualText=btn2.getText();
		sa.assertEquals( ActualText,"Log in");
		
		btn2.click();
	}
	
	
	
	@AfterSuite
	public void tearup() {
		driver.close();
	}
	

}


	


