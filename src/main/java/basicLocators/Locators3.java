package basicLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators3 {

	public static void main(String[] args) throws InterruptedException {
		
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://phptravels.com/");
		Thread.sleep(2000);
		
		List<WebElement>allLinks=driver.findElements(By.xpath("//a"));
		System.out.println(allLinks);
		
		

	}

}
