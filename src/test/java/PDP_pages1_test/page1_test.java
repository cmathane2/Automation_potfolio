






package PDP_pages1_test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;



public class page1_test  {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * #########   point 1
	 * annotation flow
	 * @beforesuite
	 * @beforeTest
	 * @beforeClass
	 * @beforeMethod
	 * @test
	 * @aftermethod
	 * @afterclass
	 * @aftertest
	 * @after site
	*
	 * 
	 * #########   point 2
	 * Always fllow
	 * @beforemathod
	   @test1
	   @aftermethod
	 * 
	 * @beforemethod
	 * @test2
	 * @aftermethod
	 * 
	 * #########   point 3
	 * groups has more priority than individual
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	@BeforeSuite()
			public void SetUP() 
	{
	      System.out.println("setup system property");	
	}
	@BeforeTest()
	
    void open_browser()

				{ 
					System.out.println("Before_Test");

				}
	
	@BeforeClass()
	      public void login()
	      {
	            System.out.println("BeforeClass");	
	      }
	
	@BeforeMethod()
		public void enterurl()
		{
					System.out.println("before_method");
		}
	

	@BeforeGroups()	
	           void Before_Group()

{
        System.out.println("Before_Group");
	
}
	
	
	
	
	@AfterClass()
			void after_class()
		{
			System.out.println("After_class");
		}
	
	@AfterTest()
			void after_test()
	
		{
			System.out.println(" aftertest");
		}
	@AfterMethod()	
			void After_method()

      {
			System.out.println("After_Method");
      }
	

	
	@AfterGroups()	
    void After_Group()

      {
			System.out.println("After_Group");
      }
	
	
@Test(priority=1)
	void  Test_1()
	{
		System.out.println("test1");
	}
@Test(priority=2)
	void Test_2()
		{
			System.out.println("test2");
		}
@Test(priority=3)
	void Test_3()
	{
		System.out.println("test3");
	}
@Test(groups="G1")
	void group_regration()
    {
         System.out.println("group_regrationgG1()");

    }
@Test(groups="G1")
	void group_regration1()
	{
		 System.out.println("group_regrationG1()");

	}
@Test(groups="G2")
void group_regration2()
{
	 System.out.println("group_regrationG2()");

}
@Test(groups="G3")
void group_regration3()
{
	 System.out.println("group_regrationG3()");

}
@Test(groups="G3")
void group_regration4()
{
	 System.out.println("group_regrationG4()");

}
	}

//}
