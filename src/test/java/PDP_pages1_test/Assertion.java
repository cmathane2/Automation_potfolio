package PDP_pages1_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



//
//hard assertion : hard validation : if a hard assertion is getting failed---. immediately test case will me marked as ailed and
//test case will e termiated
//soft asserttion : soft vlidaton: if a soft assertion is getting failed ---test case will not be marked as passed as well as next lines will e executed 
// assetAll(); to mark the test case as failed , if any soft assertion s getting failed

public class Assertion {
	SoftAssert softassert =new SoftAssert() ;// object for all test
	
	@Test// hard assertion used ,failed
	public void only_Assert_failed()
	{
		System.out.println("A1");
		Assert.assertEquals(true, false);
		System.out.println("A1 pass"); // not printed
		
	}

	@Test// hard assertion used  ,passed
	public void only_Assert_pass()
	{
		System.out.println("A2");
	    Assert.assertEquals(true, true);	
        System.out.println("A2 pass"); // printed
	}
	
	@Test
	// soft assert used  pass and failed test case are preset but marked as a pass  
	public void soft_assert1()
	{
		SoftAssert softassert1 =new SoftAssert() ;// obect created for a particular test case
		System.out.println("A3");
		softassert1.assertEquals(true, true);
		
		System.out.println("pass");
		
		
		softassert1.assertEquals(true, false);
	    System.out.println("fail");
		
		
		softassert1.assertEquals(true, true);
	    System.out.println("pass");
	    
	
	    
	}
	@Test
	public void soft_assert2()
	
	{
		SoftAssert softassert2 =new SoftAssert() ; // object created for a particular test case
		
		System.out.println("A3");
		softassert2.assertEquals(true, true);
		
		System.out.println("pass");
		
		
		softassert2.assertEquals(true, true);
	    System.out.println("pass");
		
		
		softassert2.assertEquals(true, true);
	    System.out.println("pass");
	    
	    softassert2.assertAll();
	    
	 }
	@Test
	public void soft_assert6()
	
	{
		SoftAssert softassert6 =new SoftAssert() ;// object created for a particular test case
		System.out.println("A3");
		
		softassert6.assertEquals(true, true);
		
		System.out.println("pass");
		
		
		softassert6.assertEquals(false, true);
	    System.out.println("pass");
		
		
		softassert6.assertEquals(true, true);
	    System.out.println("pass");
	    
	    softassert6.assertAll(); // collect all data of soft assert if one isfailed then complete tesst case is fail
	    
	    
	 }
	@Test(priority=1)
	public void softassert3()
	
	{
		
		System.out.println("A3");
		softassert.assertEquals(true, true);
		System.out.println("pass");
		
		System.out.println("A3");
		softassert.assertEquals(true, true);
		System.out.println("pass");
		
		softassert.assertAll(); 
		// object used for all test case 
	
	}
	@Test(priority=2)
	public void softassert4()
	
	{
		
		System.out.println("A4");
		softassert.assertEquals(false, true);
		System.out.println("fail");
		
		softassert.assertAll();
		
		// object used for all test case 
		//case1:::::if softassert used for all test case in this case if above test case is fail i.e firsttest case is failed 
		//then all following test case marked as failed 
		//case 2:::::: if above test case passed i.e priority  test case is passed
		// and priority 2 test case is failed then it will marked as failed 
	
	}
	
	
	
	
	
}
