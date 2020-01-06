package base;

import driver.IWebDriverProvider;
import driver.WebDriverProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utill.ResourceUtils;

import java.util.Properties;

import static utill.ResourceUtils.Resource.BROWSER;

public class AbstractTest
{
    Properties browserProperties = ResourceUtils.get(BROWSER);
    //protected DataProvider dataProvider;

    @BeforeMethod
    public void setUp()
    {
        WebDriverProvider.get(browserProperties.get("browser").toString()).manage().window().maximize();
    }

   @AfterMethod
    public void tearDown()
    {
        WebDriverProvider.closeDriver();
    }
}
