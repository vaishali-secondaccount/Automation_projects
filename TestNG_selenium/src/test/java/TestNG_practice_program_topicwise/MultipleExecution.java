package TestNG_practice_program_topicwise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MultipleExecution {
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		 driver=new ChromeDriver(); 
		 driver.get("https://www.selenium.dev/");
		 driver.manage().window().maximize();
	}
  @Test
  public void repeattest() {
	  for (int i = 1; i <= 3; i++) {
	  String expectedtitle="Selenium dev";
  	  String actualtitle=driver.getTitle();
  	  boolean result = actualtitle.equals(expectedtitle);
  	 Assert.assertEquals(actualtitle, expectedtitle,"Title Validation failed");
  	 System.out.println("Expected Title:"+expectedtitle);
  	  System.out.println("Actual Title:"+actualtitle);
	  }
  }
}
