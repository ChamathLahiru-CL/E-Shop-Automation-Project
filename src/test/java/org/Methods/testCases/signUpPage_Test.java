package org.Methods.testCases;

import org.testng.annotations.Test;

public class signUpPage_Test extends BaseTest{

    @Test
    public void testSignUp(){
        signUpPage.openSignLogin();
        signUpPage.signUp("testLahiru01","lahirutest01@gmail.com");
        signUpPage.createAccount("Mr", "lahirutest01","15", "May", "1998","lahiru","nimsara",
                "cl","Paththanduwana","Minuwangoda","Israel","Westren","Gampha",
                "99910","011221122");
        signUpPage.clickCreateAccount();
        signUpPage.afterCreatedContinueBT();
    }

    @Test
    public void validateTesting(){
        signUpPage.openSignLogin();
        signUpPage.signUp("testLahiru01","lahirutest01@gmail.com");
        signUpPage.clickCreateAccount();
    }


}
