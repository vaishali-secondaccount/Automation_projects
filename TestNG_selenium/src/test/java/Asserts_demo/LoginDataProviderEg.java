package Asserts_demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataProviderEg {

   
    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][] {
              
            {"username", "password"},
            {"invalid", "password"},      
            {"username", "invalid"},
            {"invalid", "invalid"}
        };
    }

    // Test method using DataProvider
    @Test(dataProvider = "loginData")
    public void loginTest(String username1, String password1) {
        System.out.println("try login with: " + username1 + " / " + password1);

        // Dummy validation
        if (username1.equals("username") && password1.equals("password")) {
            System.out.println("login successful");
        } else {
            System.out.println("login failed");
        }
    }
}
