package pageObjects;

import core.driver.DriverControls;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObject extends DriverControls {

    public LoginObject () {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id=\"userName\"]")
    public WebElement inptLogin;

    @FindBy(xpath = "//input[@id=\"password\"]")
    public WebElement inptPassword;

    @FindBy(xpath = "//button[@id=\"login\"]")
    public WebElement btnLogin;

    @FindBy(xpath = "//p[@id=\"name\"]")
    public WebElement errorLabel;
}
