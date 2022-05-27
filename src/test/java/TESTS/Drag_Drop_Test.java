package TESTS;

import Theinternet.Drag_Drop;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Drag_Drop_Test extends Base_To_Test{
    private Drag_Drop drag_drop;
    String TXTA;
    String TXTB;
    @Test(priority = 1)
    void Click(){
    drag_drop=homepages.drag_drop();
    drag_drop.Click();
    TXTA=drag_drop.Get_Text_A();
    TXTB=drag_drop.Get_Text_B();
    }
    @Test(priority = 2)
    void Drag_DroP_1(){
        drag_drop.DRAG_DROP();
        String B=drag_drop.Get_Text_A();
        String A=drag_drop.Get_Text_B();
        Assert.assertEquals(TXTB,A);
        Assert.assertEquals(TXTA,B);
        TXTA=A;TXTB=B;
    }
    @Test(priority = 3)
    void Drag_DroP_2(){
        drag_drop.DRAG_DROP();
        String A=drag_drop.Get_Text_A();
        String B=drag_drop.Get_Text_B();
        Assert.assertEquals(TXTB,A);
        Assert.assertEquals(TXTA,B);
    }
}
