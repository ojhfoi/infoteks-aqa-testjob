package pageObjects;

import core.driver.DriverControls;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BooksObject extends DriverControls {

    public BooksObject () {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id=\"searchBox\"]")
    public WebElement inptSearch;

    @FindBy(xpath = "//div[@class=\"rt-noData\"]")
    public WebElement lblNoData;

    @FindBy(xpath = "//button[@id=\"login\"]")
    public WebElement btnLogin;

    @FindBy(xpath = "//label[@id=\"userName-value\"]")
    public WebElement lblUserName;

    @FindBy(xpath = "//span[contains(@id,\"see-book\")]")
    public List<WebElement> booksTitle;

}
