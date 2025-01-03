package utils;


import base.CustomException;
import base.WebDriverManager;
import constant.ElementType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementUtils {
    private WebElement element;
    private List<WebElement> elements;

    public WebElement uiElement(ElementType type, String webElement) {
        try {
            switch (type) {
                case ID:
                    element = WebDriverManager.getInstance().getDriver().findElement(By.id(webElement));
                    break;
                case NAME:
                    element = WebDriverManager.getInstance().getDriver().findElement(By.name(webElement));
                    break;
                case CLASS_NAME:
                    element = WebDriverManager.getInstance().getDriver().findElement(By.className(webElement));
                    break;
                case LINK:
                    element = WebDriverManager.getInstance().getDriver().findElement(By.linkText(webElement));
                    break;
                case PARTIAL_LINK:
                    element = WebDriverManager.getInstance().getDriver().findElement(By.partialLinkText(webElement));
                    break;
                case XPATH:
                    element = WebDriverManager.getInstance().getDriver().findElement(By.xpath(webElement));
                    break;
                case CSS_SELECTOR:
                    element = WebDriverManager.getInstance().getDriver().findElement(By.cssSelector(webElement));
                    break;
                case TAG_NAME:
                    element = WebDriverManager.getInstance().getDriver().findElement(By.tagName(webElement));
                    break;
                default:
                    throw new CustomException("locatorType is not available");
            }
        }catch (CustomException e){
            e.printStackTrace();
        }
        return  element;
    }

    public List<WebElement> uiElements(ElementType type, String webElement) {
        try {
            switch (type) {
                case ID:
                    elements = WebDriverManager.getInstance().getDriver().findElements(By.id(webElement));
                    break;
                case NAME:
                    elements = WebDriverManager.getInstance().getDriver().findElements(By.name(webElement));
                    break;
                case CLASS_NAME:
                    elements = WebDriverManager.getInstance().getDriver().findElements(By.className(webElement));
                    break;
                case LINK:
                    elements = WebDriverManager.getInstance().getDriver().findElements(By.linkText(webElement));
                    break;
                case PARTIAL_LINK:
                    elements = WebDriverManager.getInstance().getDriver().findElements(By.partialLinkText(webElement));
                    break;
                case XPATH:
                    elements = WebDriverManager.getInstance().getDriver().findElements(By.xpath(webElement));
                    break;
                case CSS_SELECTOR:
                    elements = WebDriverManager.getInstance().getDriver().findElements(By.cssSelector(webElement));
                    break;
                case TAG_NAME:
                    elements = WebDriverManager.getInstance().getDriver().findElements(By.tagName(webElement));
                    break;
                default:
                    throw new CustomException("locatorType is not available");
            }
        }catch (CustomException e){
            e.printStackTrace();
        }
        return  elements;
    }

}
