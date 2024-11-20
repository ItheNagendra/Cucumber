package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class testDemo2 {
	
  @Test(priority=3)
  public void chromeTest() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  System.out.println("Title is:" + driver.getTitle());
	  
  }
  
  @Test(priority=2)
  public void firefoxTest() 
  {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.Facebook.com");
	  System.out.println("Title is:" + driver.getTitle());
	  
  }
  
  @Test(priority=1)
  public void edgeTest() 
  {
	  WebDriver driver = new EdgeDriver();
	  driver.get("https://www.Amazon.com");
	  System.out.println("Title is:" + driver.getTitle());
	  
  }
  
  
  
}
