package PageRun;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;

public class KalataRun {
        @BeforeTest(description = "Configure Browser Before tests")
        public void Setup() {

            Selenide.open("https://alta.ge/");
            Configuration.browserSize = "1920X1080";
        }
    }

