package driver;

import org.openqa.selenium.WebDriver;

import java.util.Optional;

public class WebDriverProvider implements IWebDriverProvider {

    private final static ThreadLocal<WebDriver> CACHE = ThreadLocal.withInitial(() -> null);

    private WebDriverProvider() {
    }

    private static Optional<WebDriver> getFromCache() {
        return Optional.ofNullable(CACHE.get());
    }

    public static WebDriver get(String browserName) {
        return getFromCache().orElseGet(() -> {
            WebDriverFactory factory = WebDriverFactory.getInstance(browserName);
            WebDriver driver = factory.create();
            CACHE.set(driver);
            return driver;
        });
    }

    //@Override
    public static void closeDriver() {
        getFromCache().ifPresent(driver -> {
            driver.quit();
            CACHE.remove();
        });
    }
}
