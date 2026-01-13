package org.Methods.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class signUpPage {

    WebDriver driver;
    WebDriverWait wait;

    public signUpPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(100));
    }

//    Element Locators
    private By signLogin = By.cssSelector("li a[href='/login']");
    private By userName = By.cssSelector("input[data-qa='signup-name']");
    private By userEmail = By.cssSelector("input[data-qa='signup-email']");
    private By signUpBt = By.cssSelector("button[data-qa='signup-button']");
    private By pw = By.id("password");

//    Action
    public void openSignLogin(){
        wait.until(ExpectedConditions.elementToBeClickable(signLogin)).click();
    }

    public void signUp(String name, String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(userName)).sendKeys(name);
        driver.findElement(userEmail).sendKeys(email);
        driver.findElement(signUpBt).click();
    }

    public void createAccount(String title, String password, String day, String month, String year, String fName, String lName,
                              String cmp, String address01, String address02, String userCountry, String userState, String userCity,String userZipcode, String userMobile_number){

        WebElement radio = driver.findElement(By.cssSelector("input[type='radio'][name='title'][value='" + title + "']"));
            if (!radio.isSelected()) {
                radio.click();
            };
        driver.findElement(pw).sendKeys(password);
        new Select(driver.findElement(By.id("days"))).selectByVisibleText(day);
        new Select(driver.findElement(By.id("months"))).selectByVisibleText(month);
        new Select(driver.findElement(By.id("years"))).selectByVisibleText(year);
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.id("first_name")).sendKeys(fName);
        driver.findElement(By.id("last_name")).sendKeys(lName);
        driver.findElement(By.id("company")).sendKeys(cmp);
        driver.findElement(By.id("address1")).sendKeys(address01);
        driver.findElement(By.id("address2")).sendKeys(address02);
        Select select = new Select(driver.findElement(By.id("country")));
        select.selectByValue(userCountry);
        driver.findElement(By.id("state")).sendKeys(userState);
        driver.findElement(By.id("city")).sendKeys(userCity);
        driver.findElement(By.id("zipcode")).sendKeys(userZipcode);
        driver.findElement(By.id("mobile_number")).sendKeys(userMobile_number);
    }

    public void clickCreateAccount(){
        driver.findElement(By.cssSelector("button[type='submit']"));
    }




//
}
