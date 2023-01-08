package pdp_Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RED_BUS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	//	WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "F:\\autamation test engineer\\javaworkspace\\aem_migration\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		 //driver.get("https://www.google.co.in/");
		  //   			WebElement input_element =  driver.findElement(By.id("input"));//.sendkKeys("https://www.redbus.in/"));
		    // 			input_element.sendKeys("https://www.redbus.in/");
		
		     //commands 
		        // browser command  //get commands 
		           //1 close()     //get()- to open the url in browser
		           //2 quit ()      // getTitle()- returns the title of the page
		                            // getPageSourse()- 
		     						// getCurrentURL()
		     						//getText()
		     driver.get("https://www.redbus.in/");
		    driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	 
		     //get title of page
			    System.out.println(driver.getTitle());//- get title of the page
			  
			 //get page source = get code of the page.
			    			//System.out.println(driver.getPageSource());
			
			//get descriptor of page
			     		String description_page	=driver.findElement(By.xpath("//meta[3]")).getAttribute("content");
			    		System.out.println("description_of page is" + " " +description_page	);
			    	    String org_des = "redBus – World’s Largest Online Bus Ticketing Platform with the largest inventory of operators, routes RTCs. 24X7 support for bookings with easy cancellation Instant refund." ;
			 
			//get description comarioson between original and on AEM  		
			    	    System.out.println(description_page.equals(org_des));
			    	    
			    	 /*   if (description_page == org_des)
			    			System.out.println("description is matching");
			    		else
			    			//System.out.println("description is UNmatching");
			    			
			         */
			
			 // get current url 
			    		System.out.println(driver.getCurrentUrl());//- get URL of current url
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    		//UHF checking
			    		
			 //get text OF rYde
			    		String text_rYde_new =  driver.findElement(By.id("rYde")).getText();
			    		System.out.println(text_rYde_new );
			    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //click on rYde new
			    		driver.findElement(By.id("rYde")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//check on url of rYde
			    		String ryde = driver.getCurrentUrl();
			    	    System.out.println(ryde);
			    	    System.out.println(ryde.equals("https://www.redbus.in/ryde/"));
			    	
			
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    	    
			            driver.navigate().back();
			            
			 // get text of redRail            
			            String text_redRail  =  driver.findElement(By.xpath("//a[@id='redRail']")).getText();
			    		System.out.println(text_redRail );
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
	       //click on redRail new//a[@id='redRail']
                    	driver.findElement(By.xpath("//a[@id='redRail']")).click();
			    		//driver.findElement(By.linkText("https://www.redbus.in/redRail")).click();
			    		//driver.findElement(By.partialLinkText("redRa")).click();
			
           //check on url of redRail
			    		String redRail = driver.getCurrentUrl();
			    	    System.out.println(redRail);
			    	    System.out.println(redRail.equals("https://www.redbus.in/redRail"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    	    driver.navigate().back();
		 //Alert handle
			    	    Alert alt =driver.switchTo().alert();
			    	    alt.dismiss();
		   //manage bookings
			    	    
			    	    // click on manaage booking
			    	    driver.findElement(By.xpath("//div[@class='manageHeaderLbl']")).click();
			    	    //click on email/sms 
			    	    driver.findElement(By.xpath("//span[contains(text(),'Email/SMS')]")).click();
		                
			    	    driver.navigate().back();
		                
	       //
			    	   
			   	    
		 // second frame
			    	    
			      WebElement from = driver.findElement(By.id("src"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		          WebElement to = driver.findElement(By.id("dest"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		          
		          if(from.isDisplayed()&& from.isEnabled());
		          
		            //   for (int i = 0; i < args.length; i++) {
								{
									from.sendKeys("Akot");
									driver.findElement(By.xpath("//li[normalize-space()='Akot']")).click();
						//     	}
				  if(to.isDisplayed()&& to.isEnabled());
				  				
				  				{
		            			 to.sendKeys("Pune");
		            			 to.click();
				  				}
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 //Toggle Switch
				 
				       // driver.findElement(By.xpath("//span[@id='togglebtn']")).click();
				 
				 //Calender
	// driver.findElement(By.xpath("//td[normalize-space()='29']")).click();
				 driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
				 
				// driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
				 
				 driver.findElement(By.xpath("//td[normalize-space()='29']")).click();
	            
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 
				//button[@id='search_btn']//button[@id='search_btn']
				 
	 
	 

				 driver.findElement(By.xpath("//button[@id='search_btn']")).click();
				
				//button[@id='search_btn']
				 
				//td[normalize-space()='29']
				//	isSelected(); is used for radio button selected or not
	// is displayed : is used to check the text box shows data or not 
		            		 //isEnabled : is used to its editable or not
		            		 
	}
	}
}
