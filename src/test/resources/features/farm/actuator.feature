Feature: Sensor manual activation
  In order to evaluate sensor activation
  I need to be able to perform a manual read
  of the sensors and register it.

  Scenario: Read temperature
    Given I want to get temperature value
    When I go to manual activation page
      And I press read temperature button
    Then I got the temperature reading

  Scenario: Read humidity
    Given I want to get humidity value
    When I go to manual activation page again
      And I press read humidity button
    Then I got the humidity reading

  Scenario:
    Given I want to activate water pump
    When I navigate to activation page
      And I press send command button
    Then Actuator is operated remotely

