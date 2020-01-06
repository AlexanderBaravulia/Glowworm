package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AfishaMainPage extends AbstractPage {

    public final static String URL = "https://afisha.tut.by/";

    @FindBy (xpath = "//a[@class='name-resource' and contains(text(), 'АФИША')]")
    private WebElement afishaLogo;

    public AfishaMainPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLogoPresent(){
        return afishaLogo.isDisplayed();
    }

    @Override
    public void open(){
        driver.get(URL);
    }
}
