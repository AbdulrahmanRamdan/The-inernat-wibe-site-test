package Theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamic_Controll {
    private WebDriver driver;
    private By Link=By.linkText("Dynamic Controls");
    private By Check_box=By.id("checkbox");
    private By Add_Remove= By.ByCssSelector.cssSelector("#checkbox-example > button");
    private By mass=By.id("message");
    public Dynamic_Controll(WebDriver webDriver){this.driver=webDriver;}
    public String Click_Link(){
        driver.findElement(Link).click();
        return driver.findElement(By.tagName("h4")).getText();
    }
    public void CheckBox(){
        driver.findElement(Check_box).click();
    }
    public String Get_Add_Remove_txt(){
        return driver.findElement(Add_Remove).getText();
    }
    public void Add_Remove_Click(){
         driver.findElement(Add_Remove).click();
    }
    public String Get_Message_Txt(){
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(mass));
        return driver.findElement(mass).getText();
    }
    public String Get_Change_Txt(){
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(mass));
        return driver.findElement(Add_Remove).getText();
    }

}
