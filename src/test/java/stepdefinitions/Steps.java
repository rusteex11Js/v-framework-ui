package stepdefinitions;

import base.WebDriverManager;
import constant.Properties;
import dto.BaseDTO;
import dto.Register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;
import pages.HomePage;

public class Steps {

    @Given("launch browser")
    public void launchBrowser() {
        WebDriverManager.getInstance().getDriver().get(Properties.getUrl());
    }

    @And("set firstname {string}")
    public void setFirst(String name) throws InterruptedException {
        Register register = new Register.RegisterBuilder()
                .setFirstName(name).build();
        BaseDTO base = new BaseDTO.BaseDTOBuilder().setRegister(register).build();
        HomePage hp = new HomePage();
        hp.setFirstName(base);
        if (name.equalsIgnoreCase("Vinoth")){
            Assert.fail();
        }
    }

}
