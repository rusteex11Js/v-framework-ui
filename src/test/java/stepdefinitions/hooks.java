package stepdefinitions;

import base.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class hooks {


//   @BeforeMethod
//    public void beforeMethod(ITestContext context){
//        System.out.println("Before class");
//        System.out.println("thread count : "+context.getCurrentXmlTest().getSuite().getDataProviderThreadCount());
//        context.getCurrentXmlTest().getSuite().setDataProviderThreadCount(3);
//        System.out.println("thread count : "+context.getCurrentXmlTest().getSuite().getDataProviderThreadCount());
//        WebDriverManager.getInstance().getDriver().get(Properties.getUrl());
//    }
//
//    @AfterMethod
//    public void afterMethod(Scenario scenario){
//
//    }

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
    }

}
