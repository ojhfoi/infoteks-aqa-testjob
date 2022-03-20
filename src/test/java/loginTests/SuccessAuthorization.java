package loginTests;

import actions.BooksAction;
import actions.LoginAction;
import core.driver.DriverControls;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static core.settings.ProjectSetting.PROJECT_SETTING;
import static core.waiting.Waiting.waitElement;

@Log4j2
public class SuccessAuthorization {

    DriverControls driverControls;
    BooksAction booksAction;
    LoginAction loginAction;

    @BeforeTest
    public void tearUp () {
        driverControls = new DriverControls();
        log.info("Создаем новый экземпляр драйвера: " + PROJECT_SETTING.getBrowser());
        driverControls.createNewDriver(PROJECT_SETTING.getBrowser());
        log.info("Переходим на сайт: " + PROJECT_SETTING.getUrl());
        driverControls.openSite(PROJECT_SETTING.getUrl());
    }

    @Test
    @Parameters({"login", "password"})
    public void test ( String login, String password ) {
        booksAction = new BooksAction();
        loginAction = new LoginAction();
        booksAction.clickLogin();
        loginAction.setLogin(login);
        loginAction.setPassword(password);
        loginAction.clickLogin();
        waitElement(booksAction.lblUserName);
        Assert.assertTrue(booksAction.checkLblUserNamePresent());
        Assert.assertEquals(booksAction.getCurrentUserName(), login);
    }

    @AfterTest
    public void tearDown () {
        driverControls.closeDriver();
    }
}
