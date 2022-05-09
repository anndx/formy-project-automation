import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ania\\Desktop\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        submitForm(driver);

        waitForAlertBanner(driver);

        //assertEquals("The form was successfully submitted!", getAlertBannerText(driver));

        driver.quit();
    }

    public static void submitForm(WebDriver driver) {
        driver.findElement(By.id("first-name")).sendKeys("Anna");

        driver.findElement(By.id("last-name")).sendKeys("Dutka");

        driver.findElement(By.id("job-title")).sendKeys("Quality Engineer");

        driver.findElement(By.cssSelector("input[value='radio-button-2']")).click();

        driver.findElement(By.cssSelector("input[value='checkbox-2']")).click();

        driver.findElement(By.id("select-menu")).click();

        driver.findElement(By.cssSelector("option[value='1']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("05/09/2022");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector("a.btn.btn-lg.btn-primary")).click();
    }

    public static void waitForAlertBanner (WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert.alert-success")));
    }

    public static String getAlertBannerText (WebDriver driver) {
        return driver.findElement(By.cssSelector(".alert.alert-success")).getText();
    }
}
