package common;

import org.openqa.selenium.WebDriver;
import pages.ABTesting;

public abstract class HomePageBase {
    public WebDriver driver;
    public HomePageBase(WebDriver driver){
        this.driver=driver;
    }
    public abstract String getWelcomeTxt();
    public abstract ABTesting clickOnABtesting();
}
