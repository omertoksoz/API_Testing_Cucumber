package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReqresInUsers {

    private String reqresInUrl;
    private Response response;

    private JsonPath responseJsonPath;

    @Given("ReqresIn endpoint {int} for retrieving user information")
    public void reqres_in_endpoint_for_retrieving_user_information(Integer id) {

        reqresInUrl ="https://reqres.in/api/users/"+id;

    }
    @When("Get request is sent to the reqresIn endpoint")
    public void get_request_is_sent_to_the_reqres_in_endpoint() {

        response=given().when().get(reqresInUrl);

    }

    //We will use Matchers to assert
    @Then("The response should contain {string} {string} {string} user information")
    public void the_response_should_contain_user_information(String email, String first_name, String last_name) {

        response
                .then()
                .statusCode(200)
                .body("data.email", equalTo(email),
                        "data.first_name",equalTo(first_name),
                        "data.last_name",equalTo(last_name));
    }


    @Then("The response should contain {string} {string} {string} user information Junit")
    public void the_response_should_contain_user_information_junit(String email, String first_name, String last_name) {

        responseJsonPath=response.jsonPath();

        assertEquals(email,responseJsonPath.getString("data.email"));
        assertEquals(first_name,responseJsonPath.getString("data.first_name"));
        assertEquals(last_name,responseJsonPath.getString("data.last_name"));

    }


    @Given("ReqresIn endpoint for retrieving user information")
    public void reqres_in_endpoint_for_retrieving_user_information() {

        reqresInUrl ="https://reqres.in/api/users";
    }
    @Then("The response should contain the {string}")
    public void the_response_should_contain_the(String name) {

        responseJsonPath = response.jsonPath();

        assertTrue(responseJsonPath.getList("data.last_name").contains(name));

    }

    @Then("The response should contain  {string}")
    public void the_response_should_contain(String name) {

        responseJsonPath = response.jsonPath();

        assertTrue(responseJsonPath.getList("data.first_name").contains(name));

    }



}
