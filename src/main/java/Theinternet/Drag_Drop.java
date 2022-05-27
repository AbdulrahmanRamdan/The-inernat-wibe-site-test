package Theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
    private WebDriver driver;
    private By Aa=By.id("column-a");
    private By Bb=By.id("column-b");
    public Drag_Drop(WebDriver driver){this.driver=driver;}
    public String Get_Text_A(){
        return driver.findElement(Aa).getText();
    }
    public String Get_Text_B(){
        return driver.findElement(Bb).getText();
    }
    public void Click(){
        driver.findElement(By.linkText("Drag and Drop")).click();
    }
    public void DRAG_DROP(){
        Actions actions=new Actions(driver);
        actions.dragAndDrop( driver.findElement(Aa), driver.findElement(Bb));
    }

}
