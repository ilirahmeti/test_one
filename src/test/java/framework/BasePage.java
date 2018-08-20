package framework;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import stepdefinition.SharedSD;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class BasePage extends SharedSD {

    public void clickOn(By locator){
        try {
            browser(locator).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getText(By locator){
      String text = null;
        try {
          text = browser(locator).getText();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return text;
    }

    public void sendValue(By locator, String text){
        try {
            browser(locator).sendKeys(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


   public static WebElement browser(final By locator){
        Wait<WebDriver> wait = new FluentWait<>(getDriver())
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(200, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementNotFoundException.class)
                .withMessage("Webdriver waited for 30 seconds but still could not find the element" +
                              "therefore Timeout Exception has been thrown");

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
        return element;
   }

}
