package TestNG_practice_program_topicwise;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DisableTest {
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		 driver=new ChromeDriver(); 
		 driver.get("https://www.selenium.dev/");
		 driver.manage().window().maximize();
	}

    @Test(enabled = true)  
    public void activeTest() {
    	String expectedtitle="Selenium dev";
  	  String actualtitle=driver.getTitle();
  	  boolean result = actualtitle.equals(expectedtitle);
  	 Assert.assertEquals(actualtitle, expectedtitle,"Title Validation failed");
  	 System.out.println("Expected Title:"+expectedtitle);
  	  System.out.println("Actual Title:"+actualtitle);
    }

    @Test(enabled = false)  
    public void disabledTest() {
    	String expectedurl="https://www.selenium.dev/";
  	  String actualurl=driver.getCurrentUrl();
  	  boolean result = actualurl.equals(expectedurl);//false
  	  Assert.assertEquals(actualurl, expectedurl,"URL Validation failed");
  	  System.out.println("Expected URL:"+expectedurl);
  	  System.out.println("Actual URL:"+actualurl);

    }
    @AfterClass
  public void afterClass()
  {
	  driver.close();
  }
}
