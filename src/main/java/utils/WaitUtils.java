package utils;

import constant.WaitType;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    private  Wait<WebDriver> wait;
    public void waitUntilElement(WebElement element, WaitType type, int seconds, WebDriver driver){
        try {
            wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));

            switch (type) {
                case CLICKABLE:
                wait.until(ExpectedConditions.elementToBeClickable(element));
                break;

                case SELECTABLE:
                wait.until(ExpectedConditions.elementToBeSelected(element));
                break;

                case VISIBLE:
                wait.until(ExpectedConditions.visibilityOf(element));
                break;

                case INVISIBLE:
                wait.until(ExpectedConditions.invisibilityOf(element));
                break;

                case DOM_STABLE:
                    wait.until(webDriver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equalsIgnoreCase("complete"));
                break;
            }

        }catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }

    public void waitToDomLoad(int seconds,WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0;i < seconds;i++){
            if(js.executeScript("return document.readyState").toString().equalsIgnoreCase("complete")){
                break;
            }
            shortWait(seconds);
        }
    }

    public void shortWait(int seconds){
        try{
        Thread.sleep(1000L * seconds);
    }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
