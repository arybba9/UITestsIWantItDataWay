import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.time.Duration;

public class HelloWorldTest {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub


        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();
        driver.get("http://localhost:3000");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.partialLinkText("Hello World")).click();

        String str = driver.findElement(By.xpath("//*[@id='helloWorld']/h2")).getText();
        Assert.assertEquals(str, "Hello World List");
        System.out.println(str);

        driver.findElement(By.linkText("Job Roles")).click();


        Thread.sleep(2000);

        driver.quit();
    }
}
