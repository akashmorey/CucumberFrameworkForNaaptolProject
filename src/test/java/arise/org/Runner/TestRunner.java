package arise.org.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/arise/org/Feature",
        glue = "arise/org/stepDefination",
        monochrome = true,
        tags = "@login"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
