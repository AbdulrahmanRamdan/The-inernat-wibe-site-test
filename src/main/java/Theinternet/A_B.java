package Theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A_B {
    private WebDriver driver;
    private By A_Blink=By.linkText("A/B Testing");
    public A_B(WebDriver webDriver){
        this.driver=webDriver;
    }
    public void clickthelink(){
        WebElement element=driver.findElement(A_Blink);
        element.click();
    }

    public String get_text(){
        return driver.findElement(By.cssSelector("#content > div > h3")).getText();
    }

}
