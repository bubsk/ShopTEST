package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Array;
import java.util.List;

public class ShoppingProcessPages {
   private Logger logger = LogManager.getRootLogger();
    private WebDriver driver;

    public ShoppingProcessPages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(className ="sf-with-ul")
    private WebElement typeEmailField;

    @FindBy(className = "product_list grid row")
    private WebElement productList;


    public void clickOnWomenButtonShop() {
        typeEmailField.click();
        logger.info("Clicked on Women Button");
    }

    public void Getclothes(){
        List<WebElement> productName = productList.findElements(By.xpath("//h5"));
        for (WebElement element: productName){
            System.out.println(element.getText());
        }

    }
}
