package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepage {
	public Homepage() {
		// TODO Auto-generated constructor stub
	}

	@Given("user is on Netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user is on Netbanking landing page");
	}

	@When("user login into application with username and password")
	public void user_login_into_application_with_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user login into application with username and password");
	}

	@Then("Homepage is populated")
	public void homepage_is_populated() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Homepage is populated");
	}

	@Then("cards are displayed")
	public void cards_are_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("cards are displayed");
	}

}
