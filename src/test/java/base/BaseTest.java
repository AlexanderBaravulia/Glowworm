package base;

import driver.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utill.ResourceUtils;

import java.util.Properties;

import static utill.ResourceUtils.Resource.BROWSER;

public class BaseTest {

    protected Properties browserProperties = ResourceUtils.get(BROWSER);
    protected WebDriver webDriver;

    public BaseTest() {
        this.webDriver = WebDriverProvider.get(browserProperties.get("browser").toString());
    }

    @BeforeMethod
    public void setUp() {
        webDriver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        WebDriverProvider.closeDriver();
    }
}
