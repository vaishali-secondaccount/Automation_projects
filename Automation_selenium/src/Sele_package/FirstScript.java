package Sele_package;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("This is my first Automation Script");
		//setup browser (Chrome driver, firefox driver)
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\Wipro_DayWiseSyllabus\\Selenium_jar\\chromedriver-win64\\chromedriver.exe");
		// create object for Browser
			
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev");
		
		String expectedurl="https://www.selenium";
		String actualurl=driver.getCurrentUrl();
		
		System.out.println("Expected URL:"+expectedurl);
		System.out.println("Actual URL:"+actualurl);
		
		
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		if(expectedurl.equals(actualurl))
		{
			System.out.println("Url Validation sucessful");
		}
		else
		{
			System.out.println("Url Validation failed");
		}
		driver.close();
		System.out.println("Page load successfully");
		}
		
		

	

}
