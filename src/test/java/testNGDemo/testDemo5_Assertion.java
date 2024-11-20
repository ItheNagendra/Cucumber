package testNGDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testDemo5_Assertion {
	
  @Test(priority=1)
  public void hardAssertionTest() 
  {
	  
	  String act = "Selenium WebDriver is WebUI Automation Library";
	  String expt = "Selenium WebDriver is WebUI Automation library";
	  
	  // assertEquals()
	  
	  //Assert.assertEquals(act, expt, "Fail: String are not equal");
	  //System.out.println("Pass: Strings are equal");
	  //System.out.println("Hard assertion is completed!"); 
	  
	  
	  //assertTrue - expecting true condition
	 // Assert.assertTrue(act.contains(expt), "Fail: Actual string doesnt contain same matter");  
	  //System.out.println("Hard assertion is completed!"); 
	  
	  
	  //assertFalse - expecting false condition
	  //Assert.assertFalse(act.contains(expt),"Fail: String are equal");
	  //System.out.println("pass: Actual String not contain same matter");
	  //System.out.println("Hard assertion is completed!"); 
 
  }
  
  @Test(priority=2)
  public void softAssertionTest() 
  {
	  
	  SoftAssert sf = new SoftAssert();
	  
	  int a=100 ,b=200 ;
	  
	  // assertEquals()
	 // sf.assertEquals(a, b, "Fail: Number are not equals");
	  //System.out.println("Pass : Numbers are Equals");
	  
	  //sf.assertAll();
	  //System.out.println("This is soft assertion test case");
	  
	  
	  //sf.assertEquals(a==b, "Fail: Number are not equals");
	  //System.out.println("Pass : Numbers are Equals");
	  //System.out.println("This is soft assertion test case");
	  //sf.assertAll();
	  
	  

	  AssertJUnit.assertEquals(a==b, "Fail: Number are not equals");
	  System.out.println("Pass : Numbers are Equals");
	  System.out.println("This is soft assertion test case");
	  sf.assertAll();
  }
  
}
