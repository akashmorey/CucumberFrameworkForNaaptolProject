
package arise.org.pom;
import arise.org.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {
    @FindBy(xpath = "//input[@name='username']") private List<WebElement> inpUserName;
    @FindBy(xpath = "//input[@id='password']") private List<WebElement> inpPassword;
    @FindBy (xpath = "//button[text()='Submit']") private List<WebElement> btnSubmit;

    public LoginPage()
    {

        PageFactory.initElements(BaseTest.driver,this);
    }

    public void enterUserNameAndPassword(String username,String password) throws Exception {
        inpUserName.get(0).sendKeys(username);
        inpPassword.get(0).sendKeys(password);
        btnSubmit.get(0).click();
    }
    public int returnSizeOfLoginButton(){
        int sizeOfLoginButton=btnSubmit.size();
        return sizeOfLoginButton;
    }
}


