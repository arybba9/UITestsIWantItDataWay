package test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage {

    private static WebElement logInButton(WebDriver driver){
        return driver.findElement(By.xpath("//a[@class='btn btn-outline-secondary me-2']"));
    }
    private static WebElement emailField(WebDriver driver) {
        return driver.findElement(By.id("email"));
    }
    private static WebElement passwordField(WebDriver driver) {
        return driver.findElement(By.id("password"));
    }
    private static WebElement submit(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id='register']/div/form/button"));
    }
    private static WebElement alertCredentialCouldNotBeAuthenticated(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/main/section/div/div"));
    }
    //-----------------------------------------------------------------------------//

   public void clickOnLogInButton(WebDriver driver){
        logInButton(driver).click();
   }
    public void enterCredentialsAndClickSubmit(WebDriver driver, String email, String password) {
        emailField(driver).sendKeys(email);
        passwordField(driver).sendKeys(password);
        submit(driver).click();

    }
    public void assertAlertCredentialCouldNotBeAuthenticated(WebDriver driver, String authenticationAlert) {
        alertCredentialCouldNotBeAuthenticated(driver).getText();
        Assert.assertEquals(authenticationAlert, "The provided credentials could not be authenticated");


    }
}



