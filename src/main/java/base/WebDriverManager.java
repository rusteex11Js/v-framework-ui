package base;

import constant.Properties;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class WebDriverManager {
    private static volatile WebDriverManager instance;
    private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
    private WebDriverManager(){ }


    private void initDriver(){
        switch (Properties.getBrowserType().toLowerCase()){
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
//              String name = chromeOptions.getBrowserName();
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
                chromeOptions.setAcceptInsecureCerts(true);
                chromeOptions.setPageLoadTimeout(Duration.of(5, ChronoUnit.SECONDS));
                chromeOptions.addArguments("--start-maximized");
                tlDriver.set(new ChromeDriver(chromeOptions));
                break;
            case "firefox":
                FirefoxOptions options = new FirefoxOptions();
                tlDriver.set(new FirefoxDriver(options));
                break;
            default:
                throw new IllegalArgumentException("unsupported browser : "+Properties.getBrowserType());
        }
    }

    public static WebDriverManager getInstance(){
        if(instance == null) {
            synchronized (WebDriverManager.class){
                if(instance == null){
                    instance = new WebDriverManager();
                }
            }
        }
        if(tlDriver.get() == null){
            instance.initDriver();
        }
        return instance;
    }

    public WebDriver getDriver(){
        return tlDriver.get();
    }

    public static void quitBrowser(){
        if(tlDriver.get() != null){
            tlDriver.get().quit();
            tlDriver.remove();
        }
    }
}