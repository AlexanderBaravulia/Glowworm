package afisha;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AfishaMainPage;
import page.ConcertsMainPage;

public class SmokeTest extends BaseTest {

    private AfishaMainPage afishaMainPage = new AfishaMainPage(webDriver);

    @Test
    public void checkLogoTest() {
        afishaMainPage.open(AfishaMainPage.class).isLogoPresent();
        Assert.assertTrue(afishaMainPage.isLogoPresent(), "Afisha page is not opened");
    }

    @Test
    public void chooseFirstConcertTest() {
        afishaMainPage.open(AfishaMainPage.class);
        ConcertsMainPage concertsMainPage = afishaMainPage.clickConcertsButton();
        concertsMainPage.clickFirstEvent();
        Assert.assertTrue(concertsMainPage.isConcertButtonActive(), "The concert button is not active");
    }
}
