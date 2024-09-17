package basicActions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 
		// driver.navigate().to("https://phptravels.com/");
		 //driver.navigate().to("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=18002237892539069227&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299258&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		 //driver.manage().window().maximize();
		 
		// WebElement n=driver.findElement(By.xpath("//strong[@class='mx-2']"));
		 
		 //Thread.sleep(2000);
		 
		 //Actions ac=new Actions(driver);
		// ac.contextClick().build().perform();//using method contextClick():-perform a right click action
		// ac.contextClick(n).build().perform();//using method contextClick(n):-perform a paticular webElement for a right click action
		 
		// Thread.sleep(2000);
		 
		// WebElement flag=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[1]/span/span[2]/span[1]"));
		 //ac.moveToElement(flag).build().perform();//using method moveToElement:- focus particular WebElement 
		 //Thread.sleep(2000);
		 
		// driver.close();
		 
		 driver.navigate().to("https://www.google.co.in/");
		 driver.manage().window().maximize();
		 
		 String parentWin=driver.getWindowHandle();
		 System.out.println(parentWin);
		 
		 WebElement gmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
		 
		 Actions ac=new Actions(driver);
		 
		 ac.keyDown(Keys.CONTROL).click(gmail).keyUp(Keys.CONTROL).build().perform();
		 
		Set<String>allWinId=driver.getWindowHandles();
		
		System.out.println(allWinId);
		
		for(String a:allWinId) {
			
			driver.switchTo().window(a);
		}
		
		
		 
		
		 
		 System.out.println(allWinId);
		 
		 
		
	}

}
