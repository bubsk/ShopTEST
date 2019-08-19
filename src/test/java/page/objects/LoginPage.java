package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertTrue;

public class LoginPage {

    private Logger logger = LogManager.getRootLogger();
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(id="email")
    private WebElement loginEmailField;

    @FindBy(id="SubmitLogin")
    private WebElement SubmitLoginButton;
    @FindBy(id="passwd")
    private WebDriver searchforPasswd;
    @FindBy(id="passwd")
    private WebElement passwordFieldLogin;



    public void clickLoginButton(){
        SubmitLoginButton.click();
    }
    public void emailFieldlogin(String loginLog){
        loginEmailField.click();
        loginEmailField.sendKeys(loginLog);
    }

    public void Password(String password){
        passwordFieldLogin.click();
        passwordFieldLogin.sendKeys(password);
    }

}
