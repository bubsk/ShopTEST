package tests;

import org.testng.annotations.Test;
import page.objects.*;

public class LoginPass extends TestBase {
    @Test
    // sucessfull log

    public void LoginPass2() {

        HomePage signIn = new HomePage(driver);
        signIn.clickSignIN();

         LoginPage login = new LoginPage(driver);
        login.emailFieldlogin("testingTest@gmail.com");
        login.Password("testtest");
        login.clickLoginButton();



    }
}
