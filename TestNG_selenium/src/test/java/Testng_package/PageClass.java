package Testng_package;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageClass {
	WebDriver driver;
	By email=By.id("userid");
	By pass=By.id("pass");
	By cont=By.id("signin-continue-btn");
	By search=By.id("gh-ac");
	By submit=By.id("sgnBt");
	
	public PageClass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void email_in()
	{
		driver.findElement(email).click();
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys("ahirekinjal@gmail.com");
		
	}
	public void pass_in()
	{
		driver.findElement(pass).click();
		driver.findElement(pass).sendKeys("");
		
	}
	public void con_in()
	{
		driver.findElement(cont).click();
	
	}
	public void search_in()
	{
		 List<String> items = new ArrayList<>();
	        items.add("Laptop");
	        items.add("watch");
	        items.add("bag");

	        for (String item : items) {
	            WebElement searchBox = driver.findElement(search);
	            searchBox.clear();
	            searchBox.sendKeys(item);
	            searchBox.sendKeys(Keys.ENTER);
	        }
		
	}
	public void submit_in()
	{
		driver.findElement(submit).click();
	
	}
	public void login() {
		driver.findElement(email).click();
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys("ahirekinjal@gmail.com");
		driver.findElement(cont).click();
		driver.findElement(pass).click();
		driver.findElement(pass).sendKeys("Kinjal@1912");
		driver.findElement(submit).click();
		
	}
	

}
