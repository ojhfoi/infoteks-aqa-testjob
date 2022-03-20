package booksTest;

import actions.BooksAction;
import core.driver.DriverControls;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static core.settings.ProjectSetting.PROJECT_SETTING;

@Log4j2
public class UnsuccessBookFind {

    DriverControls driverControls;
    BooksAction booksAction;

    @BeforeTest
    public void tearUp () {
        driverControls = new DriverControls();
        log.info("Создаем новый экземпляр драйвера: " + PROJECT_SETTING.getBrowser());
        driverControls.createNewDriver(PROJECT_SETTING.getBrowser());
        log.info("Переходим на сайт: " + PROJECT_SETTING.getUrl());
        driverControls.openSite(PROJECT_SETTING.getUrl());
    }

    @Test
    @Parameters("searchText")
    public void test (String searchText) {
        booksAction = new BooksAction();
        booksAction.fillSearchPanel(searchText);
        Assert.assertTrue(booksAction.checkNoDataPresent());
        int currentBooksCount = booksAction.getBooksCount();
        Assert.assertEquals(currentBooksCount, 0);
    }

    @AfterTest
    public void tearDown () {
        driverControls.closeDriver();
    }

}
