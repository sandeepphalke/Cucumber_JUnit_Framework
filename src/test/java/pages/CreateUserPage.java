package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.TestBase;

public class CreateUserPage extends TestBase{

	@FindBy(xpath = "//span[contains(text(),'+')]//parent::button")
	WebElement addRoleButton;
	
	@FindBy(xpath = "//input[@name='firstName']")
	WebElement firstNameInput;
	
	@FindBy(xpath = "//input[@name='lastName']")
	WebElement lastNameInput;
	
	@FindBy(xpath = "//input[@name='userEmail']")
	WebElement userEmailInput;
	
	@FindBy(xpath = "//div[@id='userRegion[0].role']")
	WebElement roleDropdown;
	
	@FindBy(xpath = "//ul[@role='listbox']//li[2]")
	WebElement roleSDAdminOption;
	
	@FindBy(xpath = "//span[text()='Submit']//parent::button")
	WebElement submitButton;
	
	public CreateUserPage() {
		
		PageFactory.initElements(driver, this);
	}

	public void enterData(String text, String element) {
		WebElement we = null;
		
		if(element.equals("First Name")) {
			
			we = firstNameInput;
		}
		else if(element.equals("Last Name")){
			
			we = lastNameInput;
		}
		else if(element.equals("Email")){
			
			we = userEmailInput;
		}
			
			we.sendKeys(text);
	}
	
	public void validateCreateUserPage() {
		
		addRoleButton.isDisplayed();
	}
	
	public void selectRole(String option) {
		
		roleDropdown.click();
		if(option.equals("SD Admin")) {
			
			roleSDAdminOption.click();
		}
		else if(option.equals("Country Admin")) {
			
			roleSDAdminOption.click();
		}
	}
	
	public void clickSubmitButton() throws InterruptedException {
		
		submitButton.click();
		Thread.sleep(20000);
	}
}
