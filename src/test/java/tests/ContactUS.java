package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.ContactObject;
import page.objects.TestBase;

public class ContactUS extends TestBase {

    @Test
            public void sendMessageToSupport(){

    ContactObject contact = new ContactObject(driver);
    contact.ClickContactBaner();
    contact.selectSubject();
    contact.typeEmail();
    contact.uploadFile();
    contact.uploadMessageField();
    contact.submitFormButton();
    contact.checkIfMessageSent();

}
}