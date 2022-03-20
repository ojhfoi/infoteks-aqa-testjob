package core.waiting;

import core.driver.DriverControls;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiting extends DriverControls {

    public static void waitElement ( WebElement element ) {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitElementByTimeout ( WebElement element, Duration duration ) {
        new WebDriverWait(driver, duration).until(ExpectedConditions.elementToBeClickable(element));
    }

}
