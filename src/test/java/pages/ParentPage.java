package test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ParentPage {
        // WebElements
       //logout button
        public static WebElement logout(WebDriver driver) {
            WebElement element = driver.findElement(By.xpath("//*[@id=navbarSupportedContent]/div/a"));
            return element;
        }

      //---------------------------------------------------------------------------//
        //public void clickSubmit(WebDriver driver) {
          //  Submit(driver).click();
        }


