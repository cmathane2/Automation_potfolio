package PDP_pages1_test;

import java.text.NumberFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExpectedExeption {

	
	
	
	
	
	WebDriver driver;
	
	@BeforeMethod()
	public void setup_Browser_launch()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\autamation test engineer\\javaworkspace\\aem_migration\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    	driver.get("https://www.redbus.in/");
    	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	
	
	
	@Test(expectedExceptions=NumberFormat.class)
	public void expectedexception()
	{
	     System.out.println("code will run even though mention exception thrown");	
	    
	}
	
	
	@AfterMethod
public void TearDown()
	{
		driver.close();
	}
	
	
	
	
	
	
}
