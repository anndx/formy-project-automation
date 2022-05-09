import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ania\\Desktop\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement fullName = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(fullName);
        fullName.sendKeys("Anna Dutka");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("05/08/2022");

        driver.quit();
    }
}
