package Theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDown {
    private WebDriver driver;
    private By Link=By.linkText("Dropdown");
    private By Select= By.id("dropdown");
    private String Base_Url;
    public DropDown(WebDriver webDriver){this.driver=webDriver;
    Base_Url=driver.getCurrentUrl();}
    public void Click_Link(){
        driver.findElement(Link).click();
    }
    public void Click_Menu(){
        driver.findElement(Select).click();
    }
    public String Get_text(){return driver.findElement(Select).getText();}
    public void Get_Base_Url(){driver.get(Base_Url);}
    public void Set_Option(By Option){driver.findElement(Option).click();}
}
