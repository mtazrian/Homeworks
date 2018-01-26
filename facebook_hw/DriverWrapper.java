package facebook_hw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

/**
 * Created by Mo Tazrian on 1/25/18.
 */
public class DriverWrapper {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void initializeWebdriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/Audiotore/Documents/chromedriver");
        driver = new ChromeDriver();
    }
}
