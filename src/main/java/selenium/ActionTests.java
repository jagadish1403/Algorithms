package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionTests {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup(); // Automatically sets up the correct ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationteststore.com/");
        driver.manage().window().maximize();
        WebElement text = driver.findElement(By.id("filter_keyword"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15L));
        wait.until(ExpectedConditions.visibilityOf(text));
        text.sendKeys("Hello");

        Actions action = new Actions(driver);
        Thread.sleep(5000);
        action.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).perform();
        Thread.sleep(5000);
        action.keyDown(Keys.COMMAND).sendKeys("x").keyUp(Keys.COMMAND).perform();
        driver.close();


    }
}
