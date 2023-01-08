package PDP_pages1_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Grouping {
	
	
	
	
	

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
	
	
	@Test(groups="grp")
	public void grp1()
	{
		
		System.out.println("abc1");
	}
	
	@Test( groups="grp")
	public void grp2()
{
		
		System.out.println("abc2");
}
	
	@Test(priority = 14, groups="grp1")
	public void grp3()
{
		
		System.out.println("abc3");
}
	
	@Test(priority = 12, groups="grp1")
	public void grp4()
{
		
		System.out.println("abc4");
}
	
	

	@AfterMethod
public void TearDown()
	{
		driver.close();
	}
}
	
	


