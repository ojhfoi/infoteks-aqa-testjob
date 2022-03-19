package core.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public enum DriversCreator {
    CHROME{
        @Override
        public WebDriver create () {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito", "--no-sandbox", "--windows-size=1280,1024");
            return new ChromeDriver(options);
        }
    },

    FIREFOX{
        @Override
        public WebDriver create () {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--private", "--no-sandbox", "--windows-size=1280,1024");
            return new FirefoxDriver(options);
        }
    };

    public WebDriver create () {
        return null;
    }
}
