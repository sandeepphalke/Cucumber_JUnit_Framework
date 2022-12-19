package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignInPage;
import utils.TestBase;

public class SignInDefinitions extends TestBase{
	
	SignInPage sp = new SignInPage();
	
	@Given("User is on sign in page")
	public void user_is_on_sign_in_page() {
	    
		sp.validateSignInPage();
	}
	
	@Then("User enter email")
	public void user_enter_email() {
	    
		sp.enterEmail();
	}
	
	@Then("User enter password")
	public void user_enter_password() {
	    
		sp.enterPassword();
	}
	
	@When("User click on sign in button")
	public void user_click_on_sign_in_button() throws InterruptedException {
	    
		sp.clickSignInButton();
		Thread.sleep(10000);
	}
	

	@Then("{string} button is displayed")
	public void button_is_displayed(String string) {
	    
	    sp.signInButtonIsDisplayed();
	}
	
	@Given("User enter {string} email")
	public void user_enter_email(String email) {
	   
		sp.enterEmail(email);
	}
	
	@Given("User enter {string} password")
	public void user_enter_password(String password) {
	   
		sp.enterPassword(password);
	}


}
