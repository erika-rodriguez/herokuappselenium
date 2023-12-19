import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.HomePage;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage home;

    @BeforeTest
    public void setUp(){
        //System.setProperty("webdriver.chrome.driver","/Downloads/chromedriver");
        //Start the session
        driver = new ChromeDriver();
        //Navigate to a web page
        driver.get("https://the-internet.herokuapp.com/");

        home=new HomePage(driver);
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
