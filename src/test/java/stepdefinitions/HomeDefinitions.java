package stepdefinitions;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.TestBase;

public class HomeDefinitions extends TestBase{
	
	HomePage hp = new HomePage();
	
	@Given("User is on home page")
	public void user_is_on_home_page() throws IOException, InterruptedException {
	   
		hp.validateHomePage();
	}
	
	@When("User is getting correct title of home page")
	public void user_is_getting_correct_title_of_home_page() {
	    
		driver.getTitle().equals("SMT");
	}
	
	@When("User select {string} from language dropdown")
	public void user_select_from_language_dropdown(String language) throws InterruptedException {
	    
		hp.changeLanguage(language);
	}

	@Then("{string} is displayed on the home page")
	public void is_displayed_on_the_home_page(String homeText) {
	    
	    hp.isCorrectHomePageTextExist(homeText);
	}
	
	@Then("User click on login button")
	public void user_click_on_login_button() throws InterruptedException {
	    
		hp.clickLoginButton();
	}
	
	@When("User click on Proceed To Login button in {string}")
	public void user_click_on_proceed_to_login_button_in(String language) throws InterruptedException {
	    
		hp.clickProceedToLoginButton(language);
		Thread.sleep(5000);
	}

}
