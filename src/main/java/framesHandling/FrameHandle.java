package framesHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	
	
	
	driver.switchTo().frame("frm1");//frames handle//id,name,index,webelement
	
	Thread.sleep(2000);
	
	WebElement drop=driver.findElement(By.id("selectnav1"));
	//drop.click();
	
	Select sc=new Select(drop);
	sc.selectByIndex(3);
		

	}

}
