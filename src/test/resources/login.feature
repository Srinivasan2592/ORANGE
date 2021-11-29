Feature: Positive case
  I want to use this template for my feature file
	
 @tag4
  Scenario: navigate to url and checking the login page
    Given user launching browser
    And navigate to url
    Then login page image verification
  @tag3
  Scenario Outline: Enter username and Password
    Given user enter the username "<Username>" and password "<Password>"
    And click login button
    Then verified user login

    Examples: 
      | Username | Password  |
      | Rbnbalan092 | 9043927392 |