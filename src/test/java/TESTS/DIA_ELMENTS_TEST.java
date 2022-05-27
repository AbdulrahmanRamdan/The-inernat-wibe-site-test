package TESTS;

import Theinternet.DiappeareElments;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DIA_ELMENTS_TEST extends Base_To_Test{
    DiappeareElments diappeareElments;
    @Test(priority = 1)
    void Home_Click(){
        diappeareElments=homepages.diappeareElments();
        diappeareElments.Click_link();
        String url=diappeareElments.Click_Home();
        Assert.assertEquals(diappeareElments.Base_Url,url);
    }
    @Test(priority = 2)
    void About_Click(){
        String txt=diappeareElments.Click_About();
        Assert.assertEquals("Not Found",txt);
    }
    @Test(priority = 3)
    void Click_Gallery(){
        String txt=diappeareElments.Click_Gallery();
        Assert.assertEquals("Not Found",txt);
    }
    @Test(priority = 4)
    void Click_Contact(){

        String txt=diappeareElments.Click_Contact();
        Assert.assertEquals("Not Found",txt);
    }
    @Test(priority = 5)
    void Click_Portfolio(){

        String txt=diappeareElments.Click_Portfolio();
        Assert.assertEquals("Not Found",txt);
    }

}
