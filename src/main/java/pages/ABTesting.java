package pages;

import common.ABTestingBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.logging.Logger;

public class ABTesting extends ABTestingBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(ABTesting.class));
    public ABTesting(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getABTitle() {
        WebElement ABtitle=driver.findElement(By.xpath("//div[@class='example']/h3"));
        LOGGER.info(ABtitle.getText());
        return ABtitle.getText();
    }

    @Override
    public String getABText() {
        WebElement ABtxt=driver.findElement(By.xpath("//div[@class='example']/p"));
        LOGGER.info(ABtxt.getText());
        return ABtxt.getText();
    }
}
