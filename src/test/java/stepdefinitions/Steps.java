package stepdefinitions;

import base.WebDriverManager;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import constant.Properties;
import dto.BaseDTO;
import dto.Register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.HomePage;

import static utils.ReportUtils.getFullReport;

public class Steps {
    @Given("launch browser")
    public void launchBrowser() {
        WebDriverManager.getInstance().getDriver().get(Properties.getUrl());

        ExtentTest test = getFullReport().createTest("first launch").assignAuthor("Vinoth").assignCategory("sample");
        test.pass("PASSED");
        test.info("nothing");
        String xmlCode = "<book>\n" +
                "\n" +
                "<title> Learning Amazon Web Services </title>\n" +
                "\n" +
                "<author> Mark Wilkins </author>\n" +
                "\n" +
                "</book>";
        String jsonCode = "{\"result\":true, \"count\":42}";
        test.info(MarkupHelper.createCodeBlock(xmlCode,CodeLanguage.XML));
        test.info(MarkupHelper.createCodeBlock(jsonCode,CodeLanguage.JSON));
        test.pass(MarkupHelper.createLabel("Logged in successfully", ExtentColor.GREEN));
        test.log(Status.PASS,"passed log");
    }

    @And("set firstname {string}")
    public void setFirst(String name) throws InterruptedException {
        Register register = new Register.RegisterBuilder()
                .setFirstName(name).build();
        BaseDTO base = new BaseDTO.BaseDTOBuilder().setRegister(register).build();
        HomePage hp = new HomePage();
        hp.setFirstName(base);
    }

}
