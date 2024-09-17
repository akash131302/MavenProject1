package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium7 {

	public static void main(String[] args) throws InterruptedException {
		
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  
		  
		

	driver.navigate().to("https://app.phptravels.com/login");
	
	driver.manage().window().maximize();
	driver.navigate().refresh();
	//driver.navigate().forward();
	Thread.sleep(2000);
	
	
}
}
