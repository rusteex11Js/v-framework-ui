package main.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static main.base.DriverBase.getDriver;

public class Test {
    public static void main(String[] args) {



        getDriver().get("https://www.selenium.dev/selenium/web/web-form.html");

        String str =  getDriver().getTitle();
        System.out.println(str);

        getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = getDriver().findElement(By.name("my-text"));
        WebElement submitButton = getDriver().findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        submitButton.click();

        WebElement message = getDriver().findElement(By.id("message"));
        String str1 = message.getText();

        System.out.println(str1);
        getDriver().quit();
    }
}
