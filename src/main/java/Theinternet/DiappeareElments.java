package Theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DiappeareElments {
    private WebDriver driver;
    public String Base_Url;
    public String Dia_Url;
    private By link=By.linkText("Disappearing Elements");
    private By home_tn=By.linkText("Home");
    private By About_btn=By.linkText("About");
    private By Contact_Us=By.linkText("Contact Us");
    private By Portfolio=By.linkText("Portfolio");
    private By Gallery=By.linkText("Gallery");
    public DiappeareElments(WebDriver driver){this.driver=driver;Base_Url=driver.getCurrentUrl();}
    public void Click_link(){
        driver.findElement(link).click();

        Dia_Url=driver.getCurrentUrl();
    }
    public String Click_Home(){
        driver.findElement(home_tn).click();
        return driver.getCurrentUrl();
    }
    public String Click_About(){
        Set_url();
        driver.findElement(About_btn).click();
        return Get_About();
    }
    private String Get_About() {
         return driver.findElement(By.tagName("h1")).getText();
    }
    public String Click_Contact(){
        Set_url();
        driver.findElement(Contact_Us).click();
        return Get_About();
    }
    public String Click_Portfolio(){
        Set_url();
        driver.findElement(Portfolio).click();
        return Get_About();
    }
  public String Click_Gallery(){
      Set_url();
    driver.findElement(Gallery).click();
    return Get_About();
}
public void Set_url(){driver.get(Dia_Url);}

}
