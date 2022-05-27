package Theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DOM_Change {
    private WebDriver driver;
    private By Link_Text=By.linkText("Challenging DOM");
    private By Blue_Button=By.cssSelector(".button");
    private By Canvas=By.id("canvas");
    public DOM_Change(WebDriver driver){this.driver=driver;}
    public void Click_to_Dom(){
        driver.findElement(Link_Text).click();
    }
    public String Get_Canvas(){
        return driver.findElement(Canvas).getText();
    }
    public void Click_blue(){
        driver.findElements(Blue_Button).get(0).click();
    }
    public void Click_Green(){
        driver.findElements(Blue_Button).get(1).click();
    }
    public void Click_Red(){
        driver.findElements(Blue_Button).get(2).click();
    }

}
