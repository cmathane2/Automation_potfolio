package pdp_Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "F:\\autamation test engineer\\javaworkspace\\aem_migration\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		   driver.get("https://www.redbus.in/");
		    driver.manage().window().maximize();
	
	 
		    WebElement from = driver.findElement(By.id("src"));
		    from.sendKeys("Akot");
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  from.sendKeys(Keys.ARROW_DOWN);
		    from.sendKeys(Keys.ENTER);
	 
	 
		    WebElement to = driver.findElement(By.id("dest"));
		    
		    to.sendKeys("Pune");
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    to.sendKeys(Keys.ARROW_DOWN);
		    to.sendKeys(Keys.ENTER);
	 
		  //  driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		    
		    
		    
			 driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click(); 
			 driver.findElement(By.xpath("//td[normalize-space()='29']")).click();

			    //driver.findElement(By.xpath("//button[@id='search_btn']")).sendKeys(Keys.ENTER);
			    driver.findElement(By.xpath("//button[@id='search_btn']")).click();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	              
	
	 
  driver.quit();
	 
	 
	 
	
	}

}
