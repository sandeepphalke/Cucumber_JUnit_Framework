Feature: Creation of user in SMT application
  We will be using this feature file for create user functionality validations in SMT application mentioning all possible scenarios.

  Background: User login to SMT application
 	 	Given User is on home page
   	When  User is getting correct title of home page
   	Then  User click on login button
   	When  User click on Proceed To Login button in "English"
   	Then  User enter email
   	And   User enter password
   	When  User click on sign in button
   	Then  User is signed in
    
  Scenario: Verify user is able to create new SD Admin role user
   	Given User is on User Home Page
   	When  User click on create new user button
   	Then  User navigates to create user page 
   	And   User enter "test" in "First Name"
   	And   User enter "automation" in "Last Name"
   	And   User enter "testautomation@test.test" in "Email"
   	And   User select role as "SD Admin"
   	When  User click on Submit button 
   	Then  User is created successfully