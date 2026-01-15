package org.Methods.testCases;

import org.testng.annotations.Test;

public class dashboard_Test extends BaseTest{

    String userEmail = "lahirutest01@gmail.com";
    String pw = "lahirutest01";

    @Test
    public void selectProduct(){
        directLoginPage.openLoginPage();
        directLoginPage.loginDirect(userEmail,pw);
        directLoginPage.loginButton();
        homePage.addToCart();
        homePage.viewCartAfterAddCart();
    }

    @Test
    public void tesrViewProduct(){
        directLoginPage.openLoginPage();
        directLoginPage.loginDirect(userEmail,pw);
        directLoginPage.loginButton();
        homePage.viewProduct();
    }

    @Test
    public void testLogOutAfterLogin(){
        directLoginPage.openLoginPage();
        directLoginPage.loginDirect(userEmail,pw);
        directLoginPage.loginButton();
        homePage.logout();
    }

    @Test
    public void testPoloBrand(){
        directLoginPage.openLoginPage();
        directLoginPage.loginDirect(userEmail,pw);
        directLoginPage.loginButton();
        homePage.poloBrands();
        homePage.poloBrandSelect();
        homePage.viewCartAfterAddCart();
    }

    @Test
    public void testProductPage(){
        directLoginPage.openLoginPage();
        directLoginPage.loginDirect(userEmail,pw);
        directLoginPage.loginButton();
        homePage.openProductPage();
        homePage.ProductPageaddToCart();
        homePage.viewCartAfterAddCart();
    }

    @Test
    public void testCartItemDelete(){
        directLoginPage.openLoginPage();
        directLoginPage.loginDirect(userEmail,pw);
        directLoginPage.loginButton();
        homePage.cart();
        cartPage.delete();
    }

    @Test
    public void testCheckOut(){
        directLoginPage.openLoginPage();
        directLoginPage.loginDirect(userEmail,pw);
        directLoginPage.loginButton();
        homePage.cart();
        cartPage.checkout();
    }

    @Test
    public void testPlaceOrder(){
        directLoginPage.openLoginPage();
        directLoginPage.loginDirect(userEmail,pw);
        directLoginPage.loginButton();
        homePage.cart();
        cartPage.checkout();
        cartPage.placeOrder("test 01");
    }

    @Test
    public void testPayOrder(){
        directLoginPage.openLoginPage();
        directLoginPage.loginDirect(userEmail,pw);
        directLoginPage.loginButton();
        homePage.cart();
        cartPage.checkout();
        cartPage.placeOrder("test 01");
        cartPage.payOrder("American Express","349970695908409", "1792", "01", "27");
        cartPage.downloadInvoice();
        cartPage.afterPlacedContinue();
    }




}
