package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class ShoppingProcessPages {
    private Logger logger = LogManager.getRootLogger();
    private WebDriver driver;

    public ShoppingProcessPages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(className = "sf-with-ul")
    private WebElement typeEmailField;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul")
    private WebElement productList;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
    private WebElement clickOnClothes;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")
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

    public void getClothes(){
    List<WebElement> clothesCount = productList.findElements(By.xpath("//*[@id=\"center_column\"]/ul/li"));
        if (clothesCount.size() != 7){
            logger.info("Number of product for women is changed and now is not 7!");
            Assert.fail();

        }else {
            System.out.println("The number of clothes for women =" + " " + clothesCount.size());
        }

    }
    public void addToCard() {
        Actions action = new Actions(driver);
        action.moveToElement(clickOnClothes).perform();
        addToCardButtonClick.click();
        logger.info("Added product to card");
    }

    public void checkTotalValueOfOrderInSummaryTab() {
        String totalPrice= totalPriceOfOrder.getText();
        System.out.println(totalPrice);
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

    public void proceedToCheckoutAddress() {
        proceedToCheckoutAddressPage.click();
        logger.info("Proceeded to checkout Address Page");
    }

    public void approveTermsAndConditionsButton() {
        termsButton.click();
        proceedTocheckoutSHipping.click();
        logger.info("Checkbox selected");
    }

    public void payByBank() {
        payByBankWire.click();
        logger.info("Bank Wire payment clicked");
    }

    public void finalConfirmationPaymentClickButton() {
        finalConfirmationOfPayment.click();
        logger.info("Last oonfirmation of payment");
    }

    public void getLastPrice() {
        String PriceWhenOrderIsPaid = getPriceWhenOrderIsPaid.getText();
        Assert.assertEquals(getPriceWhenOrderIsPaid.getText(), "$19.25" , "Verify price");
        logger.info("Checked if price is correct");

    }
}
