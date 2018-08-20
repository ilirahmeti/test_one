import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollPage {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/scroll");


        WebElement element = driver.findElement(By.id("name"));
        WebElement element2 = driver.findElement(By.id("date"));


        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        element.sendKeys("ilir ahmeti");
        Thread.sleep(3000);
        actions.moveToElement(element2);
        element2.sendKeys("06/22/2018");
        Thread.sleep(3000);


//        JavascriptExecutor js = (JavascriptExecutor)driver;
//
//        WebElement element = driver.findElement(By.id("name"));
//
//        Thread.sleep(3000);
//
//        js.executeScript("arguments[0].scrollIntoView(true);",element);
//
//        element.sendKeys("good job");
//
//
//        Thread.sleep(3000);

        driver.quit();

    }



}

