package dropdown;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		WebElement drop=driver.findElement(By.xpath("//select[@id='course']"));
		drop.click();
		
		Select sc=new Select(drop);//use the select class and pass the webelement 'drop'for seclect class constructor
		sc.selectByIndex(4);
        //sc.selectByValue("Java");
		//sc.selectByVisibleText("P");
		
		Thread.sleep(3000);
		
		TakesScreenshot tc=(TakesScreenshot)driver;//using TakesScreenshot interface declare
		File src=tc.getScreenshotAs(OutputType.FILE);//using method
		File dest=new File("C:\\Users\\DELL\\eclipse-workspace\\MavenProject//abc.png");
		FileHandler.copy(src, dest);
		
		
		//driver.close();

	}

}
