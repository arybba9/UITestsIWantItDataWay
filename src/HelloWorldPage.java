import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelloWorldPage {

    public static WebElement JobRoles(WebDriver driver) {
        WebElement element = driver.findElement(By.linkText("Job Roles"));

        return element;

    }

    public static WebElement HelloWorld(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//*[@id='helloWorld']/h2"));

        return element;
    }

    public static WebElement Table(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//*[@id='helloWorld']/table"));

        return element;
    }


//--------------------------------------------------------------------------------------------

    // Click on these WebElements ---------------------------------------





}

