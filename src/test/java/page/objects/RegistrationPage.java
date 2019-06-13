package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertTrue;

public class RegistrationPage {
   private Logger logger = LogManager.getRootLogger();
    private WebDriver driver;

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    @FindBy(id="email_create")
   private WebElement typeEmailField;

    @FindBy(id = "customer_firstname")
    private WebElement typeFirstName;

    @FindBy(id = "customer_lastname")
    private WebElement typeLastNamec;
    @FindBy(id = "passwd")
    private WebElement typePassword;
    @FindBy(id = "address1")
    private WebElement typeADdress;
    @FindBy(id="city")
    private WebElement typecity;
    @FindBy(id = "id_state")
    private WebElement typeState;
    @FindBy(id = "postcode")
    private WebElement typePostcode;
    @FindBy(id = "phone_mobile")
    private WebElement typeMobilePhone;
    @FindBy(id ="submitAccount")
    private WebElement submitButtonRegistration;



    @FindBy(id = "SubmitCreate")
    private WebElement SubmitButton;


       public void typeEmailCreatingAccount(String email){
           typeEmailField.sendKeys(email);
           logger.info("type email");
       }
       public void clickSubmitButton(){
        SubmitButton.click();
        logger.info("Click Submit Button");
       }

       public void  FirstNameRegistration(){
           typeFirstName.click();
           typeFirstName.sendKeys("Test Name");
           logger.info("Type First Name");
       }
       public void LastNameRegistration(){
           typeLastNamec.click();
           typeLastNamec.sendKeys("Test LastName");
           logger.info("Type Last Name");

       }
       public void TypePassword(){
           typePassword.click();
           typePassword.sendKeys("test1234");
       }
       public void TypeAddress(){
           typeADdress.click();
           typeADdress.sendKeys("Test Address");
       }

       public void TypeCity(){
           typecity.click();
           typecity.sendKeys("TestCity");

       }

    public void TypePostCode(){
        typePostcode.click();
        typePostcode.sendKeys("12345");
       }
    public void TypeMobilePhone(){
        typeMobilePhone.click();
        typeMobilePhone.sendKeys("123456789");
    }

       public void TypeState(){
         //  typeState.click();
           Select drop2down = new Select(typeState);

           drop2down.selectByIndex(2);
       }

       public void clickFinishReistrationSubmitButton(){
           submitButtonRegistration.click();

       }

       public void waitClassName(String nameclass){
           WebElement dialog = driver.findElement(By.className(nameclass));
           assertTrue(dialog.isDisplayed());

       }
public void waitForPage(String idPage){

    WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idPage)));

    WebElement dialog = driver.findElement(By.id(idPage));
    assertTrue(dialog.isDisplayed());
}

}
