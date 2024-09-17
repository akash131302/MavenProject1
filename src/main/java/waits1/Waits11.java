package waits1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits11 {
	
	
	
	public static void main(String[]args) {
		
		WebDriverWait wait;
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.automationtesting.in/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//use in implicitly wait
		driver.navigate().refresh();
		
		//wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));//Explicit wait declare
		
		
		WebElement btn=driver.findElement(By.xpath("//a[text()='Shop']"));
		btn.click();
		
		//wait.until(ExpectedConditions.visibilityOf(btn));//wait apply
		wait.until(ExpectedConditions.visibilityOf(btn));//wait apply
		
		//wait.until(ExpectedConditions.elementToBeClickable(btn));
		wait.until(ExpectedConditions.elementToBeClickable(btn));
		
		driver.close();
		
		
	}
	
	

}
