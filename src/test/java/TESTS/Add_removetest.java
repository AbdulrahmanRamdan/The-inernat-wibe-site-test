package TESTS;
import Theinternet.Add_RemoveElment;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.testng.annotations.Test;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Add_removetest extends Base_To_Test  {
    Add_RemoveElment  add_removeElment;
   @Test(priority = 1)
    void enter_Link(){
       add_removeElment=homepages.ADD_RE_CLASS();
        add_removeElment.clickonlink();
    }
    @Test(priority = 2)
    void Add_element(){
        add_removeElment.Add_Elment();
    }
    @Test(priority = 3)
    void Delete_element(){
        add_removeElment.Remove_Elment();
    }

}
