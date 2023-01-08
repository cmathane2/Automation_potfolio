package PDP_pages1_test;

import org.testng.annotations.Test;

import java.text.NumberFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RedBusTest/* extends Grouping */{

	
	//@parameters use in this code ad priority7
	
	
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
	

	@Test(enabled=false)
	public void get()
	{

		driver.get("https://www.youtube.com/");
	}
	
	
	@Test(priority=1)
	public void Validate_description()
	{	
		  
	
		String description_page	=driver.findElement(By.xpath("//meta[3]")).getAttribute("content");
		System.out.println("description_of page is" + " " +description_page	);
	    String org_des = "redBus – World’s Largest Online Bus Ticketing Platform with the largest inventory of operators, routes RTCs. 24X7 support for bookings with easy cancellation Instant refund." ;

       //get description comarioson between original and on AEM  		
	    System.out.println(description_page.equals(org_des));
	  Assert.assertEquals(description_page, "redBus – World’s Largest Online Bus Ticketing Platform with the largest inventory of operators, routes RTCs. 24X7 support for bookings with easy cancellation Instant refund.");
	}

	@Test(priority=2)
	public void get_current_url()
	{
		 // get current url 
		System.out.println(driver.getCurrentUrl());//- get URL of current url
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test(priority=3)
	public void text_rYde_new()
	{
		//get text OF rYde
		String text_rYde_new =  driver.findElement(By.id("rYde")).getText();
		System.out.println(text_rYde_new );
		 Assert.assertEquals(text_rYde_new, "rYde");
	}
		
	
	@Test(priority=4)
	public void Varify_rYde_Url()
	{
   		driver.findElement(By.id("rYde")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//check on url of rYde
			    		String ryde = driver.getCurrentUrl();
			    	    System.out.println(ryde);
			    	    System.out.println(ryde.equals("https://www.redbus.in/ryde/"));
			    	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    	    driver.navigate().back();
			    	    Assert.assertEquals(ryde, "https://www.redbus.in/ryde/");
	
	}
	@Test(priority=5)
	public void varify_redRail()
	{
		driver.findElement(By.xpath("//a[@id='redRail']")).click();
		//check on url of redRail
		String redRail = driver.getCurrentUrl();
	    System.out.println(redRail);
        System.out.println(redRail.equals("https://www.redbus.in/redRail"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.navigate().back();
	    Assert.assertEquals(redRail, "https://www.redbus.in/redRail");
	    
	
	
	}
	@Test(priority=6)
	public void verify_manage()
	{
		 //manage bookings
	    
	    // click on manaage booking
	    driver.findElement(By.xpath("//div[@class='manageHeaderLbl']")).click();
	    //click on email/sms 
	    driver.findElement(By.xpath("//span[contains(text(),'Email/SMS')]")).click();
        
	    driver.navigate().back();
        
		
	}

	@Test(priority=0)
	//parameters use for env variable
	//parametrs value asssign in  testing.xml
	
	@Parameters({"from","to"})
	public void sec_destination(String from, String to)
	{
	   WebElement source = driver.findElement(By.id("src"));
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			          WebElement dist = driver.findElement(By.id("dest"));
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			          
			          if(source.isDisplayed()&& source.isEnabled());
			          
			            //   for (int i = 0; i < args.length; i++) {
									{
										source.sendKeys(from);
										//driver.findElement(By.xpath("//li[normalize-space()='Akot']")).click();
										driver.findElement(By.xpath("//i[@class='icon solr-icon icon-ic-city']")).click();
										
									
									}
					  if(dist.isDisplayed()&& dist.isEnabled());
					  				
					  				{
					  					dist.sendKeys(to);
			            			 
					  					dist.click();
			            			
			            			 driver.findElement(By.xpath("//li[@class='selected']//i[@class='icon solr-icon icon-ic-city']")).click();
					  				}
					  				
			 driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
									 
									// driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
									 
             driver.findElement(By.xpath("//td[@class='current day']")).click();
						            
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
									 
					  				driver.findElement(By.xpath("//button[@id='search_btn']")).click();
					  				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					  				
					  				System.out.println(driver.getCurrentUrl());
					  				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					  				
					  				System.out.println("src skpt to dist pune");
  }
	
	
	

	@Test(priority=8,invocationCount=4)
	public void count()
	{
	     System.out.println("count repeat");	
	    int a=5;
	    int b=5;
	     System.out.println(a+b);
	}
	@Test(priority=9, invocationTimeOut=4000)
	public void Timeout()
	{
	     System.out.println("count repeat");	
	    int a=6;
	    int b=6;
	     System.out.println(a+b);
	}
	
	
	@Test(dependsOnMethods="Timeout")
	public void DepnedsOn()
	{
		System.out.println("DependOnMethed");
	}
	
	@Test(dependsOnGroups="grp")
	public void dependOnGroup()
	{
		System.out.println("Depend on Group");
	}

	@AfterMethod
public void TearDown()
	{
		driver.close();
	}
}
