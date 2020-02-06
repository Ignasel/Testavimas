import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SeleniumTest {
    @Before
    public void setup(){
        Selenium.setup();
    }
    @Test
        public void searchByKeywordTest(){
        Selenium.searchByKeyword("Baranauskas");
    }
    @After
    public void close(){
        Selenium.close();
    }
}
