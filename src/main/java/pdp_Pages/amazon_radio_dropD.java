package pdp_Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon_radio_dropD {

	public static void main(String[] args) throws InterruptedException {
		
		
		// TODO Auto-generated method stub
        
		
		     System.setProperty("webdriver.chrome.driver", "F:\\autamation test engineer\\javaworkspace\\aem_migration\\Drivers\\chromedriver.exe");
		
		
		     WebDriver driver = new ChromeDriver();
		  
	
		    
	
		     driver.get("https://www.amazon.in/");
		     

		     
		     //drop down on serch element 
		     
		     //element of input
		     WebElement drop_down_all =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		     drop_down_all.sendKeys("apple ");
		     //apple addaptor 20W original
		     Thread.sleep(3000);
		     //store all related search 
		     List<WebElement> suggList = driver.findElements(By.xpath("//div[@id='nav-flyout-iss-anchor']"));
		     //store all realted search into e and get outloff data outoff it 
		     for(WebElement e : suggList)
		     {	    	 
		    	 System.out.println(e.getText());
            	
		     }
		
		     //radio button handle
		     // select india button icon and radio_button 
		     WebElement india_icon_dropdown = driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[1]"));
		     
		     india_icon_dropdown.click();
		     
		     //select radio utton marathi Icon and click on it
		     WebElement radion_button1_MR = driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='a-page']/div[2]/div[1]/form[1]/div[1]/div[1]/div[9]/div[1]/label[1]/i[1]"));
		                  radion_button1_MR.click(); 
		                  Thread.sleep(3000);
		     
		    //  System.out.println("radio_button_icon"+radion_button.isSelected());  
		     Thread.sleep(3000);
		     
		     //other methoed marathi input tag to check selected
		     
		     WebElement radion_button_MR = driver.findElement(By.xpath("//input[@value='mr_IN']"));
		    //radion_button2.click();
		     
		     System.out.println("radion_button2_MR_isSelected" + " " +radion_button_MR.isSelected());
		     
		     //radio button BN icon for click
		     
		     WebElement radion_button1_BN = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-radio'])[7]"));
		                 radion_button1_BN.click();
		                 
		     //other methoed BN input tag to check selected
		     WebElement radion_button_BN = driver.findElement(By.xpath("//input[@value='bn_IN']"));
		                 System.out.println("radio button1_BN_isselected"+" "+ radion_button_BN.isSelected()); 
		     
		                 System.out.println("radio button1_BN_isDisplayed " +" "+ radion_button1_BN.isDisplayed()); 
		                 System.out.println("radio button1_BN_isEnabled" +" " + radion_button1_BN.isEnabled()); 
		     
		     
		     driver.close();
 }

	private static void open_broser() {
		// TODO Auto-generated method stub
		
	}
}
		         
		     
