package arise.org.stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
    @Given("launch the browser and navigates to login page")
    public void launch_the_browser_and_navigates_to_login_page() {
        System.out.println("launch browser and navigates to login page");
    }
    @When("user should be enter valid username and valid password")
    public void user_should_be_enter_valid_username_and_valid_password() {
        System.out.println("user should be enter valid username and password");
    }
    @Then("user should be navigates to homepage")
    public void user_should_be_navigates_to_homepage() {
        System.out.println("user should be navigates to home page");
    }

    @When("user should be enter In_valid username and valid password")
    public void user_should_be_enter_in_valid_username_and_valid_password() {
        System.out.println("user should be enter in_valid username and valid password");
    }
    @Then("user should be get error massage")
    public void user_should_be_get_error_massage() {
        System.out.println("user should be get functionality related massage");
    }

    @When("user should be enter valid username and in_valid password")
    public void user_should_be_enter_valid_username_and_in_valid_password() {
        System.out.println("user should be enter valid username and in_valid password");
    }

    @When("user should be enter in_valid username and in_valid password")
    public void user_should_be_enter_in_valid_username_and_in_valid_password() {
        System.out.println("user should be enter in_valid username and in_valid password");
    }




}
