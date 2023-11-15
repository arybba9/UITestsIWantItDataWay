import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    // WebElements --------------------------------------------------------------------------
    public static WebElement JobRoles(WebDriver driver) {

        WebElement element = driver.findElement(By.linkText("Job Roles"));

        return element;
    }

//--------------------------------------------------------------------------------------------

    // Click on these WebElements ---------------------------------------
    public void clickLightning_Deals(WebDriver driver) {
        JobRoles(driver).click();
    }





}

