Feature: Testing the Book REST API
  Users should be able to submit GET requests to the Book API

  Scenario: Data retrieval from a web service
    When users want to get a list of all books
    Then the requested data is returned