package StepObj;

import PageObj.RegPage;
import io.qameta.allure.Step;

public class RegStep extends RegPage {
    @Step("Reg Button is - {Click}")
    public RegStep GotoRegpage(){
        Registarionbtn.click();
        return this;
    }
    @Step("Reg Button is - {press}")
    public RegStep Regbtn(){
        Regbtn.click();
        return this;
    }
    @Step("Log in email is - {email}")
    public RegStep Email(String Email){
       EmailInput.setValue(Email);
        return this;
    }
    @Step("Log in Password is - {Password}")
    public RegStep Password (String Password){
        PasswordINput.setValue(Password);
        return this;
    }
    @Step("Log in ConfirmPassword is - {ConfirmPassword}")
    public RegStep ConfirmPassword(String ConfirmPassword){
        ConfirmPassInput.setValue(ConfirmPassword);
        return this;
    }
    @Step("Log in FirstName is - {FirstName}")
    public RegStep FirstName(String FirstName){
        FirstnameInput.setValue(FirstName);
        return this;
    }
    @Step("Log in LastName is - {LastName}")
    public RegStep LastName(String LastName){
        LastnameInput.setValue(LastName);
        return this;
    }
    @Step("Chackbox  is - {Chack}")
    public RegStep TermChackBox(){
        TermChackBox.click();
        return this;
    }
    @Step("Regbutton Button is - {press}")

    public RegStep Subbmitbtn(){
        Subbmitbtn.click();
        return this;
    }
}
