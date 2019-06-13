package tests;

import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.RegistrationPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class RegistrationFail extends TestBase {


    @Test
    // test fail with existing email
    public void emailExists() {
        HomePage signIn = new HomePage(driver);
        signIn.clickSignIN();
        RegistrationPage typeemail = new RegistrationPage(driver);
        typeemail.typeEmailCreatingAccount("test@o2.pl");
        typeemail.clickSubmitButton();
        typeemail.waitForPage("create_account_error");

    }
    @Test
    // test fail with empty fields durning registration
    public void newEmailEmptyFields(){
        HomePage signIn = new HomePage(driver);
        signIn.clickSignIN();


        String userName = "" + (int) (Math.random() * Integer.MAX_VALUE);
        String emailID = "User" + userName + "@gmail.com";

        RegistrationPage TestExisting = new RegistrationPage(driver);
        TestExisting.typeEmailCreatingAccount(emailID);
        TestExisting.clickSubmitButton();
        TestExisting.waitForPage("account-creation_form");
        TestExisting.clickFinishReistrationSubmitButton();
        // TestExisting.waitClassName("container");
        // AlertDangerAssertion alertDangerInfo = new AlertDangerAssertion();
        //  alertDangerInfo.waitForDangerInfo();

    }


}