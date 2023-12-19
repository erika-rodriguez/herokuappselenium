package common;

import org.openqa.selenium.WebDriver;
import pages.ABTesting;

public abstract class ABTestingBase {
    public WebDriver driver;

    public ABTestingBase(WebDriver driver){
        this.driver=driver;
    }
    public abstract String getABTitle();
    public abstract String getABText();
}
