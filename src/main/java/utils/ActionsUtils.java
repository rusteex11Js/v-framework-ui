package utils;

import org.openqa.selenium.WebElement;

public class ActionsUtils {

    public void click(WebElement element){
        try{
            element.click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void setText(WebElement element,String value){
        try{
            element.sendKeys(value);
        }catch (Exception e){
            e.printStackTrace();
        }
    }





}
