package main.base;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DriverBase {
    private static WebDriver driver;
    public static WebDriver getDriver(){
        if(driver == null) {
            driver = makeDriver();
        }
         return driver;
    }

    private static WebDriver makeDriver(){
        ChromeOptions chromeOptions = new ChromeOptions();
//        String name = chromeOptions.getBrowserName();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.setPageLoadTimeout(Duration.of(5, ChronoUnit.SECONDS));
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
        return driver;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}