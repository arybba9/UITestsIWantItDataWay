package test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    // WebElements
    public static WebElement email(WebDriver driver) {
        return driver.findElement(By.id("email"));
    }
    public static WebElement password(WebDriver driver) {
        return driver.findElement(By.id("password"));
    }
    public static WebElement submit(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id='register']/div/form/button"));
    }
    //-----------------------------------------------------------------------------//
    public void clickSubmit(WebDriver driver) {
        submit(driver).click();
    }
}

