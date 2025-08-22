package Sele_package;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_demo {
	public static void performLogin(WebDriver driver, String username, String password, String testDescription) throws InterruptedException {
        System.out.println("Manual Test --> " + testDescription);

        WebElement userField = driver.findElement(By.id("user_login"));
        userField.clear();
        userField.sendKeys(username);

        // Clear and enter password
        WebElement passField = driver.findElement(By.id("user_password"));
        passField.clear();
        passField.sendKeys(password);

        // Click on sign in
        driver.findElement(By.name("submit")).click();
        Thread.sleep(2000); 

        System.out.println("Attempted login with Username: '" + username + "' | Password: '" + password + "'");
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       
        driver.get("http://zero.webappsecurity.com/login.html");
        System.out.println("Welcome to Zero Bank Login Page");
        System.out.println("================================");

       
        performLogin(driver, "8875675", "password", "Invalid username & valid password");
        performLogin(driver, "username", "jhal86765", "Valid username & invalid password");
        performLogin(driver, "8875675", "987534", "Invalid username & invalid password");
        performLogin(driver, "", "", "Null credentials");
        performLogin(driver, "username", "password", "Valid username & valid password");

       
        driver.close();
    }
}