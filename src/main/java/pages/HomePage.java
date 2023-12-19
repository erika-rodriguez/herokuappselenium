package pages;

import common.HomePageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.logging.Logger;

public class HomePage extends HomePageBase {
    public static final Logger LOGGER= Logger.getLogger(String.valueOf(HomePage.class));
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getWelcomeTxt() {
        WebElement welcomeTxt=driver.findElement(By.xpath("//div[@id='content']/h1"));
       LOGGER.info(welcomeTxt.getText());
        return welcomeTxt.getText();
    }

    @Override
    public ABTesting clickOnABtesting() {
        WebElement testing=driver.findElement(By.xpath("//div[@id='content']/ul/li[contains(a,'A/B Testing')]/a"));
        testing.click();
        return new ABTesting(driver);
    }
}
