package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.LoginPage;
import page.objects.ShoppingProcessPages;
import page.objects.TestBase;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class BuyProcessTest extends  TestBase{
     @Test
    public void buySomething(){

         HomePage signIn = new HomePage(driver);
         signIn.clickSignIN();

         LoginPage login = new LoginPage(driver);
         login.emailFieldlogin("testingTest@gmail.com");
         login.Password("testtest");
         login.clickLoginButton();
         ShoppingProcessPages shoppingProcessPage = new ShoppingProcessPages(driver);
         shoppingProcessPage.clickOnWomenButtonShop();
         shoppingProcessPage.Getclothes();
     }
}
