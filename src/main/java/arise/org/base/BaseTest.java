package arise.org.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseTest {
    public static WebDriver driver;

    public static void launchBrowser(String browserValue){
//        ChromeOptions chrome = new ChromeOptions();
//                chrome.setBrowserVersion("stable");
//                driver = new ChromeDriver(chrome);
//              //  driver.get("https://www.naaptol.com/");
//                driver.get("https://practicetestautomation.com/");
//                driver.manage().window().fullscreen();

        switch (browserValue) {
            case "Chrome":
                ChromeOptions chrome = new ChromeOptions();
                chrome.setBrowserVersion("stable");
                driver = new ChromeDriver(chrome);
                driver.get("https://practicetestautomation.com/");
                break;

            case "Edge":
                EdgeOptions edge=new EdgeOptions();
                edge.setBrowserVersion("stable");
                driver=new EdgeDriver(edge);
                driver.get("https://practicetestautomation.com/");
                break;

            case "FireFox":
                FirefoxOptions firefox=new FirefoxOptions();
                firefox.setBrowserVersion("stable");
                driver=new FirefoxDriver(firefox);
                driver.get("https://practicetestautomation.com/");
                break;


            default:
                break;
        }
    }
}
