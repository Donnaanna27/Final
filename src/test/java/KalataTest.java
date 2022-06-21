package GoTest;

import PageRun.KalataRun;
import StepObj.KalataStep;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;


public class KalataTest extends KalataRun {
        @Test
        public void Registration(){
            KalataStep Step = new KalataStep();
            Step
                    .Gotopage()
                    .gaformeba()
                    .dabruneba();
            sleep(3000);
            Assert.assertTrue(Step.dabrunebabtn.isDisplayed());
            sleep(3000);
        }
    }
