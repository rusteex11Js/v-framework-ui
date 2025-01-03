package stepdefinitions;

import base.WebDriverManager;
import constant.Properties;
import io.cucumber.java.en.Given;

public class Steps {

    @Given("launch browser")
    public void launchBrowser(){
        WebDriverManager.getInstance().getDriver().get(Properties.getUrl());
    }

}
