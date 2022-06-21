import PageRun.ChromeRun;
import StepObj.RegStep;
import org.testng.Assert;
import org.testng.annotations.Test;
import static DataObj.RegData.*;
import static com.codeborne.selenide.Selenide.sleep;

public class RegistrationTest extends ChromeRun {
    @Test
    public void Registration(){
        RegStep Step = new RegStep();
        Step
                .GotoRegpage()
                .Regbtn()
                .Email(email)
                .Password(Password)
                .ConfirmPassword(confirmPassword)
                .FirstName(firstName)
                .LastName(lastName)
                .TermChackBox()
                .Subbmitbtn();
        sleep(3000);
        Assert.assertTrue(Step.Subbmitbtn.isDisplayed());
        sleep(3000);

    }
}
