package afisha;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AfishaMainPage;

public class SmokeTest extends BaseTest {

    private AfishaMainPage afishaMainPage = new AfishaMainPage(webDriver);

    @Test
    public void checkLogoTest() {
        afishaMainPage.open();
        Assert.assertTrue(afishaMainPage.isLogoPresent(), "Afisha page is not opened");
    }
}
