package TESTS;
import Theinternet.A_B;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A_B_TEST extends Base_To_Test {

    @Test
    void A_B_TEST(){
        A_B a_b=homepages.A_B_CLASS();
        a_b.clickthelink();
        Assert.assertTrue(a_b.get_text().contains("A/B Test"));
    }
}
