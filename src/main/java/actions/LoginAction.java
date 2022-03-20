package actions;

import pageObjects.LoginObject;

import java.time.Duration;

import static core.waiting.Waiting.waitElementByTimeout;

public class LoginAction extends LoginObject {

    public void setLogin ( String login ) {
        inptLogin.sendKeys(login);
    }

    public void setPassword ( String password ) {
        inptPassword.sendKeys(password);
    }

    public void clickLogin () {
        btnLogin.click();
    }

    public Boolean checkErrorLabelIsPresent () {
        waitElementByTimeout(errorLabel, Duration.ofSeconds(1));
        return errorLabel.isDisplayed();
    }

}
