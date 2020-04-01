package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConcertsMainPage extends AbstractPage {

    private final static String CONCERTS_TITLE = "Концерты";

    @FindBy (xpath = "//li[@class='main_menu_item m-orange selected active ']/a")
    private WebElement activeConcertsButton;

    @FindBy (xpath = "//div[@class='b-afisha-event js-film-info'][1]//div[@class='a-event-item js-film-list'][1]//a[@class='header__link']")
    private WebElement firstEvent;

    public ConcertsMainPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public <T> T open(Class<T> type) {
        return null;
    }

    public boolean isConcertButtonActive(){
        return CONCERTS_TITLE.equals(activeConcertsButton.getText());
    }

    public EventDescriptionPage clickFirstEvent(){
        firstEvent.click();
        return new EventDescriptionPage(driver);
    }
}
