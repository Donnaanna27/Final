import PageRun.KalataRun;
import StepObj.LoginStep;
//import org.testng.Assert;
import org.testng.annotations.Test;
import static DataObj.LoginData.*;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginTest extends KalataRun {
    @Test
    public void Registration(){
        LoginStep Steps = new LoginStep();
        Steps
                .gotopage()
                .Email(email)
                .Password(password)
                .SubbmitButton();
        //Assert.assertTrue(Steps.SubbmitButton.isDisplayed());
        sleep(3000);

    }
}
