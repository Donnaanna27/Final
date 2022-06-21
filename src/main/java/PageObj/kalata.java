package PageObj;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;

public class kalata {
    public SelenideElement
    kalatabtn = $(".ty-minicart-title"),
    gaformebabtn = $(byLinkText("შეკვეთის გაფორმება")),
    dabrunebabtn = $(byLinkText("მაღაზიაში დაბრუნება"));
}
