Feature: Login to SMT application
  We will be using this feature file for Login functionality validations in SMT application mentioning all possible scenarios.

  Background: User navigate to sign in page of SMT application
 	  Given User is on home page
    Then  User is getting correct title of home page
    And   User click on login button
    And   User click on Proceed To Login button in "English"
 		
  Scenario: Login to the application with valid credentials
    Given  User is on sign in page
    And    User enter email
    And    User enter password
    When   User click on sign in button
    Then   User is signed in
    
   Scenario: Login to the application with invalid credentials
    Given  User is on sign in page
    And    User enter "sandeep@e-zest.in" email
    And    User enter "Test@123" password
    When   User click on sign in button
    Then   User is signed in