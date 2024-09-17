package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataPro2 {
	
	WebDriver driver;
	
	@Test(dataProvider="abc",invocationCount=2)
	public void  Search(String Place,String city) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement SearchBox=driver.findElement(By.name("q"));
		SearchBox.sendKeys(Place+" "+city);
		
		WebElement btn=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
		btn.click();
		
		Thread.sleep(2000);
		driver.close();
	}
	
	    @DataProvider(name="abc")
	    public Object[][]getData(){
	    	
	    Object[][]searchword=new Object[5][2];
	    
	    searchword[0][0]="Barclays";
	    searchword[0][1]="kharadi";
	    searchword[1][0]="EON IT";
	    searchword[1][1]="KHARDI";
	    searchword[2][0]="SENWELL";
	    searchword[2][1]="KHARDI";
	    searchword[3][0]="sagitech";
	    searchword[3][1]="Vimannagar";
	    searchword[4][0]="cybage";
	    searchword[4][1]="kalyaniNagar";
	   
	    
			return searchword;
	    	
	   
	    }
	

}
