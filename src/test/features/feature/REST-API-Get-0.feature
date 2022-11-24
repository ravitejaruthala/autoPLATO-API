Feature: REST-API-Get - Workflow

  Scenario: Load initial set of data
    Given provided all the feature level parameters from file

  @Get @ep
  Scenario: List Users - api call
    Given a user perform a api action
    And add request with given query params
      | page | 2 |
    And add request with given header params
      | contentType | application/json |
    When a user get application/json in /api/users resource on ep
    Then the status code is 200
    And verify across response includes following in the response
      | total | 12 |
