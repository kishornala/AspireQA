package DemoOpenApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;



public class sampleAspire {
	
	public static void main(String[] args) throws InterruptedException {
		
		 // System Property for Chrome Driver   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kishor\\eclipse-workspace\\Aspire QA Development Challenge\\driver\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.get("https://aspireapp.odoo.com");
          
         //Maximize the browser  
          driver.manage().window().maximize();  
          
          //get Random char data
          // create a string of uppercase and lowercase characters and numbers
          String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
          String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
          String numbers = "0123456789";

          // combine all strings
          String alphaNumeric = upperAlphabet + lowerAlphabet + numbers;

          // create random string builder
          StringBuilder sb = new StringBuilder();

          // create an object of Random class
          Random random = new Random();

          // specify length of random string
          int length = 10;

          for(int i = 0; i < length; i++) {

            // generate random index number
            int index = random.nextInt(alphaNumeric.length());

            // get character specified by index
            // from the string
            char randomChar = alphaNumeric.charAt(index);

            // append the character to string builder
            sb.append(randomChar);
          }

          String randomString = sb.toString();
          System.out.println("Random String is: " + randomString);
          
          
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
		  Thread.sleep(2000);
		  
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
		  text.sendKeys(randomString);
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  WebElement save= driver.findElement(By.xpath("//button[@name='action_update_quantity_on_hand']"));
		  save.click();
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  WebElement addquantity= driver.findElement(By.xpath(".//button[@data-original-title='Create record']"));
		  addquantity.click();
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  WebElement quantity = driver.findElement(By.xpath("//input[@name='inventory_quantity']"));
		  quantity.click();
		  quantity.clear();
		  quantity.sendKeys("10");
		  
		  WebElement savequantity= driver.findElement(By.xpath("//button[contains(.,'Save')]"));
		  savequantity.click();
		  
		  WebElement cb= driver.findElement(By.cssSelector("a[href='#']"));
		  cb.click();
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  WebElement manufacturing= driver.findElement(By.xpath("//div[text()='Manufacturing']"));
		  manufacturing.click();
		  Thread.sleep(2000);
		  WebElement create1= driver.findElement(By.xpath(".//button[@data-original-title='Create record']"));
		  create1.click();
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  WebElement text1 = driver.findElement(By.xpath(".//div[@name='product_id']//input"));
		  text1.sendKeys(randomString);
		  Thread.sleep(2000);
		  WebElement confirm= driver.findElement(By.xpath("//button[@name='action_confirm']"));
		  confirm.click();
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  Thread.sleep(2000);
		  WebElement done= driver.findElement(By.xpath("(//button[@name='button_mark_done'])[last()]"));
		  done.click();
		  
		  WebElement ok= driver.findElement(By.xpath("//span[contains(.,'Ok')]"));
		  ok.click();
		  
		  WebElement apply= driver.findElement(By.xpath("//span[contains(.,'Apply')]"));
		  apply.click();
		  
		  WebElement save1= driver.findElement(By.xpath("//button[contains(.,'Save')]"));
		  save1.click();
      
          WebElement productName =  driver.findElement(By.xpath("//a[@name='product_id']//span"));
          String s = productName.getText();
          
          if(s.equals(randomString))
          { System.out.println("New Manufacturing Order is created with correct information " + s);  
        	  
          }
	}

}
