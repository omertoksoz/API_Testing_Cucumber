Feature: GET JsonPlaceHolder verify response body

  Scenario: Get endpoint 44 and verify response body

    Given JsonPlaceHolder endpoint 70 for retrieving user information
    When Get request is sent to the JsonPlaceHolder end point
    Then JsonPlaceHolder response status code is 200
    Then JsonPlaceHolder content type is "application/json; charset=utf-8"
    Then JsonPlaceHolder response body "userId" value is 7
    And JsonPlaceHolder response body "title" value is "voluptatem laborum magni"

    @putApi
Scenario: Put endpoint 70 and verify response body

  Given  JsonPlaceHolder endpoint 70 for retrieving user information
  When Put request is sent to the JsonPlaceHolder endpoint
  Then JsonPlaceHolder response status code is 200
  Then JsonPlaceHolder response body tile is "Magic Music Man"
  Then JsonPlaceHolder response body body is "Ulker"


