package test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
    }

    private WebElement homeLink() {
        return this.driver.findElement(By.partialLinkText("Home"));
    }
    private WebElement jobRolesLink() {
        return this.driver.findElement(By.linkText("Job Roles"));
    }
    private  WebElement logOutButton(){
        return this.driver.findElement(By.xpath("//a[@class='btn btn-outline-success me-2']"));
    }
    //---------------------------------------------------------------------------//
    public void clickOnHomeLink() {
        homeLink().click();
    }
    public void clickOnJobRolesLink(){
        jobRolesLink().click();
    }
    public void clickLogOutButton() {
        logOutButton().click();
    }
}


