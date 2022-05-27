package Theinternet;

import org.openqa.selenium.WebDriver;

public class Homepages
{
    private WebDriver driver;
    public Homepages(WebDriver driver){
        this.driver=driver;
    }
    public A_B A_B_CLASS(){
        return new A_B(driver);
    }
    public Add_RemoveElment ADD_RE_CLASS(){
        return new Add_RemoveElment(driver);
    }
    public DOM_Change Dom_Change(){return new DOM_Change(driver);}
    public CheckBox checkBox(){return new CheckBox(driver );}
    public ContextMenu contextMenu(){return new ContextMenu(driver);}
    public DiappeareElments diappeareElments(){return new DiappeareElments(driver);}
    public Drag_Drop drag_drop(){return new Drag_Drop(driver);}
    public DropDown dropDown(){return new DropDown(driver);}
    public Dynamic_Controll dynamic_controll(){return new Dynamic_Controll(driver);}
}
