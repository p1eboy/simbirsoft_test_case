import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class invalidLogin {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("test");
        driver.findElement(By.cssSelector("#login-button")).click();
    }
}
