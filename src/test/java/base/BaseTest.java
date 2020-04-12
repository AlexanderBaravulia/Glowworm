package base;

import driver.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import utill.ResourceUtils;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static utill.ResourceUtils.Resource.BROWSER;

public class BaseTest {

    protected Properties browserProperties = ResourceUtils.get(BROWSER);
    protected WebDriver webDriver;

    public BaseTest() {
        this.webDriver = WebDriverProvider.get(browserProperties.get("browser").toString());
    }

    @BeforeTest
    public void setUp() {
        WebDriverProvider.get(browserProperties.get("browser").toString());
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDown() {
        WebDriverProvider.closeDriver();
    }
}
