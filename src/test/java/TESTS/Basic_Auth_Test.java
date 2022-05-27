package TESTS;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Basic_Auth_Test extends Base_To_Test{
    @Test
    void Test_Basic(){
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText()
                ,"Congratulations! You must have the proper credentials.");
    }
}
