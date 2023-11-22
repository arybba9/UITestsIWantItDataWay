package test.java;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.pages.BasePage;
import test.java.pages.HomePage;
import test.java.pages.JobRolesPage;
import test.java.pages.LoginPage;

import java.time.Duration;

public class BasePageTest {
    protected WebDriver driver;
    @BeforeMethod
    public void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://nphvsx5xpq.eu-west-1.awsapprunner.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
        public void cleanUpTest() {
            driver.quit();
        }
        @Test
        public void loggingOut () {

        LoginPage login = new LoginPage(driver);

            login.clickOnLogInButton();

            login.enterCredentialsAndClickSubmit("anna@kainos.com","Test15!!" );
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            BasePage basePage = new BasePage(driver);
            basePage.clickLogOutButton();

        }

    @Test
        public void homeLink() {
        LoginPage login = new LoginPage(driver);

        login.clickOnLogInButton();

        login.enterCredentialsAndClickSubmit("anna@kainos.com","Test15!!" );
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        BasePage basePage = new BasePage(driver);
        basePage.clickOnHomeLink();
        HomePage homePage = new HomePage(driver);
        homePage.getHomePageTitle();
        basePage.clickLogOutButton();
        homePage.clickHelloWorld();
        login.getLoginTitle();

    }
@Test
    public void jobRolesLink() {
    LoginPage login = new LoginPage(driver);

    login.clickOnLogInButton();

    login.enterCredentialsAndClickSubmit("anna@kainos.com","Test15!!" );
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    BasePage basePage = new BasePage(driver);
    basePage.clickOnJobRolesLink();

    JobRolesPage jobRolesPage = new JobRolesPage(driver);
    jobRolesPage.getJobRolesTitle();
    basePage.clickLogOutButton();
    basePage.clickOnJobRolesLink();
    login.getLoginTitle();

}
}
