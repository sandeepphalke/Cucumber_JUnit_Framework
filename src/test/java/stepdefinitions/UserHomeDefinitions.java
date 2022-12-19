package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.UserHomePage;

public class UserHomeDefinitions {

	UserHomePage uhp = new UserHomePage();
	
	@Then("User is signed in")
	public void user_is_signed_in() {
	    
		uhp.validateHomePage();
	}
	
	@Given("User is on User Home Page")
	public void user_is_on_user_home_page() {
	    
		uhp.validateHomePage();
	}
	
	@When("User click on create new user button")
	public void user_click_on_create_new_user_button() throws InterruptedException {
	    
	    uhp.clickNewUserButton();
	}
}
