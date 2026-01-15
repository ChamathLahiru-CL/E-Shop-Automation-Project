package org.Methods.testCases;

import org.testng.annotations.Test;

public class directLogin_Test extends BaseTest{

    String userEmail = "lahirutest01@gmail.com";
    String pw = "lahirutest01";


    @Test
    public void login(){
        directLoginPage.openLoginPage();
        directLoginPage.loginDirect(userEmail,pw);
        directLoginPage.loginButton();
    }
}
