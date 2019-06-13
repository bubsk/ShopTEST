package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page.objects.AlertDangerAssertion;
import page.objects.HomePage;
import page.objects.LoginPage;
import page.objects.RegistrationPage;

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
    login.emailFieldlogin();
    login.PasswordWrong();
    login.clickLoginButton();
    AlertDangerAssertion alertemptyfield = new AlertDangerAssertion(driver);
    alertemptyfield.waitForErrorRegLog();
}
}
