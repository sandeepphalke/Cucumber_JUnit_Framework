Feature: Language change in SMT application
  We will be using this feature file for Language change functionality validations in SMT application mentioning all possible scenarios.

  Background: User open SMT application
 	  Given User is on home page
 	  Then  User is getting correct title of home page
    
  Scenario: Change language from English to French
    When    User select "French" from language dropdown
    Then    "Accueilly" is displayed on the home page
    
   Scenario: Change language from French to French
    When    User select "French" from language dropdown
    Then    "Accueil" is displayed on the home page
    When    User select "French" from language dropdown
    Then    "Accueil" is displayed on the home page
    
   Scenario: Change language from French to English
    When    User select "French" from language dropdown
    Then    "Accueil" is displayed on the home page
    When    User select "English" from language dropdown
    Then    "Home" is displayed on the home page
    
   Scenario: Change language from English to French and verify sign in Page in french
    When    User select "French" from language dropdown
    Then    "Accueil" is displayed on the home page
    And     User click on login button
    When    User click on Proceed To Login button in "French"
    Then    "Sign in" button is displayed