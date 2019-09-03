package tests;

import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.LoginPage;
import page.objects.ShoppingProcessPages;
import page.objects.TestBase;




public class BuyProcessTest extends TestBase {
    @Test
    public void buySomething() {

        HomePage signIn = new HomePage(driver);
        signIn.clickSignIN();
        LoginPage login = new LoginPage(driver);
        login.emailFieldlogin("testingTest@gmail.com");
        login.Password("testtest");
        login.clickLoginButton();
        ShoppingProcessPages shoppingProcessPage = new ShoppingProcessPages(driver);
        shoppingProcessPage.clickOnWomenButtonShop();
        shoppingProcessPage.getClothes();
        shoppingProcessPage.addToCard();
        shoppingProcessPage.proceedToCheckOUT();
        shoppingProcessPage.checkTotalValueOfOrderInSummaryTab();
        shoppingProcessPage.proceedToCheckoutSignInPageL();
        shoppingProcessPage.proceedToCheckoutAddress();
        shoppingProcessPage.approveTermsAndConditionsButton();
        shoppingProcessPage.payByBank();
        shoppingProcessPage.finalConfirmationPaymentClickButton();
        shoppingProcessPage.getLastPrice();


    }
}
