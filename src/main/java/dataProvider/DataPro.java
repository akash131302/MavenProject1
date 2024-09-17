package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataPro {
	
	WebDriver driver;
	
	@Test(dataProvider="ABC")
	public void Search(String Place,String City) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		WebElement SearchBox=driver.findElement(By.name("q"));
		SearchBox.sendKeys(Place+" "+City);
		
		WebElement btn=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
		btn.click();
		
		Thread.sleep(2000);
		driver.close();
	}
	
	@DataProvider(name="ABC")
	public Object[][]getData(){
	
		Object[][]searchword=new Object[3][2];
		searchword[0][0]="TCS";
		searchword[0][1]="Pune";
		searchword[1][0]="Accenture";
		searchword[1][1]="hydrabad";
		searchword[2][0]="wipro";
		searchword[2][1]="Mumbai";
		
				
		
		return 	searchword;
		
		
	}

}
