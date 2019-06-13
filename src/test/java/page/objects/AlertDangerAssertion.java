package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.TestBase;
import static org.testng.Assert.assertTrue;

public class AlertDangerAssertion extends TestBase {
    public AlertDangerAssertion
            (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void waitForErrorRegLog(){

        WebElement dialog = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]"));
        assertTrue(dialog.isDisplayed());
    }
}
