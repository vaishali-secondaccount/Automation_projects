package Asserts_demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class Selenium_dev {
WebDriver driver;
boolean stopExecution=true;

  @BeforeClass
  public void beforeClass() {
	 driver=new ChromeDriver(); 
	 driver.get("https://www.selenium.dev/");
	 driver.manage().window().maximize();
	
	  
  }
  @Test
  public void title() {
	  if(stopExecution)
	  {
		  throw new SkipException("Skitpping test");
	  }
	  String expectedtitle="Selenium dev";
	  String actualtitle=driver.getTitle();
	  boolean result = actualtitle.equals(expectedtitle);
	 Assert.assertEquals(actualtitle, expectedtitle,"Title Validation failed");
	 System.out.println("Expected Title:"+expectedtitle);
	  System.out.println("Actual Title:"+actualtitle);
	  Assert.fail("Failing title");
//	  if(result==false)
//	  {
//	   Assert.fail("Failing title");
//	  }
//	  else
//	  {
//		  System.out.println("Title Validated sucessfully");
//	  }
//	  
	  
  }
  @Test
  public void url() {
	  if(stopExecution)
	  {
		  throw new SkipException("Skitpping test");
	  }
	  String expectedurl="https://www.selenium.dev/";
	  String actualurl=driver.getCurrentUrl();
	  boolean result = actualurl.equals(expectedurl);//false
	  Assert.assertEquals(actualurl, expectedurl,"URL Validation failed");
	  System.out.println("Expected URL:"+expectedurl);
	  System.out.println("Actual URL:"+actualurl);
	  Assert.fail("Failing title");
//	  if(result==false)
//	  {
//	   Assert.fail("Failing URL");
//	  }
//	  else
//	  {
//		  System.out.println("Title Validated sucessfully");
//	  }
	  
	  
  }
//  @AfterClass
//  public void afterClass()
//  {
//	  driver.close();
//  }

  @AfterClass
  public void afterClass(ITestResult result) {
	  if(result.getStatus()==ITestResult.FAILURE)
	  {
		  stopExecution=true;
	  }
	  driver.close();
	  
  }

}
