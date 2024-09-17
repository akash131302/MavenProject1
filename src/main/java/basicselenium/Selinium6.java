package basicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selinium6 {
	
	 public static void main(String[]args) throws InterruptedException {
		 
		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 
		String title= driver.getTitle();
		System.out.println(title);
		
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		
		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
		
		Thread.sleep(2000);
		
		driver.close();
		
	 }

}
