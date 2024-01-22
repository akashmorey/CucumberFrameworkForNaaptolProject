package arise.org.stepDefination;

import arise.org.pom.ContactPage;
import arise.org.pom.HomePage;
import arise.org.pom.LogOutPage;
import arise.org.pom.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Steps {
    @Given("launch the browser and navigates to login page")
    public void launch_the_browser_and_navigates_to_login_page() {
        System.out.println("Browser is launching");
        new HomePage().clickOnloginOrRegisterBtn();
        System.out.println("clicking on login button");

    }
    @When("user should be enter valid username and valid password")
    public void enterValidCredentials(DataTable dataTable) throws Exception {
        LoginPage lp=new LoginPage();

        int size=lp.returnSizeOfLoginButton();
        if(size>0){
            System.out.println("user should be navigates to Login page");
        }
        else {
            System.out.println("user can't navigates to Login page");
        }


        String un=dataTable.asMaps().get(0).get("username");
        String pass= dataTable.asMaps().get(0).get("password");
        System.out.println("user should be enter valid username and valid password");
        lp.enterUserNameAndPassword(un,pass);
        Thread.sleep(2000);

    }
    @Then("user should be navigates to homepage")
    public void user_should_be_navigates_to_homepage() throws Exception {
        LogOutPage lop=new LogOutPage();
        int size=lop.returnSizeOfLogoutButton();

        if(size>0){
            System.out.println("user should be navigates to on LogOut-page");
        }
        else {
            System.out.println("user can't navigates to on LogOut-page");
        }
    }

    @When("user should be enter In_valid username and valid password")
    public void user_should_be_enter_invalid_username_and_valid_password(DataTable dataTable) throws Exception {
       LoginPage lp=new LoginPage();

       int size=lp.returnSizeOfLoginButton();
        if(size>0){
            System.out.println("user should be navigates to Login page");
        }
        else {
            System.out.println("user can't navigates to Login page");
        }

        String un = dataTable.asMaps().get(0).get("username");
        String pass=dataTable.asMaps().get(0).get("password");
        System.out.println("user should be enter in-valid username and valid password");
        lp.enterUserNameAndPassword(un,pass);
        Thread.sleep(2000);

    }
    @Then("user should be get error massage")
    public void user_should_be_get_error_massage() throws Exception {
        LogOutPage lop=new LogOutPage();
        int size=lop.returnSizeOfLogoutButton();
        if(size>0){
            System.out.println("user navigates to on LogOut-page");
        }
        else {
            System.out.println("user get an error massage");
        }
    }


    @When("user should be enter valid username and in_valid password")
    public void user_should_be_enter_valid_username_and_inValid_password(DataTable dataTable) throws Exception {
        LoginPage lp=new LoginPage();
        int size=lp.returnSizeOfLoginButton();
        if (size>0){
            System.out.println("user should be navigates to Login page");
        }
        else {
            System.out.println("user can't navigates to Login page");
        }

        String un=dataTable.asMaps().get(0).get("username");
        String pass=dataTable.asMaps().get(0).get("password");
        System.out.println("user should be enter valid username and in_valid password");
        lp.enterUserNameAndPassword(un,pass);
        Thread.sleep(2000);
    }

    @When("user should be enter in_valid username and in_valid password")
    public void user_should_be_enter_in_valid_username_and_in_valid_password(DataTable dataTable) throws Exception {
        LoginPage lp=new LoginPage();

        int size=lp.returnSizeOfLoginButton();
        if (size>0){
            System.out.println("user should be navigates to Login page");
        }
        else {
            System.out.println("user can't navigates to Login page");
        }
//        Assert.assertNotEquals(size,0);
//        System.out.println("user should be navigates to Login page");


        String un=dataTable.asMaps().get(0).get("username");
        String pass=dataTable.asMaps().get(0).get("password");
        System.out.println("user should be enter in_valid username and in_valid password");
        lp.enterUserNameAndPassword(un,pass);
        Thread.sleep(2000);
    }





    @Given("launch the browser and navigates to contact page")
    public void launch_the_browser_and_navigates_to_contact_page() {
        new HomePage().clickOnContactBtn();
    }

    @When("user should be enter valid inputs fot contact")
    public void user_should_be_enter_valid_inputs_fot_contact(DataTable dataTable) {
        ContactPage cp=new ContactPage();

        int size= cp.getSizeOfContactTextElement();
        if (size>0){
            System.out.println("user is navigate to the contact page");
        }
        else {
            System.out.println("user can't navigated to contact page");
        }

        String fn=dataTable.asMaps().get(0).get("firstname");
        String ln=dataTable.asMaps().get(0).get("lastname");
        String email=dataTable.asMaps().get(0).get("email");
        String inptxt=dataTable.asMaps().get(0).get("inputtxt");
        cp.enterCredentialsForContact(fn,ln,email,inptxt);
    }

    @Then("verify the status of contact")
    public void verify_the_status_of_contact() throws InterruptedException {
        int size=new ContactPage().getSizeOfContactedElement();
        if (size>0){
            System.out.println("Thanks for contacting us! We will be in touch with you shortly");
        }
        else {
            System.out.println("user get an error massage (user can't be contacted)");
        }
    }

}
