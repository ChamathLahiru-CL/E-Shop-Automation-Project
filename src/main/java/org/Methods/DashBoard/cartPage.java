package org.Methods.DashBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class cartPage {

    WebDriver driver;
    WebDriverWait wait;

    public cartPage(WebDriver driver){
        this.driver = driver;
    }

    public void checkout(){
        driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']")).click();
    }

    public void delete(){
        driver.findElement(By.cssSelector("a.cart_quantity_delete")).click();
    }

    public void placeOrder(String message){
        driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys(message);
        driver.findElement(By.cssSelector("a[href='/payment']")).click();
    }

    public void payOrder(String nameOnCard, String card, String cvc, String month, String year){
        driver.findElement(By.cssSelector("input[data-qa='name-on-card']")).sendKeys(nameOnCard);
        driver.findElement(By.cssSelector("input[data-qa='card-number']")).sendKeys(card);
        driver.findElement(By.cssSelector("input[data-qa='cvc']")).sendKeys(cvc);
        driver.findElement(By.cssSelector("input[data-qa='expiry-month']")).sendKeys(month);
        driver.findElement(By.cssSelector("input[data-qa='expiry-year']")).sendKeys(year);
        driver.findElement(By.cssSelector("button[data-qa='pay-button']")).click();
    }

    public void downloadInvoice(){
        driver.findElement(By.xpath("//a[contains(@href,'/download_invoice')]")).click();
    }

    public void afterPlacedContinue(){
        driver.findElement(By.cssSelector("a[data-qa='continue-button']")).click();
    }

}
