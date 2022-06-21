package StepObj;

import PageObj.Login;
import io.qameta.allure.Step;

public class LoginStep extends Login {
    public LoginStep gotopage() {
        Registarionbtn.click();
        return this;
    }
    @Step("Log in email is - {email}")
    public LoginStep Email(String Email) {
        EmailInput.setValue(Email);
        return this;
    }

    @Step("Log in passwprd is - {password}")
    public LoginStep Password(String Password) {
        PasswordINput.setValue(Password);
        return this;
    }

    public LoginStep SubbmitButton() {
        SubbmitButton.click();
        return this;
    }
}