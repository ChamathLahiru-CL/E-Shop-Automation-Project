package org.Methods.DashBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addAccountDelete {

    WebDriver driver;
    WebDriverWait wait;

    public addAccountDelete(WebDriver driver) {
        this.driver = driver;
    }

    public void deleteAccount(){
        driver.findElement(By.cssSelector("a[href='delete_account']")).click();
        driver.findElement(By.cssSelector("a[data_qa='continue-button']")).click();
    }
}
