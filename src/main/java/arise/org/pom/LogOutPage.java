package arise.org.pom;

import arise.org.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class LogOutPage {

    @FindBy (xpath = "//a[text()='Log out']") private List<WebElement> btnLogout;
    @FindBy (xpath = "//h1[text()='Logged In Successfully']") private List<WebElement> txtLogiSuccesfull;

    public LogOutPage(){
        PageFactory.initElements(BaseTest.driver,this);
    }

    public int returnSizeOfLogoutButton() throws Exception {
        int size = btnLogout.size();
        return size;

    }
}
