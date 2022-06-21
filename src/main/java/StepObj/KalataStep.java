package StepObj;
import PageRun.KalataRun;
import PageObj.kalata;

public class KalataStep extends kalata {
    public KalataStep Gotopage (){
        kalatabtn.click();
        return this;
    }
    public KalataStep gaformeba (){
        gaformebabtn.click();
        return this;
    }
    public KalataStep dabruneba (){
        dabrunebabtn.click();
        return this;
    }
}
