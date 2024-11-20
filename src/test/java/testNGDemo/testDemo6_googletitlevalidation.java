package testNGDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testDemo6_googletitlevalidation {
  @Test
  public void titlevalidation()
 {

	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	 String actTitle = driver.getTitle();
	 System.out.println("actTitle is:" + driver.getTitle());
	  AssertJUnit.assertEquals(actTitle, "Google","Fail:Title is not matched");
	  System.out.println("Title is matched");
	  
  }
}
