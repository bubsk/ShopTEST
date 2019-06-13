package tests;

import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.RegistrationPage;

import static org.testng.Assert.assertTrue;

public class RegistrationPass extends TestBase {
    @Test
    public void newEmail(){


        HomePage signIn = new HomePage(driver);
        signIn.clickSignIN();


        String userName = "" + (int) (Math.random() * Integer.MAX_VALUE);
        String emailID = "User" + userName + "@gmail.com";

        RegistrationPage typeemail = new RegistrationPage(driver);
        typeemail.typeEmailCreatingAccount(emailID);
        typeemail.clickSubmitButton();
        typeemail.waitForPage("account-creation_form");
        typeemail.FirstNameRegistration();
        typeemail.LastNameRegistration();
        typeemail.TypePassword();
        typeemail.TypeAddress();
        typeemail.TypeCity();
        typeemail.TypeState();
        typeemail.TypePostCode();
        typeemail.TypeMobilePhone();
        typeemail.clickFinishReistrationSubmitButton();
        typeemail.waitClassName("icon-list-ol");
    }
}
