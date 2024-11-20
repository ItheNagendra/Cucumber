package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class testDemo3_PriorityAttribute
{
  @Test(priority=1,description="This is first test case")
  public void registerTest() 
  {
	  System.out.println("This is register test");
	  
  }
  
  
  
	  @Test(priority=2,description="This is second test case")
	  public void loginTest() 
	  {
		  System.out.println("This is Login test");
		  
	  }
	  
	  
	  
		  @Test(priority=3,description="This is third test case")
		  public void searchProductTest() 
		  {
			  System.out.println("This is searchProduct test");
			  
		  }
		  
		  
		  
			  @Test(priority=4,description="This is forth test case")
			  public void addToCartTest() 
			  {
				  System.out.println("This is addToCart test");
				  
			  }
}
