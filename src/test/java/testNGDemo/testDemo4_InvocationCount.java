 package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class testDemo4_InvocationCount {
	
	
  @Test(priority=1)
  public void enrollForTheCourse() 
  {
	  System.out.println("Student enroll for the course");
	  
	  
  }
  
	
  @Test(priority=2)
  public void  traning() 
  {
	  System.out.println("Student get the traning for the course");
	  
	  
  }
  
	// here i want to run this test case multiple of time use invocation count attribute
  
  @Test(priority=3,invocationCount=3)
  public void placementCall() 
  {
	  System.out.println("Student get the Placement for the course");
	  
	  
  }
}
