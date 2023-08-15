Feature: GET JsonPlaceHolder verify response body

  Scenario: Get endpoint 44 and verify response body

    Given JsonPlaceHolder endpoint 44 for retrieving user information
    When Get request is sent to the JsonPlaceHolder end point
    Then JsonPlaceHolder response status code is 200
    Then JsonPlaceHolder content type is "application/json; charset=utf-8"
    Then JsonPlaceHolder response body "userId" value is 5
    And JsonPlaceHolder response body "title" value is "optio dolor molestias sit"



