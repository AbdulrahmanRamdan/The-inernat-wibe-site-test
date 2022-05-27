package TESTS;

import Theinternet.DropDown;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTest extends Base_To_Test{
private DropDown dropDown;
private By Option1=By.cssSelector("#dropdown > option:nth-child(2)");
private By Option2=By.cssSelector("#dropdown > option:nth-child(3)");
@Test(priority = 1)
    void Click(){
    dropDown=homepages.dropDown();
    dropDown.Click_Link();}
    @Test(priority = 2)
    void Check_No_selection(){
        dropDown.Click_Menu();
        Assert.assertTrue(dropDown.Get_text().contains("Please select an option"));
    }
@Test(priority = 3)
    void Check_Option_1(){
    dropDown.Click_Menu();
    dropDown.Set_Option(Option1);
    Assert.assertTrue(dropDown.Get_text().contains("Option 1"));
}
    @Test(priority = 4)
    void Check_Option_2(){
        dropDown.Click_Menu();
        dropDown.Set_Option(Option2);
        Assert.assertTrue(dropDown.Get_text().contains("Option 2"));
    }
}
