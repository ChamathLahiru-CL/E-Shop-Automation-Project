package org.Methods.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class directLoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public directLoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

//    Element Locator
    private By signLogin = By.cssSelector("li a[href='/login']");


    public void openLoginPage(){
        wait.until(ExpectedConditions.elementToBeClickable(signLogin)).click();
    }

    public void loginDirect(String userEmail, String password){
        driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys(userEmail);
        driver.findElement(By.cssSelector("input[data-qa='login-password']")).sendKeys(password);
    }

    public void loginButton(){
        driver.findElement(By.cssSelector("button[data-qa='login-button']")).click();
    }


}
