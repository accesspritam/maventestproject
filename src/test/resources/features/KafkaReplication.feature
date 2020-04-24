Feature: To test kafka replication for application
  Scenario: To test kafka replication with invalid payload
    Given application is up and running
    When user hit application with invalid payload
    Then user should receive a response
    And user should receive a response code 400
    And user should receive a response message as invalid

  Scenario: To test kafka replication with valid payload
    Given application is up and running
    When user hit application with valid payload
    Then user should receive a response
    And user should receive a response code 200
    And user should receive a response message as valid