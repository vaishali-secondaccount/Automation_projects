package Asserts_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class depend_method {
	WebDriver driver;
	SoftAssert soft;
	

	  @BeforeClass
	  public void beforeClass() {
		 driver=new ChromeDriver(); 
		 driver.get("https://www.selenium.dev/");
		 driver.manage().window().maximize();
		 soft=new SoftAssert();
	  }
		
  @Test
  public void title() {
	  String expectedtitle="Selenium dev";
	  String actualtitle=driver.getTitle();
	 // boolean result = actualtitle.equals(expectedtitle);
	 soft.assertEquals(actualtitle, expectedtitle,"Title Validation failed");
	 System.out.println("Expected Title:"+expectedtitle);
	  System.out.println("Actual Title:"+actualtitle);
	  
	  // URL validation
	  String expectedurl="https://www.selenium.dev/";
	  String actualurl=driver.getCurrentUrl();
	//  boolean result = actualurl.equals(expectedurl);//false
	  soft.assertEquals(actualurl, expectedurl,"URL Validation failed");
	  System.out.println("Expected URL:"+expectedurl);
	  System.out.println("Actual URL:"+actualurl);
	 
  }
 
 
  @AfterMethod
  public void am()
  {
	  driver.close();
  }
  
}
