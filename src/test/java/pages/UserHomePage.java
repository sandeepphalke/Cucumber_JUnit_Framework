package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import utils.TestBase;

public class UserHomePage extends TestBase{

	
	@FindBy(xpath = "//span[text()='Export']")
	WebElement exportButton;
	
	@FindBy(xpath = "//span[text()='Create New User']")
	WebElement createNewUserButton;
	
	public UserHomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void validateHomePage() {
		 
		exportButton.isDisplayed();
	}
	
	public void clickNewUserButton() throws InterruptedException {
		
		createNewUserButton.click();
		Thread.sleep(5000);
	}
}
