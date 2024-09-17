package basicAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		
		WebElement btn=driver.findElement(By.id("alertButton"));
		
		btn.click();
		Thread.sleep(2000);
		//Alert SimpleAlert1=driver.switchTo().alert();
		//Thread.sleep(2000);
	//	SimpleAlert1.accept();//using method accept();its perform a ok action.
		
		
		
         
//     driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
//		Alert SimpleAlert2=driver.switchTo().alert();
//		Thread.sleep(2000);
//		 SimpleAlert2.dismiss();//using method dismiss();its perform to cancel.
//		
		
		driver.findElement(By.xpath("//button[@id='confirmButton']"));
		Alert SimpleAlert3=driver.switchTo().alert();
		Thread.sleep(2000);
		SimpleAlert3.sendKeys("Akash");
		
		//driver.findElement(By.)
		
	}
}
		
		
		
		
		
		

	


