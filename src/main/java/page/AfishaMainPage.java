package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AfishaMainPage extends AbstractPage {

    public final static String URL = "https://afisha.tut.by/";

    @FindBy (xpath = "//a[@class='name-resource']")
    private WebElement afishaLogo;

    @FindBy (xpath = "//a[contains(@title, 'Концерты')]")
    private WebElement concertsButton;

    public AfishaMainPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLogoPresent(){
        return afishaLogo.isDisplayed();
    }

    @Override
    public <T> T open(Class<T> type){
        driver.get(URL);
        return (T) this;
    }

    public ConcertsMainPage clickConcertsButton(){
        concertsButton.click();
        return new ConcertsMainPage(driver);
    }

}
