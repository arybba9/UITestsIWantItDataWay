package test.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.pages.BasePage;
import test.java.pages.HomePage;
import test.java.pages.LoginPage;

import java.time.Duration;

public class HomePageTest {
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
        public void homePageTitle() {
            LoginPage login = new LoginPage(driver);

            login.clickOnLogInButton();

            login.enterCredentialsAndClickSubmit("anna@kainos.com", "Test15!!");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            BasePage basePage = new BasePage(driver);
            basePage.clickOnHomeLink();
            HomePage homePage = new HomePage(driver);
            homePage.getHomePageTitle();



        }

    }

