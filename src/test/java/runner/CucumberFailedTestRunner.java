package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = "@target/rerun.txt",
        glue = {"stepdefinitions","hooks"},
        monochrome = true,
        plugin =  {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class CucumberFailedTestRunner extends AbstractTestNGCucumberTests {
}
