package stepdefinitions;

import base.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class hooks {

    @AfterStep
    public void doSomethingAfter(Scenario scenario){
//        JavascriptExecutor js = (JavascriptExecutor) WebDriverManager.getInstance().getDriver();
//        js.executeScript("window.scrollBy(0,-250);");
//        for (int i = 0; i < 4; i++) {
        if(scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot) WebDriverManager.getInstance().getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "Screenshot");

        }
//            scenario.attach(screenShot, "image/png", "Screenshot " + (i + 1));
//            scenario.attach(screenShot, "image/png", "Screenshot");
//            js.executeScript("window.scrollBy(0,500);");
//        }
    }

    @After
    public void tearDown(Scenario scenario){
        byte[] screenShot = ((TakesScreenshot) WebDriverManager.getInstance().getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenShot, "image/png", "Screenshot");
        WebDriverManager.quitBrowser();
    }

}
