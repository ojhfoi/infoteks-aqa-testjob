package actions;

import lombok.extern.log4j.Log4j2;
import pageObjects.BooksObject;

@Log4j2
public class BooksAction extends BooksObject {

    public void fillSearchPanel (String searchText ) {
        inptSearch.sendKeys(searchText);
    }

    public Boolean checkNoDataPresent () {
        return lblNoData.isDisplayed();
    }

    public void clickLogin () {
        btnLogin.click();
    }

    public Boolean checkLblUserNamePresent () {
        return lblUserName.isDisplayed();
    }

    public String getCurrentUserName () {
        return lblUserName.getText();
    }

    public Boolean findBookTitle ( String bookTitle ) {
        String findTitle = String.valueOf(booksTitle.stream().filter(book -> bookTitle.equals(book.getText()))
                .findFirst()
                .orElse(null));
        if ( findTitle != null ) {
            log.info("Книга с названием: " + bookTitle + " успешно найдена");
            return true;
        }
        log.info("Не удалось найти книгу с названием: " + bookTitle);
        return false;
    }

    public Integer getBooksCount () {
        return booksTitle.size();
    }

}
