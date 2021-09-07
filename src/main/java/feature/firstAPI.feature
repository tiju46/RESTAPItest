Feature: MotoGP Drivers
  Scenario: Check MotoGP Drivers Details
    Given I set get drivers information service api endpoint
    When I send  get http request
    And I validate  header type
    Then i receive drivers information and status code as 200

