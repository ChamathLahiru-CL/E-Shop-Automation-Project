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
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

//    Element Locators
    private By signLogin = By.cssSelector("li a[href='/login']");
    private By userName = By.cssSelector("input[data-qa='signup-name']");
    private By userEmail = By.cssSelector("input[data-qa='signup-email']");
    private By signUpBt = By.cssSelector("button[data-qa='signup-button']");
    private By pw = By.id("password");
    private By days =  By.id("days");
    private By months = By.id("months");
    private By years = By.id("years");
    private By news = By.id("newsletter");
    private By optionCK = By.id("optin");
    private By fname = By.id("first_name");
    private By lname = By.id("last_name");
    private By companyName = By.id("company");
    private By add1 = By.id("address1");
    private By add2 = By.id("address2");
    private By countryName = By.id("country");
    private By state = By.id("state");
    private By city = By.id("city");
    private By zipcode = By.id("zipcode");
    private By mNumber = By.id("mobile_number");
    private By contunieBT = By.cssSelector("a[data-qa='continue-button']");



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
        new Select(driver.findElement(days)).selectByVisibleText(day);
        new Select(driver.findElement(months)).selectByVisibleText(month);
        new Select(driver.findElement(years)).selectByVisibleText(year);
        driver.findElement(news).click();
        driver.findElement(optionCK).click();
        driver.findElement(fname).sendKeys(fName);
        driver.findElement(lname).sendKeys(lName);
        driver.findElement(companyName).sendKeys(cmp);
        driver.findElement(add1).sendKeys(address01);
        driver.findElement(add2).sendKeys(address02);
        Select select = new Select(driver.findElement(countryName));
        select.selectByValue(userCountry);
        driver.findElement(state).sendKeys(userState);
        driver.findElement(city).sendKeys(userCity);
        driver.findElement(zipcode).sendKeys(userZipcode);
        driver.findElement(mNumber).sendKeys(userMobile_number);
    }

    public void clickCreateAccount(){
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    public void afterCreatedContinueBT(){
        driver.findElement(contunieBT).click();
    }




//
}
