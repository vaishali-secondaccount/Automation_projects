package Testng_package;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class EbayTestCases {
	

    WebDriver driver;
    PageClass pg;

    
    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        pg=new PageClass(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
        driver.get("https://www.ebay.com/");
        System.out.println("Opened EBay website successfully.");
        
    }

    
    @Test(priority = 1)
    public void testLogin() throws InterruptedException {
        driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh");

        // login
       // PageClass pg=new PageClass(driver);
        pg.email_in();
        pg.con_in();
        pg.pass_in();
        pg.submit_in();

       
    }

    // 2. Multiple searches using ArrayList
    @Test(priority = 2)
    public void testMultipleSearches() {
    	
    	 pg.search_in();
            
         
    }

    // 3. Add to cart
    @Test(priority = 3)
    public void testAddToCart() throws InterruptedException {
        driver.findElement(By.id("gh-ac")).sendKeys("watch");
        driver.findElement(By.id("gh-ac")).sendKeys(Keys.ENTER);
        driver.findElement(By.partialLinkText("Citizen Men's Tsuyosa Automatic Blue Dial Watch - NJ0150-56L NEW")).click();
        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
        if (!iframes.isEmpty()) {
            driver.switchTo().frame(iframes.get(0));
        }
       
       JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,400)");
  
       WebElement addtocart= driver.findElement(By.partialLinkText("Add to cart"));

       addtocart.click();
       
//       driver.findElement(By.id("gh-cart-n")).click();
//       driver.findElement(By.cssSelector(".remove-item a")).click();
//       Assert.assertTrue(driver.getPageSource().contains("removed"));
    }
   // 4. Shop by all categories
    @Test(priority = 4)
    public void testShopByAllCategories() {
        driver.findElement(By.cssSelector("select>option[value=\"2984\"]")).click();
        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        
        searchBox.sendKeys("Toys");
        searchBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(driver.getTitle().contains("All Categories"));
    }

   
    
    @Test
    public void afterTestMethod() {
        JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,1200)");
        driver.findElement(By.cssSelector("button[class=\"gf-flag__button\"]")).click();
        driver.findElement(By.linkText("china")).click();
    }

   
}
