package TESTS;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Brokenimages extends Base_To_Test{
    @Test
    void screen(){
        driver.findElement(By.linkText("Broken Images")).click();
        eyes.validatewindow();
    }
}
