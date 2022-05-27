package TESTS;

import Theinternet.Dynamic_Controll;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dynamic_Controll_Test extends Base_To_Test{
    private Dynamic_Controll dynamic_controll;
    @Test(priority = 1)
    void Click_Link(){
        dynamic_controll=homepages.dynamic_controll();
        String txt=dynamic_controll.Click_Link();
        Assert.assertTrue(txt.contains("Dynamic Controls"));
    }
    @Test(priority = 2)
    void CheckedBox(){
        dynamic_controll.CheckBox();
        eyes.validatewindow();
    }
    @Test(priority = 3)
    void Check_Add_Remove_txt_Before(){
        Assert.assertTrue(dynamic_controll.Get_Add_Remove_txt().contains("Remove"));
    }
    @Test(priority = 4)
    void Click_Remove_Button(){
        dynamic_controll.Add_Remove_Click();
        Assert.assertTrue(dynamic_controll.Get_Change_Txt().contains("Add"));
    }
    @Test(priority = 5)
    void Check_massage_gone(){
        Assert.assertTrue(dynamic_controll.Get_Message_Txt().contains("It's gone!"));
    }
    @Test(priority = 6)
    void Click_Add_Button(){
        dynamic_controll.Add_Remove_Click();
        Assert.assertTrue(dynamic_controll.Get_Change_Txt().contains("Remove"));
    }
    @Test(priority = 7)
    void Check_massage_Back(){
        Assert.assertTrue(dynamic_controll.Get_Message_Txt().contains("It's back!"));
        eyes.validatewindow();
    }

}
