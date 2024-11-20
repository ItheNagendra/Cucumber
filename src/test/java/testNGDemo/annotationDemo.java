package testNGDemo;

import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotationDemo {
	
  @Test (priority=1)
  public void registerTest()
  {
	  System.out.println("This is Register test");
  }
  
  @Test (priority=2)
  public void loginTest()
  {
	  System.out.println("This is login test");
  }
  
  @Test (priority=3)
  public void logoutTest()
  {
	  System.out.println("This is logout test");
  }
  
  //Annotation
  @BeforeMethod
  public void bMethod()
  {
	  
	  System.out.println("BeforeMethod executes before every test case");
  }
  
  @AfterMethod
  public void aMethod()
  {
	  
	  System.out.println("AfterMethod executes After every test case");
  }
  
  
  @BeforeClass
  public void bClass()
  {  
	  System.out.println("BeforeClass executes before only first class");
  }
  
  @AfterClass
  public void aClass()
  {
	  
	  System.out.println("AfterClass executes After only last class");
  }
  
  @BeforeTest
  public void bTest()
  {  
	  System.out.println("BeforeTest will run before class/All classes");
  }
  
  
  @AfterTest
  public void aTest()
  {  
	  System.out.println("AfterTest will run after class/All classes");
  }
  
  @BeforeSuite
  public void bSuite()
  {  
	  System.out.println("BeforeSuite will run before test");
  }
  
  
  @AfterSuite
  public void aSuite()
  {  
	  System.out.println("BeforeSuite will run after test");
  }
 }
  
  
  
  

