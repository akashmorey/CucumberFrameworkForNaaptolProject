package arise.org.utils;

import arise.org.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

public class genric {

    public static void weaitForElement(List<WebElement> elements) throws Exception {
        Function testConditionWait = i -> elements.size() > 0;
        WebDriverWait wait = new WebDriverWait(BaseTest.driver, Duration.ofSeconds(120));

        try {
            wait.until(testConditionWait);
        }
        catch (Exception e){
            throw new Exception("element not visible before in 120 seconds");
        }
    }
    public static void action_click(List<WebElement>elements) throws Exception {
        weaitForElement(elements);
        elements.get(0).click();
    }

    public static void action_sandkeys(List<WebElement>elements,String value) throws Exception {
        weaitForElement(elements);
        elements.get(0).sendKeys(value);
    }
}
