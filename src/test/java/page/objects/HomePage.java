package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class HomePage {
   private Logger logger = LogManager.getRootLogger();
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
      @FindBy(xpath ="//*[@class='login']")
      WebElement SiginButton;


    public void clickSignIN(){
        SiginButton.click();
        logger.info("Click sign in button");

    }


}
