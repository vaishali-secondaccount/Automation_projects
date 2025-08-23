package Testng_package;


import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelTest {

   
    @DataProvider(name = "excelData")
    public Object[][] excelDataProvider() throws IOException {
        String excelPath = "C:\\Users\\dell\\Desktop\\TestData\\LoginData.xlsx";  
        String sheetName = "Sheet1";

        FileInputStream fis = new FileInputStream(excelPath);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet(sheetName);

        int rows = sheet.getPhysicalNumberOfRows();
        int cols = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rows - 1][cols];

        for (int i = 1; i < rows; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < cols; j++) {
                Cell cell = row.getCell(j);
                data[i - 1][j] = (cell == null) ? "" : cell.toString();
            }
        }

        workbook.close();
        fis.close();

        return data;
    }

    
    @Test(dataProvider = "excelData")
    public void testLogin(String username1, String password1) {
        System.out.println("Username: " + username1 + " | Password: " + password1);
        WebDriver driver=new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        
        driver.findElement(By.id("user_login")).click();
        driver.findElement(By.id("user_login")).sendKeys(username1);
        driver.findElement(By.id("user_password")).click();
        driver.findElement(By.id("user_password")).sendKeys(password1);
        driver.findElement(By.name("submit")).click();
       
    }
}

//TestData(excel file)
//Username        password
//admin           admin@123
//bkdj86765       admin@123
//admin            87645hjhjf
//65754vjg        8764823654hgjhfjg
//null            null