package stepdefinitions;

import base.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static utils.ReportUtils.flushReport;

public class hooks {

    @After
    public void doSomethingAfter(Scenario scenario){
        JavascriptExecutor js = (JavascriptExecutor) WebDriverManager.getInstance().getDriver();
        js.executeScript("window.scrollBy(0,-250);");
        for (int i = 0; i < 4; i++) {
            byte[] screenShot = ((TakesScreenshot) WebDriverManager.getInstance().getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "Screenshot " + (i + 1));
            js.executeScript("window.scrollBy(0,500);");
        }
        WebDriverManager.quitBrowser();
        flushReport();

    }

}
