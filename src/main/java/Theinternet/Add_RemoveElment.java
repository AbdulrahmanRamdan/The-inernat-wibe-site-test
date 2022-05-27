package Theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Add_RemoveElment {
    private WebDriver driver;
    private By add=By.cssSelector("#content > div > button");
    private By delete=By.cssSelector("#elements > button");
    private By link=By.linkText("Add/Remove Elements");
    public Add_RemoveElment(WebDriver webDriver){driver = webDriver;}
    public void clickonlink(){
        driver.findElement(link).click();
    }
    public void Add_Elment(){
        driver.findElement(add).click();
    }
    public void Remove_Elment(){
        driver.findElement(delete).click();
    }
}
