package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public enum WebDriverFactory {
    CHROME
            {
                @Override
                public WebDriver create()
                {
                    return new ChromeDriver();
                }
            },
    FIREFOX
            {
                @Override
                public WebDriver create()
                {
                    return new FirefoxDriver();
                }
            };

    public abstract WebDriver create();

    public static WebDriverFactory getInstance(String browser){
        return WebDriverFactory.valueOf(browser.toUpperCase());
    }
}
