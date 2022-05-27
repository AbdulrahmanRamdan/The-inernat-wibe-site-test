package TESTS;

import Theinternet.ContextMenu;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends Base_To_Test{
    ContextMenu contextMenu;
    @Test(priority = 1)
    void click_link(){
        contextMenu=homepages.contextMenu();
        contextMenu.Click_To_link();
    }
    @Test(priority = 2)
    void click_Context(){
        contextMenu.Context_Click();
    }
    @Test(priority = 3)
    void Assert_Alert_Message(){
        Assert.assertEquals("You selected a context menu",contextMenu.Get_Alert_text());
    }
}
