package basicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium4 {

	public static void main(String[] args) throws InterruptedException {
		  
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		  driver.get("https://www.linkedin.com");
		  driver.navigate().to("https://www.linkedin.com/feed/");
		  
		 String title= driver.getTitle();
		 System.out.println(title);
		 
		String Url= driver.getCurrentUrl();
		System.out.println(Url);
		
		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
		
		Thread.sleep(5000);
		  
		  
		  
		  
		    
		  driver.close();
		//  driver.quit();
		
		

	}

}
