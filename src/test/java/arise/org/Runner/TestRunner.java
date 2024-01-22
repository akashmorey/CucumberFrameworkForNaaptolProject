package arise.org.Runner;

import arise.org.base.BaseTest;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        features = "src/test/java/arise/org/Feature",
        glue = "arise/org/stepDefination",
        monochrome = true,
        tags = "@contact"

)
public class TestRunner extends AbstractTestNGCucumberTests {
    @BeforeClass
    public void preconditions(){
        BaseTest.launchBrowser("Chrome");
        BaseTest.driver.manage().window().maximize();
    }

    @AfterClass
    public void postCondition() throws InterruptedException {
        Thread.sleep(5000);
        BaseTest.driver.quit();
        System.out.println("Browser Quit");
    }
}
