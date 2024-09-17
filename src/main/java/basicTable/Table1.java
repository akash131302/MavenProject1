package basicTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
	//	driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));
		System.out.println(table);
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']//tr"));//rows (tr)
		System.out.println(rows);
		int count=rows.size();
		System.out.println(count);//no.of rows
		
		
		
		List<WebElement> columns1=driver.findElements(By.xpath("//table[@id='customers']//th"));//columns (th)
		System.out.println(columns1);
		int count1=columns1.size();
		System.out.println(count1);//no.of columns
		
		
		List<WebElement> data=driver.findElements(By.xpath("//table[@id='customers']//td"));//DATA (td)
		System.out.println(data);
		int count2=data.size();
		System.out.println(count2);//no.of data
		
	
		
		
		
		

	}

}
