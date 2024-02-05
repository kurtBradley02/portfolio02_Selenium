Feature: Login Module

  @tag1
  Scenario Outline: Login Success with parameters
    Given User is logging in Demo Login
    When User inputs username "<username>" and password "<password>"
    Then Assert on login successful

	@tag2
	Scenario Outline: Login Wrong Password with parameters
		Given User is logging in Demo Login
    When User inputs username "<username>" and wrong password "<password>"
    Then Assert on wrong password
    
    
  @tag3
	Scenario Outline: Login Wrong Username with parameters
		Given User is logging in Demo Login
    When User inputs wrong username "<username>" and password "<password>"
    Then Assert on user not registered
