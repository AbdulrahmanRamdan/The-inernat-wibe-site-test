package Theinternet;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class ContextMenu {
    private WebDriver driver;
    private By link=By.linkText("Context Menu");
    private By Menu=By.id("hot-spot");
    public ContextMenu(WebDriver webDriver){this.driver=webDriver;}
    public void Click_To_link(){driver.findElement(link).click();}
    public void Context_Click(){
        Actions actions=new Actions(driver);
        actions.contextClick(driver.findElement(Menu)).perform();
    }
    public String Get_Alert_text(){
        Alert alert=driver.switchTo().alert();
        return alert.getText();
    }
}
