package arise.org.pom;

import arise.org.base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

//import static arise.org.base.BaseTest.

public class HomePage {
    @FindBy(xpath = "//a[text()='Practice']") private List<WebElement> btnPractice;
    @FindBy (xpath = "//a[text()='Test Login Page']") private  List<WebElement> btnLoginPage;

    public HomePage()
    {
        PageFactory.initElements(BaseTest.driver,this);
    }
    public void clickOnloginOrRegisterBtn(){
        btnPractice.get(0).click();
        btnLoginPage.get(0).click();
    }
}
