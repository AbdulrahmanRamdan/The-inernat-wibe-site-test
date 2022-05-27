package TESTS;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Dynamic_Content_Test extends Base_To_Test{
    @Test(priority = 1)
    void Click_link(){
      driver.findElement(By.linkText("Dynamic Content")).click();
    }
    @Test(priority = 2)
    void Screen(){
        eyes.validatewindow();
    }
    @Test(priority = 3)
    void Screen_After_click(){
        driver.findElement(By.linkText("click here")).click();
        eyes.validatewindow();
    }
}
