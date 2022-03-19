package core.driver;

import org.openqa.selenium.WebDriver;

public class DriverControls {

    private static WebDriver driver;

    public void tearUp(String browser ) {
        driver = DriversCreator.valueOf(browser).create();
    }

    public void tearDown() {
        driver.close();
    }

    public void navigate ( String url ) {
        driver.navigate().to(url);
    }

}
