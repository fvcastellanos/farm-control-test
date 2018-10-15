Feature: Sensor readings
  In order to evaluate sensor readings
  I need to be able to see historical data
  in dashboard page

  Scenario: Dashboard
    Given I have historical sensor reading data
    When I navigate into the Dashboard
    Then I should be able to see historical reading table