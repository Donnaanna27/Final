package PageObj;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class Login {
    public SelenideElement
            Registarionbtn = $(byText("შესვლა / რეგისტრაცია")),
            EmailInput = $("#login_popup342"),
            PasswordINput = $("#psw_popup342"),
            SubbmitButton =  $(byXpath("//*[@id=\"tab_login\"]/form/div[3]/button"));

           }
