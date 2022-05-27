package TESTS;

import Theinternet.Homepages;
import com.applitools.eyes.selenium.Eyes;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Base_To_Test {
    protected static WebDriver driver;
    protected eyesmanager eyes;
    protected Homepages homepages;
    @BeforeClass
    void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ABDO\\Downloads\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        Assert.assertEquals(driver.getTitle(),"The Internet");
        eyes=new eyesmanager(driver,"Training");
        homepages=new Homepages(driver);
    }

    @AfterClass
    void finish(){
        driver.quit();
    }
}
