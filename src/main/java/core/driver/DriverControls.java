package core.driver;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;

@Log4j2
public class DriverControls {

    public static WebDriver driver;

    public void createNewDriver(String driverType) {
        try {
            driver = DriversCreator.valueOf(driverType).create();
        } catch (Throwable throwable) {
            log.error("Не удалось создать новый экземпляр драйвера");
        }
    }

    public void openSite( String url) {
        driver.navigate().to(url);
    }

    public void closeDriver() {
        if (driver != null) {
            driver.close();
        }
    }

}
