package arise.org.stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
    @Given("launch the browser and navigates to login page")
    public void launch_the_browser_and_navigates_to_login_page() {
        System.out.println("step1");
    }
    @When("user should be enter valid username and valid password")
    public void user_should_be_enter_valid_username_and_valid_password() {
        System.out.println("step2");
    }
    @Then("user should be navigates to homepage")
    public void user_should_be_navigates_to_homepage() {
        System.out.println("step3");
    }
}
