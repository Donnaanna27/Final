package PageObj;

import com.codeborne.selenide.SelenideElement;

//import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class RegPage {
    public SelenideElement
    Registarionbtn = $(byText("შესვლა / რეგისტრაცია")),
            Regbtn = $(byText("რეგისტრაცია")),
    EmailInput = $("#email"),
    PasswordINput = $("#password1"),
    ConfirmPassInput = $("#password2"),
    FirstnameInput = $("#elm_6"),
    LastnameInput = $("#elm_7"),
    TermChackBox = $("#id_accept_terms_site"),
    Subbmitbtn =$(byXpath("//*[@id=\"tygh_main_container\"]/div[4]/div/div/div[2]/div/div/div/form/div[7]/button"));

}

