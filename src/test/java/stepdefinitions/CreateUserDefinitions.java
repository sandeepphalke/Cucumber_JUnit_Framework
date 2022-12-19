package stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateUserPage;

public class CreateUserDefinitions {

	CreateUserPage cup = new CreateUserPage();
	
	@Then("User navigates to create user page")
	public void user_navigates_to_create_user_page() throws InterruptedException {
	    
		Thread.sleep(5000);
	    cup.validateCreateUserPage();
	}

	@Then("User enter {string} in {string}")
	public void user_enter_in(String text, String element) {
	    
	    cup.enterData(text, element);
	}

	@Then("User select role as {string}")
	public void user_select_role_as(String option) {
	    
	    cup.selectRole(option);
	}

	@When("User click on Submit button")
	public void user_click_on_submit_button() throws InterruptedException {
	    
	    cup.clickSubmitButton();
	}

	@Then("User is created successfully")
	public void user_is_created_successfully() {
	    
	    Assert.assertFalse(true);
	}
}
