package basicScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://practice.expandtesting.com/dropdown");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		
		WebElement drop=driver.findElement(By.xpath("//select[@id='dropdown']"));
		drop.click();
		//System.out.println(drop);
		
		Select sc=new Select(drop);
		
		sc.selectByIndex(2);
		//sc.selectByValue(null);
		//sc.selectByVisibleText();
		
		Actions ac=new Actions(driver);
		ac.contextClick().build().perform();
		
		Thread.sleep(2000);
		
		TakesScreenshot tc=(TakesScreenshot)driver;
		File src=tc.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\DELL\\eclipse-workspace\\MavenProject//bbb.png");
		FileHandler.copy(src, dest);
		
		//driver.close();
		
	}
        }
		
		
		
		
		
		

	