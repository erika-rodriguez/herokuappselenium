import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ABTesting;

public class HomePageTest extends BaseTest{
    @Test
    public void welcomeTxtTest(){
        Assert.assertTrue(home.getWelcomeTxt().contains("Welcome"));
    }
    @Test
    public void ABtestingTest(){
        ABTesting section= home.clickOnABtesting();
        section.getABTitle();
        section.getABText();
    }
}
