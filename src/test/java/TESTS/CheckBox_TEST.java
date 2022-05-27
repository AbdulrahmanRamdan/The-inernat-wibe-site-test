package TESTS;

import Theinternet.CheckBox;
import org.testng.annotations.Test;

public class CheckBox_TEST extends Base_To_Test{
    CheckBox checkBox;
    @Test(priority = 1)
    void go_ckeck(){
        checkBox=homepages.checkBox();
        checkBox.Click_Link();
    }
    @Test(priority = 2)
    void uncheckall(){
        checkBox.Click2();
        eyes.validatewindow();
    }
    @Test(priority = 3)
    void checkall(){
        checkBox.Click1();
        checkBox.Click2();
        eyes.validatewindow();
    }

}
