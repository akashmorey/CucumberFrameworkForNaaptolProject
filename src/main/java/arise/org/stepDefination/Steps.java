package arise.org.stepDefination;

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
        Assert.assertNotEquals(size,0);
        System.out.println("User Should Navigates to login page");

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
        Assert.assertNotEquals(size,0);
        System.out.println("User Should navigates to logout page");
    }

    @When("user should be enter In_valid username and valid password")
    public void user_should_be_enter_invalid_username_and_valid_password(DataTable dataTable) throws Exception {
       LoginPage lp=new LoginPage();

       int size=lp.returnSizeOfLoginButton();
       Assert.assertNotEquals(size,0);
        System.out.println("User should navigates to login page");

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
        Assert.assertEquals(size,0,"Test Pass :- User Should get An Error Massage");
        System.out.println("User Should get An Error Massage");
    }


    @When("user should be enter valid username and in_valid password")
    public void user_should_be_enter_valid_username_and_inValid_password(DataTable dataTable) throws Exception {
        LoginPage lp=new LoginPage();
        int size=lp.returnSizeOfLoginButton();
        Assert.assertNotEquals(size,0);
        System.out.println("user should be navigates to Login page");
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
        Assert.assertNotEquals(size,0);
        System.out.println("user should be navigates to Login page");

        String un=dataTable.asMaps().get(0).get("username");
        String pass=dataTable.asMaps().get(0).get("password");
        System.out.println("user should be enter in_valid username and in_valid password");
        lp.enterUserNameAndPassword(un,pass);
        Thread.sleep(2000);
    }

    @When("user should be enter in_valid email and in_valid password")
    public void user_should_be_enter_in_valid_email_and_in_valid_password() {
        System.out.println("enter email and password");
    }
    @Then("verify the account status")
    public void verify_the_account_status() {
        System.out.println("Registered");
    }
}
