package arise.org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    public static String launchBrowser(String url){
        ChromeOptions chrome=new ChromeOptions();
        chrome.setBrowserVersion("120");

        WebDriver driver=new ChromeDriver(chrome);
        driver.get(url);
        return url;

    }
}
