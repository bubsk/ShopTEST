package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    public WebDriver driver;
    @BeforeMethod
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();

        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void afterTest() {
       // driver.close();
     //   driver.quit();
    }

}
