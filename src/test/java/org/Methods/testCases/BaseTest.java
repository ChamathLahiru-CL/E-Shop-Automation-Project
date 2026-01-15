package org.Methods.testCases;

import org.Methods.DashBoard.cartPage;
import org.Methods.DashBoard.homePage;
import org.Methods.Login.directLoginPage;
import org.Methods.Login.signUpPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;
    signUpPage signUpPage;
    directLoginPage directLoginPage;
    homePage homePage;
    cartPage cartPage;

    @BeforeTest
    public void beforeTest(){

        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/OneDrive - std.uwu.ac.lk/Documents/.Web Drivers/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com");

        signUpPage = new signUpPage(driver);
        directLoginPage = new directLoginPage(driver);
        homePage = new homePage(driver);
        cartPage = new cartPage(driver);
    }


}
