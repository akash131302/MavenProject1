package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocator2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.navigate().to("https://app.phptravels.com/login");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		
		WebElement username=driver.findElement(By.id("email"));//we use in id locators
		username.sendKeys("akashumap1313@gmail.com");
		System.out.println(username);
		boolean result=username.isDisplayed();//we use in isDisplayed method
		System.out.println(result);
		
		
		WebElement username1=driver.findElement(By.name("email"));// we use in name locators
		System.out.println(username1);
		boolean result1=username1.isDisplayed();
		System.out.println(result);
		
		WebElement tagname=driver.findElement(By.tagName("input"));//we use in tagName locators
		System.out.println(tagname);
		boolean result2=tagname.isDisplayed();
		System.out.println(result2);
		
		//WebElement username2=driver.findElement(By.className(""));//we use in className locators
		//System.out.println(username2);
		
		WebElement username3=driver.findElement(By.linkText("Forgot Password"));//we use in linktext locators
		System.out.println(username3);
		boolean result3=username3.isDisplayed();
		System.out.println(result3);
		
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));//we use in X path
		password.sendKeys("Akash@1313");
		System.out.println(password);
		boolean result4=password.isDisplayed();
		System.out.println(result4);
		
//		WebElement btn=driver.findElement(By.xpath("//input[@id='submit'and @type='submit']"));
//		btn.click();
//		String txt=btn.getText();
//		System.out.println(btn);
//		
		
		
		
		
		//driver.close();
		
		
		
		  
		

	}

}
