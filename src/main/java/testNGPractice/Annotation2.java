package testNGPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotation2 {
	
	
public	WebDriver driver;
	
	
	
	@BeforeSuite
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://practice.automationtesting.in/");
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		driver.manage().window().maximize();
	}
	@Test(priority=0)
	public void GetTitle() {
		
		String Title=driver.getTitle();
		System.out.println(Title);
	}
	
	 @Test  (description = "click on shop menu button in home page",priority=1)
	 
	 public void Clickshopmenu() {
		 
		//WebElement btn=driver.findElement(By.linkText("Shop"));
		WebElement btn=driver.findElement(By.xpath("//a[text()='Shop']"));
		btn.click();
		//System.out.println(btn);
	 }
	 
	 @Test(description = "scroll the page",priority = 2)
	 public void menupage() {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,1500)");
			
	 }
	 
	 @Test(description = "enter the product details",priority=3)
	 public void menupage2() {
		
//WebElement btn1=driver.findElement(By.xpath("//img[@alt='Android Quick Start Guide']\r\n"+ ""));
WebElement btn1=driver.findElement(By.xpath("//img[@class='attachment-shop_catalog size-shop_catalog wp-post-image']"));
            btn1.click();
	 }
	 
	 @Test(description="enter the product quntity",priority=4)
	 public void addQuantity() {
		 
		 WebElement btn3=driver.findElement(By.xpath("//input[@class='input-text qty text']"));
		        btn3.clear();
	 }
	 
	 @Test(description = "add the product",priority=5)
	 public void addProduct() throws InterruptedException {
		 
		 WebElement btn4=driver.findElement(By.xpath("//button[@class='single_add_to_cart_button button alt']"));
		            btn4.click();
		            
		            Thread.sleep(3000);
	 }
	 
	 @Test(description="show the bill ",priority=6)
	 public void Clickonbill() throws InterruptedException {
		 
		 WebElement btn5=driver.findElement(By.xpath("//span[@class='amount']"));
		           btn5.click();
		           
		           
		           
		           Thread.sleep(4000);
	 }
	 
	 @Test(description="get the data",priority=7)
	 public void cartDataCheck() {
		 
		 List<WebElement>tabledata=driver.findElements(By.xpath("//table[@class='shop_table shop_table_responsive cart']"));
		 
		 for(WebElement webElement:tabledata) {
			 
			 System.out.println(webElement.getText());
			 
		 }
	 }
	 
	  @Test(description="click the button bill proceed",priority=8)
	  public void ProceedC() {
		  
		  WebElement btn6=driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']"));
		              btn6.click();
	  }
	  
	   @Test(description = "scroll the page",priority=9)
	   public void scroolingPge() {
		   
		   JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,2000)");
	   }
	  
	  @Test(description="fill the info for customer",priority=10)
	  public void checkout() throws InterruptedException {
		  
		  WebElement username1=driver.findElement(By.name("billing_first_name"));
		  username1.sendKeys("Akash");
		  System.out.println(username1);
		  
		  WebElement username2=driver.findElement(By.name("billing_last_name"));
		  username2.sendKeys("Umap");
		  System.out.println( username2);
		  
		  Thread.sleep(2000);
		  
		  WebElement compname=driver.findElement(By.name("billing_company"));
		  compname.sendKeys("TCS");
		  System.out.println(compname);
		  
		  WebElement Uemail=driver.findElement(By.id("billing_email"));
		  Uemail.sendKeys("akashumap1313@gmail.com");
		  System.out.println(  Uemail);
		  
		  WebElement Uphone=driver.findElement(By.id("billing_phone"));
		  Uphone.sendKeys("9307916826");
		  System.out.println(Uphone);
		  
		  WebElement drop=driver.findElement(By.xpath("select2-drop-mask"));
		  drop.click();
		  Select sc=new Select(drop);
		  sc.selectByValue("india");
		  Thread.sleep(2000);
		  
		  WebElement Uaddress=driver.findElement(By.name("billing_address_1"));
		  Uaddress.sendKeys("AT-POST=jategoan b.k,TAL=shirur,DIST=pune,PIN=412208");
		  WebElement Uaddress1=driver.findElement(By.name("billing_address_2"));
		  Uaddress1.sendKeys("AT-POST=jategoan b.k,TAL=shirur,DIST=pune");
		  
		  //System.out.println(Uaddress);
		  
		  WebElement Ucity=driver.findElement(By.name("billing_city"));
		  Ucity.sendKeys("Shikrapur");
		 // System.out.println(Ucity);
		  //Thread.sleep(2000);
		  
		  WebElement drop1=driver.findElement(By.xpath("//span[@id='select2-chosen-1166']"));
		  drop1.click();
		  Select sc1=new Select(drop1);
		 // sc1.selectByValue("Maharashtra");
		  sc1.selectByIndex(16);
		  Thread.sleep(2000);
		  
		  WebElement Ubillcode=driver.findElement(By.className("billing_postcode"));
		  Ubillcode.sendKeys("ABC");
		  System.out.println(Ubillcode);
		  
		  Thread.sleep(2000);
		  
		  WebElement Ucaccount=driver.findElement(By.xpath("//input[@id='createaccount']"));
		  Ucaccount.click();
		  
		  Thread.sleep(2000);
		  
		  WebElement pass2=driver.findElement(By.id("account_password"));
		  pass2.sendKeys("Akash@123");
		  System.out.println(pass2);
	  }
	   @Test(description="pay to pyment proceed",priority=11)
	   public void Upay() throws InterruptedException {
		   
		   WebElement cod=driver.findElement(By.xpath("//input[@id='payment_method_cod']"));
		   cod.click();
		   Thread.sleep(2000);
	   }
	   
	   @Test(description="place the customer order",priority=12)
	   public void Porder() throws InterruptedException {
		   
		  // WebElement table=driver.findElement(By.xpath("//div[@class='form-row place-order']"));
			//System.out.println(table);
		   WebElement po=driver.findElement(By.xpath("//input[@id='place_order']"));
		   po.click();
		 //  Thread.sleep(2000);
		   
  }
	   
	   @AfterSuite  //postcondition 
		  public void tearup() throws InterruptedException {
		   
			Thread.sleep(2000); 
			 driver.close();
		 }
	}
		   
		   
		   
		   
	 
	   
		  
		  
		  
		  
		  
		  
	  

		 
					
					
			
	 
	 
	 
	 
	 

		 
		 
		 
		 


	 