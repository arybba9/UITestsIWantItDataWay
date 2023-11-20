package test.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.java.pages.LoginPage;

import java.time.Duration;

public class LoginTest {
    @Test
    public void loginCorrectly() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        //go to localhost
        driver.get("http://localhost:3000");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //click on Login button
        driver.findElement(By.xpath("//a[@class='btn btn-outline-secondary me-2']")).click();

        LoginPage login = new LoginPage();
        //enter email address
        LoginPage.email(driver).sendKeys("anna@kainos.com");
        //enter password
        LoginPage.password(driver).sendKeys("Test15!!");
        //click Submit
        driver.findElement(By.xpath("//*[@id='register']/div/form/button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //click on Hello World
        driver.findElement(By.partialLinkText("Hello World")).click();
        //verify Hello World List
        String str = driver.findElement(By.xpath("//*[@id='helloWorld']/h2")).getText();
        Assert.assertEquals(str, "Hello World List");
        //click on log out
        driver.findElement(By.xpath("//a[@class='btn btn-outline-success me-2']")).click();
        //click on Hello World
        driver.findElement(By.partialLinkText("Hello World")).click();
        // Verify if 'Login' is there
        String log = driver.findElement(By.xpath("//h2[text()='Login']")).getText();
        Assert.assertEquals(log, "Login");
        driver.quit();

    }
@Test
    public void validEmailInvalidPassword() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        //go to localhost
        driver.get("http://localhost:3000");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //click on Hello World
        driver.findElement(By.partialLinkText("Hello World")).click();

        LoginPage login = new LoginPage();
        //enter email address
        LoginPage.email(driver).sendKeys("anna@kainos.com");
        //enter password
        LoginPage.password(driver).sendKeys("Test15!");
        //click on Submit
        driver.findElement(By.xpath("//*[@id='register']/div/form/button")).click();

        //assert the alert shows up
        String str = driver.findElement(By.xpath("/html/body/main/section/div/div")).getText();
        Assert.assertEquals(str, "The provided credentials could not be authenticated");

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
        driver.findElement(By.partialLinkText("Hello World")).click();

        LoginPage login = new LoginPage();
        //enter email address
        LoginPage.email(driver).sendKeys("anna.kainos.com");
        //enter password
        LoginPage.password(driver).sendKeys("Test15!!");
        //click on submit
        driver.findElement(By.xpath("//*[@id='register']/div/form/button")).click();

        //assert the alert shows up
        String str = driver.findElement(By.xpath("/html/body/main/section/div/div")).getText();
        Assert.assertEquals(str, "The provided credentials could not be authenticated");

        driver.quit();
    }


}








