package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class testDisableFromExecution {
  @Test
  public void testCase1() 
  {
	  System.out.println("This is test case1");
  }
  
  @Test
  public void testCase2() 
  {
	  System.out.println("This is test case2"); 
  }
  
  
  // i want to disable this from execution
  @Test (enabled=false)
  public void testCase3() 
  {
	  System.out.println("This is test case3"); 
  }
  
  @Test
  public void testCase4() 
  {
	  System.out.println("This is test case4"); 
  }
}
