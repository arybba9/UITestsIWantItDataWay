package test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage extends BasePage {
    // WebElements --------------------------------------------------------------------------
    public HomePage(WebDriver driver) {
        super(driver);
    }
    private WebElement homePage() {
        return this.driver.findElement(By.xpath("/html/body/main/div"));
    }
    private WebElement helloWorld() {
        return this.driver.findElement(By.partialLinkText("Hello World"));
    }
//......................................................................................//
     public String getHomePageTitle() {
        return homePage().getText(); }

    public String getHelloWorldLink() {
        return helloWorld().getText();
    }
    public void clickHelloWorld() {
        helloWorld().click();
    }

}

