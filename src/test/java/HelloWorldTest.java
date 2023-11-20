package test.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.time.Duration;

public class HelloWorldTest {
    public void HelloWorld() {
        // TODO Auto-generated method stub


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:3000");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.partialLinkText("Hello World")).click();

        String str = driver.findElement(By.xpath("//*[@id='helloWorld']/h2")).getText();
        Assert.assertEquals(str, "Hello World List");

        //driver.findElement(By.linkText("Job Roles")).click();


        driver.quit();
    }
}
