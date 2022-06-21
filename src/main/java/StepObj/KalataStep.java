package StepObj;

import PageObj.kalata;
import io.qameta.allure.Step;

public class KalataStep extends kalata {
    @Step(" kalata Button is - {press}")
    public KalataStep Gotopage (){
        kalatabtn.click();
        return this;
    }
    @Step("gaformeba Button is - {press}")
    public KalataStep gaformeba (){
        gaformebabtn.click();
        return this;
    }
    @Step("dabruneba Button is - {press}")
    public KalataStep dabruneba (){
        dabrunebabtn.click();
        return this;
    }
}
