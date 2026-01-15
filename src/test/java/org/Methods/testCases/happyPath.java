package org.Methods.testCases;

import org.testng.annotations.Test;

public class happyPath extends BaseTest{

    String userEmail = "lahirutest01@gmail.com";
    String pw = "lahirutest01";

    @Test
    public void selectProduct(){
        directLoginPage.openLoginPage();
        directLoginPage.loginDirect(userEmail,pw);
        directLoginPage.loginButton();
        homePage.addToCart();
        homePage.viewCartAfterAddCart();
        cartPage.checkout();
        cartPage.placeOrder("test 001");
        cartPage.payOrder("American Express","349970695908409", "1792", "01", "27");
        cartPage.downloadInvoice();
        cartPage.afterPlacedContinue();
    }
}
