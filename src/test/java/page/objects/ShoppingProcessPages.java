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
import org.testng.Assert;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.xpath;

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

    @FindBy(xpath = "//a[@class='button ajax_add_to_cart_button btn btn-default']")
    private WebElement addToCardButtonClick;

    @FindBy(id = "total_price")
    private WebElement totalPriceOfOrder;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    private WebElement proceedToCheckout;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
    private WebElement proceedToCheckoutButtonFinal;

    @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
    private WebElement proceedToCheckoutAddressPage;

    @FindBy(id = "cgv")
    private WebElement termsButton;

    @FindBy(xpath = "//*[@id=\"form\"]/p/button")
    private WebElement proceedTocheckoutSHipping;

    @FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
    private WebElement payByBankWire;

    @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
    private WebElement finalConfirmationOfPayment;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/span")
    private WebElement getPriceWhenOrderIsPaid;


    public void clickOnWomenButtonShop() {
        typeEmailField.click();
        logger.info("Clicked on Women Button");
    }


    public void Getclothes(){
        List<WebElement> productName = productList.findElements(xpath("//h5"));
        for (WebElement element: productName){
            System.out.println(element.getText());
        }

    }
    public void addToCard() {
        addToCardButtonClick.click();
        logger.info("Added product to card");
    }

    public String checkTotalValueOfOrderInSummaryTab(){
        return totalPriceOfOrder.getText();
    }



    public void proceedToCheckOUT() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")));
        proceedToCheckout.click();
        logger.info("Proceeded to checkout");
    }

    public void proceedToCheckoutSignInPageL() {
        proceedToCheckoutButtonFinal.click();
        logger.info("Proceeded to checkout signIN page");
    }
    public void proceedToCheckoutAddress(){
        proceedToCheckoutAddressPage.click();
        logger.info("Proceeded to checkout Address Page");
    }

    public void approveTermsAndConditionsButton(){
        termsButton.click();
        proceedTocheckoutSHipping.click();
        logger.info("Checkbox selected");
    }
    public void payByBank(){
        payByBankWire.click();
        logger.info("Bank Wire payment clicked");
    }
    public void finalConfirmationPaymentClickButton(){
        finalConfirmationOfPayment.click();
        logger.info("Last oonfirmation of payment");
    }

    public String getLastPrice(){
        return getPriceWhenOrderIsPaid.getText();
    }
}
