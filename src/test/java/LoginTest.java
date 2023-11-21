package test.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.java.pages.HomePage;
import test.java.pages.LoginPage;

import java.time.Duration;


public class LoginTest {
    @Test
    public void loginCorrectly() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:3000");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        LoginPage login = new LoginPage();

        login.clickOnLogInButton(driver);

        login.enterCredentialsAndClickSubmit(driver, "anna@kainos.com","Test15!!" );
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        HomePage home = new HomePage();
        home.assertionHelloWorld(driver);

        driver.quit();

    }
@Test
    public void validEmailInvalidPassword() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:3000");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //click on Hello World
        driver.findElement(By.xpath("//a[@class='btn btn-outline-secondary me-2']")).click();

        LoginPage login = new LoginPage();

        login.clickOnLogInButton(driver);

        login.enterCredentialsAndClickSubmit(driver, "anna@kainos.com","Test15!" );

        login.assertAlertCredentialCouldNotBeAuthenticated(driver,"The provided credentials could not be authenticated");

        driver.quit();
    }
    @Test
    public void invalidEmailValidPassword() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        //go to localhost
        driver.get("http://localhost:3000");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //click on Hello World
        driver.findElement(By.xpath("//a[@class='btn btn-outline-secondary me-2']")).click();

        LoginPage login = new LoginPage();
        //enter email address
        login.enterCredentialsAndClickSubmit(driver, "anna.kainos.com","Test15!!" );

        login.assertAlertCredentialCouldNotBeAuthenticated(driver,"The provided credentials could not be authenticated");

        driver.quit();
    }

}








