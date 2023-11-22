package test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class JobRolesPage extends BasePage {
    public JobRolesPage(WebDriver driver) {
        super(driver);
    }

    private WebElement jobRolesTitle() {
        return this.driver.findElement(By.xpath("//h2[text()='Job Roles']"));
    }

    private WebElement jobRolesTable() {
        return this.driver.findElement(By.xpath("//*[@id=orders]/table"));
    }

    //------------------------------------------------------//
    public String getJobRolesTitle() {
        return jobRolesTitle().getText();
    }
}


