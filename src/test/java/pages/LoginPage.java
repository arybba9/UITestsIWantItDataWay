package test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){
        super(driver);
    }
    private WebElement logInButton(){
        return this.driver.findElement(By.xpath("//a[@class='btn btn-outline-secondary me-2']"));
    }
    private WebElement loginTitle() {
        return this.driver.findElement(By.xpath("//*[@id='register']/h2"));
    }
    private  WebElement emailField() {
        return this.driver.findElement(By.id("email"));
    }
    private  WebElement passwordField() {
        return this.driver.findElement(By.id("password"));
    }
    private WebElement submit() {
        return this.driver.findElement(By.xpath("//*[@id='register']/div/form/button"));
    }
    private WebElement alertCredentialCouldNotBeAuthenticated() {
        return this.driver.findElement(By.xpath("/html/body/main/section/div/div"));
    }
    //-----------------------------------------------------------------------------//

   public void clickOnLogInButton(){
        logInButton().click();
   }
   public String getLoginTitle() {
        return loginTitle().getText();
   }
    public void enterCredentialsAndClickSubmit(String email, String password) {
        emailField().sendKeys(email);
        passwordField().sendKeys(password);
        submit().click();

    }
    public String getTextAlert() {
        return alertCredentialCouldNotBeAuthenticated().getText();

    }
}



