

Feature: Negative case
  I want to use this template for my feature file
	@tag
  Scenario: navigate to url and checking the login page
    Given user launching browser
    And navigate to url
   
 @tag2
  Scenario Outline: Enter username and Password
    Given user enter the username "<Username>" and password "<Password>"
    And click login button
    Then verified user login

    Examples: 
      | Username | Password  |
      | Rbnbalan092 | 90439273922 |
      | Rbnbalan0922 | 9043927392 |
      