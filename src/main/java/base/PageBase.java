package base;

import org.openqa.selenium.support.PageFactory;

public class PageBase {
    public PageBase(){
        PageFactory.initElements(WebDriverManager.getInstance().getDriver(),this);
    }

}
