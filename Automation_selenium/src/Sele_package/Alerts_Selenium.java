package Sele_package;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Alerts_Selenium {
 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		WebElement samplealert=driver.findElement(By.partialLinkText("See an example alert"));
		samplealert.click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
		
		Thread.sleep(7000);
		WebElement confirmalert=driver.findElement(By.partialLinkText("See a sample confirm"));
		confirmalert.click();
		
		Alert alert3=driver.switchTo().alert();
		alert3.accept();
		
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(5000);
		
		WebElement promptalert=driver.findElement(By.partialLinkText("See a sample prompt"));
		promptalert.click();
		Thread.sleep(3000);
		Alert alert2=driver.switchTo().alert();
		alert2.sendKeys("sai");
		alert2.accept();
		
		
		
		driver.close();
	}
 
}
 
 