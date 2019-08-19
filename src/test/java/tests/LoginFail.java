package tests;

import org.testng.annotations.Test;
import page.objects.*;

import static org.testng.Assert.assertTrue;

public class LoginFail extends TestBase {

@Test
    // test with empty log fields
    public void LoginFail(){

    HomePage signIn = new HomePage(driver);
    signIn.clickSignIN();

    LoginPage login = new LoginPage(driver);

    login.clickLoginButton();
    AlertDangerAssertion alertemptyfield = new AlertDangerAssertion(driver);
   alertemptyfield.waitForErrorRegLog();

}
@Test public void LoginFailWrongMail(){
    HomePage signIn = new HomePage(driver);
    signIn.clickSignIN();

    LoginPage login = new LoginPage(driver);
    login.emailFieldlogin("neveUsedWrongEmail@test.com");
    login.Password("WrongPassword23");
    login.clickLoginButton();
    AlertDangerAssertion alertemptyfield = new AlertDangerAssertion(driver);
    alertemptyfield.waitForErrorRegLog();
}
}
