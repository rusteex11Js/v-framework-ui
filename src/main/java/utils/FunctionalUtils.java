package utils;

import base.UtilityBase;
import base.WebDriverManager;
import com.aventstack.extentreports.ExtentReports;
import constant.ElementType;
import constant.WaitType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FunctionalUtils {

    private WebDriver driver = WebDriverManager.getInstance().getDriver();
    private ElementUtils elementUtils = UtilityBase.getUtilsInstance().getElementUtils();
    private WaitUtils waitUtils = UtilityBase.getUtilsInstance().getWaitUtils();
    private ActionsUtils actionsUtils = UtilityBase.getUtilsInstance().getActionsUtils();
    private ExtentReports report = UtilityBase.getUtilsInstance().getReportUtils().getFullReport();

    private static volatile FunctionalUtils funcUtilsInstance;
    private FunctionalUtils() { }
    public static FunctionalUtils getFunctionalUtilsInstance(){
        if(funcUtilsInstance == null){
            synchronized (UtilityBase.class){
                if (funcUtilsInstance == null){
                    funcUtilsInstance = new FunctionalUtils();
                }
            }
        }
        return funcUtilsInstance;
    }

    public void waitAndSetText(ElementType elementType, String webElementValue, String dataValue,WaitType type,int seconds){
        WebElement element = elementUtils.uiElement(elementType,webElementValue);
        waitUtils.waitUntilElement(element,type,seconds,driver);
        actionsUtils.click(element);
        actionsUtils.setText(element,dataValue);
    }



}
