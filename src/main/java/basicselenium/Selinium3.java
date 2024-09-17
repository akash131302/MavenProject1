package basicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selinium3 {
	
	  public static void main(String[]args) throws InterruptedException {
		  
		  WebDriverManager.edgedriver().setup();
		  
		  WebDriver driver=new EdgeDriver();
		  
		  driver.get("https://web.whatsapp.com/");
		  //driver.navigate().to("https://web.whatsapp.com/");//use for the particular browser to enter the url;
		  
		 String title=driver.getTitle();//this method use for show the web Title
		 System.out.println(title);
		 
	String Url=	driver. getCurrentUrl();//this method use for show the current url
	System.out.println(Url);
	   
	String PageSource=driver.getPageSource();//this method is use for to show HTML CSS Code(show the frontend code)
	System.out.println(PageSource);
	       
	      
		  Thread.sleep(5000);//is used in Selenium to pause the execution of the 
		                     //test script for a specified number of milliseconds.
		  
		  driver.close();// close the current browser
		  driver.quit();// all the browser are close(total no.of browser are close)
	  }

}
