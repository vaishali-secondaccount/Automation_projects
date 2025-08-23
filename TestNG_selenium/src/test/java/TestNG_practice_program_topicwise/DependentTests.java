package TestNG_practice_program_topicwise;
import org.testng.annotations.Test;

public class DependentTests {

    @Test
    public void login() {
        System.out.println("Login Successful");
    }

    @Test(dependsOnMethods = {"login"})
    public void searchProduct() {
        System.out.println("Product search completed");
    }

    @Test(dependsOnMethods = {"searchProduct"})
    public void logout() {
        System.out.println("Logout Successful");
    }
}
