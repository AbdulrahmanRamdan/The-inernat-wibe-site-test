package TESTS;

import Theinternet.DOM_Change;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dom_change_Test extends Base_To_Test{
    DOM_Change dom_change;
    String Canvas;
    @Test(priority = 1)
    void Click_to_link(){
        dom_change=homepages.Dom_Change();
        dom_change.Click_to_Dom();
        Canvas =dom_change.Get_Canvas();
    }
    @Test(priority = 2)
    void click_blue(){
        dom_change.Click_blue();
        Assert.assertEquals(Canvas,dom_change.Get_Canvas());
        eyes.validatewindow();
    }
    @Test(priority = 3)
    void click_red(){
        dom_change.Click_Red();
        Assert.assertEquals(Canvas,dom_change.Get_Canvas()); eyes.getEyes().setForceFullPageScreenshot(true);
        eyes.validatewindow();
    }
    @Test(priority = 4)
    void click_green(){
        dom_change.Click_Green();
        Assert.assertEquals(Canvas,dom_change.Get_Canvas());
        eyes.getEyes().setForceFullPageScreenshot(true);
        eyes.validatewindow();
    }
}
