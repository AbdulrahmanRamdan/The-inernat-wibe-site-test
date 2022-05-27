package Theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox {
    private WebDriver driver;
    private By Text_Link=By.linkText("Checkboxes");
    private By CheckBox1=By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)");
    private By CheckBox2=By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)");

    public CheckBox(WebDriver webDriver){this.driver=webDriver;}

    public void Click_Link() {
       driver.findElement(Text_Link).click();
    }
    public void Click1(){driver.findElement(CheckBox1).click();}
    public void Click2(){driver.findElement(CheckBox2).click();}

}
