Feature: Verify User Information inJson Body

  @ReqresIn1
  Scenario Outline: TC01 Retrieve UserInformation with matchers class

    Given ReqresIn endpoint <id> for retrieving user information
    When Get request is sent to the reqresIn endpoint
    Then The response should contain "<email>" "<firstname>" "<lastname>" user information

    Examples:
      | id | email                    | firstname | lastname |
      | 1  | george.bluth@reqres.in   | George    | Bluth    |
      | 2  | janet.weaver@reqres.in   | Janet     | Weaver   |
      | 3  | emma.wong@reqres.in      | Emma      | Wong     |
      | 4  | eve.holt@reqres.in       | Eve       | Holt     |
      | 5  | charles.morris@reqres.in | Charles   | Morris   |
      | 6  | tracey.ramos@reqres.in   | Tracey    | Ramos    |


  @ReqresIn2
  Scenario Outline: TC02 Retrieve UserInformation with Junit assertions
    Given ReqresIn endpoint <id> for retrieving user information
    When Get request is sent to the reqresIn endpoint
    Then The response should contain "<email>" "<firstname>" "<lastname>" user information Junit

    Examples:
      | id | email                    | firstname | lastname |
      | 1  | george.bluth@reqres.in   | George    | Bluth    |
      | 2  | janet.weaver@reqres.in   | Janet     | Weaver   |
      | 3  | emma.wong@reqres.in      | Emma      | Wong     |
      | 4  | eve.holt@reqres.in       | Eve       | Holt     |
      | 5  | charles.morris@reqres.in | Charles   | Morris   |
      | 6  | tracey.ramos@reqres.in   | Tracey    | Ramos    |



  @ReqresIn3
  Scenario Outline: TC03 Retrieve UserInformation with Junit assertions
    Given ReqresIn endpoint for retrieving user information
    When Get request is sent to the reqresIn endpoint
    Then The response should contain  "<firstname>"

    Examples:
      | firstname |
      | George    |
      | Janet     |
      | Emma      |
      | Eve       |
      | Charles   |
      | Tracey    |


  @ReqresIn4
  Scenario Outline: TC04 Retrieve UserInformation with Junit assertions
    Given ReqresIn endpoint for retrieving user information
    When Get request is sent to the reqresIn endpoint
    Then The response should contain the "<lastname>"

    Examples:
      | lastname |
      | George    |
      | Janet     |
      | Emma      |
      | Eve       |
      | Charles   |
      | Tracey    |