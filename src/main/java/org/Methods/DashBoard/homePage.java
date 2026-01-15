package org.Methods.DashBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class homePage {
    WebDriver driver;
    WebDriverWait wait;

    public homePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    }

//    Element Locators


//    ----- Actions --------

//  <01> Navigation bar
    public void openProductPage(){
        driver.findElement(By.cssSelector("a[href='/products']")).click();
    }

    public void logout(){
        driver.findElement(By.cssSelector("a[href='/logout']")).click();
    }

    public void openCartPage(){
        driver.findElement(By.cssSelector("a[href='logout']")).click();
    }

    public void deleteAccount(){
        driver.findElement(By.cssSelector("a[href='delete_account']")).click();
    }

    public void cart(){
        driver.findElement(By.cssSelector("a[href='/view_cart']")).click();
    }

//  <02> Category
    public void womenCT(){
        driver.findElement(By.cssSelector("a[href='#Women']")).click();
    }
    public void womenCTDress(){
        driver.findElement(By.cssSelector("a[href='/category_products/1']")).click();
    }
    public void womenCtTops(){
        driver.findElement(By.cssSelector("a[href='/category_products/2']")).click();
    }
    public void womenCTSaree(){
        driver.findElement(By.cssSelector("a[href='/category_products/7']")).click();
    }

    public void menCT(){
        driver.findElement(By.cssSelector("a[href='#Men']")).click();
    }
    public void menCtTshirs(){
        driver.findElement(By.cssSelector("a[href='/category_products/3']")).click();
    }
    public void menCtjeans(){
        driver.findElement(By.cssSelector("a[href='/category_products/6']")).click();
    }

    public void kidsCT(){
        driver.findElement(By.cssSelector("a[href='#Kids']")).click();
    }
    public void kidsCtDress(){
        driver.findElement(By.cssSelector("a[href='/category_products/4']")).click();
    }
    public void kidsCtTops(){
        driver.findElement(By.cssSelector("a[href='/category_products/5']")).click();
    }

//    Brands
    public void poloBrands(){
        driver.findElement(By.cssSelector("a[href='/brand_products/Polo']")).click();
    }
    public void bibaBrands(){
        driver.findElement(By.cssSelector("a[href='/brand_products/Biba']")).click();
    }
    public void babyhugBrands(){
        driver.findElement(By.cssSelector("a[href='/brand_products/Babyhug']")).click();
    }
    public void madameBrands(){
        driver.findElement(By.cssSelector("a[href='/brand_products/Madame']")).click();
    }

//    Select Products
    public void addToCart(){
        driver.findElement(By.cssSelector("a[data-product-id='1']")).click();
        driver.findElement(By.cssSelector("a[data-product-id='2']")).click();
        driver.findElement(By.cssSelector("a[data-product-id='13']")).click();
    }

    public void poloBrandSelect(){
        driver.findElement(By.cssSelector("a[data-product-id='1']")).click();
        driver.findElement(By.cssSelector("a[data-product-id='29']")).click();
    }

    public void continueAfterAddCart(){
        driver.findElement(By.cssSelector("button[data-dismiss='modal']")).click();
    }

    public void viewCartAfterAddCart(){
        driver.findElement(By.cssSelector("a[href='/view_cart']")).click();
    }

    public void viewProduct(){
        driver.findElement(By.cssSelector("a[href='/product_details/1']")).click();
    }

    public void ProductPageaddToCart(){
        driver.findElement(By.cssSelector("a[data-product-id='1']")).click();
        driver.findElement(By.cssSelector("a[data-product-id='3']")).click();
        driver.findElement(By.cssSelector("a[data-product-id='12']")).click();
    }



}
