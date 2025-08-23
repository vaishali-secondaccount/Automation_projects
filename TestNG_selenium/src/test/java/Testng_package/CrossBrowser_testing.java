package Testng_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CrossBrowser_testing {
	WebDriver driver;
  @Test
  public void chromebrowser() throws InterruptedException {
	 driver = new ChromeDriver();
      driver.get("https://www.flipkart.com/");
      String expectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
      String actualtitle = driver.getTitle();
      Assert.assertEquals(actualtitle, expectedtitle, "Title validation fail");
      Thread.sleep(3000);
     
  }
  
  @Test
  public void firefoxbrowser() throws InterruptedException {
	 driver = new FirefoxDriver();
      driver.get("https://www.flipkart.com/");
      String expectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
      String actualtitle = driver.getTitle();
      Assert.assertEquals(actualtitle, expectedtitle, "Title validation fail");
      Thread.sleep(3000);
     
  }
  @Test
  public void edgebrowser() throws InterruptedException {
	 System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Desktop\\Wipro_DayWiseSyllabus\\Selenium_jar\\msedgedriver.exe");
	 driver = new EdgeDriver();
      driver.get("https://www.flipkart.com/");
      driver.manage().window().maximize();
      String expectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
      String actualtitle = driver.getTitle();
      Assert.assertEquals(actualtitle, expectedtitle, "Title validation fail");
      Thread.sleep(3000);
     
  }
  @AfterMethod
  public void afterTest()
  {
	driver.quit(); 
  }
}
