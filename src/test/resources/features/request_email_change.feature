Feature: Request Email Change API

  Scenario: Customer not found for the given userId
    Given I have a valid request for email change
    When I call the request email change API
    Then the response code should be "98"
    And the response description should be "Customer not found for the given userId"
