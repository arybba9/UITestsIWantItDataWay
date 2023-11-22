package test.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import test.java.pages.BasePage;
import test.java.pages.HomePage;
import test.java.pages.JobRolesPage;
import test.java.pages.LoginPage;

import java.time.Duration;


public class LoginTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://localhost:3000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void cleanUpTest() {
        driver.quit();
    }
    @Test
    public void loginCorrectly() {

        LoginPage login = new LoginPage(driver);

        login.clickOnLogInButton();

        login.enterCredentialsAndClickSubmit("anna@kainos.com", System.getenv("TEST_VALID_PASSWORD_API"));


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        HomePage homePage = new HomePage(driver);
        homePage.getHomePageTitle();

    }
@Test
    public void validEmailInvalidPassword() {

        LoginPage login = new LoginPage(driver);

        login.clickOnLogInButton();

        login.enterCredentialsAndClickSubmit("anna@kainos.com","xxx" );

        Assert.assertEquals( "The provided credentials could not be authenticated",login.getTextAlert());
    }
    @Test
    public void invalidEmailValidPassword() {

        LoginPage login = new LoginPage(driver);

        login.clickOnLogInButton();

        login.enterCredentialsAndClickSubmit( "anna.kainos.com",System.getenv("TEST_VALID_PASSWORD_API") );

        Assert.assertEquals( "The provided credentials could not be authenticated",login.getTextAlert());

    }
}








