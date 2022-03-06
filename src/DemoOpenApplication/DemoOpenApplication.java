package DemoOpenApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoOpenApplication {
	
	static {
		// System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Kishor\\eclipse-workspace\\Aspire QA Development Challenge\\driverchromedriver.exe");
		
	}

	public static void main(String[] args) {
		  WebDriver driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  driver.get("https://aspireapp.odoo.com");
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   
		  WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		  email.sendKeys("user@aspireapp.com");
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  WebElement pwd = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		  pwd.sendKeys("@sp1r3app");
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  WebElement lgnBTN = driver.findElement(By.xpath("//button[@type='submit']"));
		  lgnBTN.submit();
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	  
		  
		  WebElement inventory= driver.findElement(By.xpath("//div[text()='Inventory']"));
		  inventory.click();
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  WebElement products= driver.findElement(By.xpath("//span[text()='Products']"));
		  products.click();
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  WebElement product= driver.findElement(By.xpath("//a[text()='Products']"));
		  product.click();
		  
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  WebElement create= driver.findElement(By.xpath("//button[@title='Create record']"));
		  create.click();
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  WebElement text = driver.findElement(By.xpath("//input[@name='name']"));
		  text.sendKeys("NewProductTest676");
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  WebElement save= driver.findElement(By.xpath("//button[@name='action_update_quantity_on_hand']"));
		  save.click();
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  WebElement addquantity= driver.findElement(By.xpath(".//span[contains(.,'Update Quantity')]"));
		  addquantity.click();
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  WebElement quantity = driver.findElement(By.xpath("//input[@name='inventory_quantity']"));
		  quantity.sendKeys("100");
		  
		  WebElement savequantity= driver.findElement(By.xpath("//button[text()='Save']"));
		  savequantity.click();
		  
		  WebElement cb= driver.findElement(By.cssSelector("a[href='#']"));
		  cb.click();
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  WebElement manufacturing= driver.findElement(By.xpath("//div[text()='Manufacturing']"));
		  manufacturing.click();
		  
		  WebElement create1= driver.findElement(By.xpath("//button[text()='Create']"));
		  create1.click();
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  WebElement text1 = driver.findElement(By.xpath("//input[@type='text']"));
		  text1.sendKeys("NewProductTest");
		  
		  WebElement confirm= driver.findElement(By.xpath("//button[@name='action_confirm']"));
		  confirm.click();
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  WebElement done= driver.findElement(By.xpath("//button[@name='button_mark_done']"));
		  done.click();
      
    
	}

}
