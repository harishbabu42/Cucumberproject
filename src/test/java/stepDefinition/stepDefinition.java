package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {

	@Given("user is not portal landing page")
	public void user_is_not_portal_landing_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("idi first");
	}

	@When("provided the wrong credentials")
	public void provided_the_wrong_credentials() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("idi second");
	}

	@Then("shows the error message")
	public void shows_the_error_message() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("idi third");
	}

}