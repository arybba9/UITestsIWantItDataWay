import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class HomePageTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();
        driver.get("http://localhost:3000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.partialLinkText("Hello World")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        driver.quit();

    }

}

