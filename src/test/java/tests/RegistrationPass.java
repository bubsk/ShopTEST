package tests;

import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.RegistrationPage;
import page.objects.TestBase;

import static org.testng.Assert.assertTrue;

public class RegistrationPass extends TestBase {


    @Test
    public void newEmail() {


        HomePage signIn = new HomePage(driver);
        signIn.clickSignIN();
        RegistrationPage typeemail = new RegistrationPage(driver);
        String emailID = typeemail.newRandomMail();
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
