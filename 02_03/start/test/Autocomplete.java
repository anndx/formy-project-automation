import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ania\\Desktop\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement address = driver.findElement(By.id("autocomplete"));
        //address.click();
        address.sendKeys("1555 Park Blvd, Palo Alto, CA");
        Thread.sleep(1000);

        WebElement autocompleteResult = driver.findElement(By.className("dismissButton"));
        autocompleteResult.click();
        driver.quit();
    }
}
