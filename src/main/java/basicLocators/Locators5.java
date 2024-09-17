package basicLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators5 {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver 	driver=new ChromeDriver();
		 driver.get("https://app.phptravels.com/login");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.navigate().refresh();
		 
		// WebElement btn2=driver.findElement(By.xpath("//strong[text()='Login']"));
		 // btn2.click();
		 
		 WebElement username=driver.findElement(By.id("email"));
		 username.sendKeys("akashumap1313@gmail.com");
		 System.out.println(username);
		 
		 WebElement passd=driver.findElement(By.id("password"));
		 passd.sendKeys("Akash@1313");
		 System.out.println(passd);
		 
		 WebElement btn=driver.findElement(By.xpath("//button[@id='submit']"));
		 btn.click();
		
		 
		

	}

}
