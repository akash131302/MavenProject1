package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocaters1 {

	public static void main(String[] args) throws InterruptedException {
		
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/login/");
		  driver.manage().window().maximize();
		  
		  Thread.sleep(3000);
		  
		 // WebElement username=driver.findElement(By.id("email"));
		  WebElement username1=driver.findElement(By.name("email"));
		 // WebElement username2=driver.findElement(By.className("sighin "));
		  WebElement username3=driver.findElement(By.linkText("Forgotten account?"));
		  WebElement username4=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[1]/input"));
		  
		  WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		  username1.sendKeys("akashumap1313@gmail.com");
		  boolean result=username.isDisplayed();
		  System.out.println(result);
		  System.out.println(username1);
		
		  
		  WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		  password.sendKeys("Akash@1313");
		  boolean result1=password.isDisplayed();
		  System.out.println(result1);
		   System.out.println(password);
		  
//		  WebElement btn=driver.findElement(By.xpath("//input[@id='loginbutton']"));//false path
//		  btn.click();
//		  System.out.println(btn);
//		  
		 // username1.sendKeys("akashumap1313@gmail.com");
		 // System.out.println(username1);
		//  System.out.println(password);
		  System.out.println(username3);
		  System.out.println(username4);
		  
		  
		 // driver.close();
		

	}

}
