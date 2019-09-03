package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import java.util.concurrent.TimeUnit;

public class ContactObject extends TestBase {

    private Logger logger = LogManager.getRootLogger();
    private WebDriver driver;

    public ContactObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "contact-link")
    private WebElement contactBaner;

    @FindBy(id= "id_contact")
    private WebElement subjectDropdown;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "fileUpload")
    private WebElement uploadFile;

    @FindBy(id = "message")
    private WebElement messageField;

    @FindBy(id = "submitMessage")
    private WebElement clickSubmitMessageButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p")
    private WebElement messageSent;

    public void ClickContactBaner(){
        contactBaner.click();
        logger.info("Clicked to Contact Baner");
    }

    public void selectSubject(){
        Select buttonSubject = new Select(subjectDropdown);
         buttonSubject.selectByVisibleText("Webmaster");
         logger.info("Value from button is selected");
    }
    public void typeEmail(){
        email.click();
        email.sendKeys("testemail@gmail.com");
        logger.info("Email field filled");
    }

    public void uploadFile(){
        uploadFile.sendKeys("C:\\test.png");
        logger.info("File updated");

    }

    public void uploadMessageField(){
        messageField.sendKeys("Test message");
        logger.info("Text field filled");
    }

    public void submitFormButton(){
        clickSubmitMessageButton.click();
        logger.info("Submit button is clicked");
    }

    public void checkIfMessageSent(){
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        messageSent.isDisplayed();
        logger.info("Checked if form is sent");
    }
}
