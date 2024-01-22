package arise.org.pom;

import arise.org.base.BaseTest;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactPage {
    @FindBy (xpath = "//h1[text()='Contact']")                  private List<WebElement> txtContact;
    @FindBy (xpath ="//input[@id='wpforms-161-field_0']")       private List<WebElement> inpFirstname;
    @FindBy(xpath ="//input[@id='wpforms-161-field_0-last']")   private List<WebElement>inpLastName;
    @FindBy (xpath ="//input[@type='email']")                   private List<WebElement>inpEmail;
    @FindBy(xpath = "//textarea[@id='wpforms-161-field_2']")    private List<WebElement>commentTextBox;
    @FindBy(xpath = "//*[@id=\"recaptcha-anchor\"]/div[1]") private List<WebElement>chkOutRobot;
    @FindBy(xpath = "//button[@type='submit']")                 private List<WebElement>btnSubmmit;

    @FindBy(xpath = "//p[text()='Thanks for contacting us! We will be in touch with you shortly.']")
                                                                private List<WebElement>txtContacted;

    public ContactPage(){
        PageFactory.initElements(BaseTest.driver,this);
    }
    public int getSizeOfContactTextElement(){
        int size=txtContact.size();
        return size;
    }

    public void enterCredentialsForContact(String firstname,String lastname,String email,String inputbox) throws InterruptedException {
        inpFirstname.get(0).sendKeys(firstname);
        inpLastName.get(0).sendKeys(lastname);
        inpEmail.get(0).sendKeys(email);
        commentTextBox.get(0).sendKeys(inputbox);

        Actions act=new Actions(BaseTest.driver);
        act.sendKeys(Keys.TAB);
        act.sendKeys(Keys.ENTER);
        act.build().perform();

        Thread.sleep(10000);
       btnSubmmit.get(0).click();
    }

    public int getSizeOfContactedElement(){
       int size= txtContacted.size();
       return size;
    }
}
