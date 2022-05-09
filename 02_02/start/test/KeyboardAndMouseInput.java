import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ania\\Desktop\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement fullName = driver.findElement(By.id("name"));
        fullName.click();
        fullName.sendKeys("Anna Dutka");

        WebElement button = driver.findElement(By.id("button"));
        button.click();

        driver.quit();
    }
}
