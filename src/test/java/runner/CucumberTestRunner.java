package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(tags = "",
features = {"src/test/resources/featureFiles"},
glue = {"stepdefinitions","hooks"},
        monochrome = true,
plugin={"pretty","html:target/htmlreport.html"})
public class CucumberTestRunner  extends AbstractTestNGCucumberTests {
    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }

}

