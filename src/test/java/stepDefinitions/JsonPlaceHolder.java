package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utils.ConfigurationReader;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class JsonPlaceHolder {


String jsonPlaceHolderUrl;
Response response;

JsonPath responseJsonPath;

    @Given("JsonPlaceHolder endpoint {int} for retrieving user information")
    public void json_place_holder_endpoint_for_retrieving_user_information(Integer id) {

        jsonPlaceHolderUrl = ConfigurationReader.getProperty("jsonPLaceHolderUrl")+"/posts/"+id;
    }

    @When("Get request is sent to the JsonPlaceHolder end point")
    public void get_request_is_sent_to_the_json_place_holder_end_point() {
      response =given().when().get(jsonPlaceHolderUrl);
    }

    @Then("JsonPlaceHolder response status code is {int}")
    public void json_place_holder_response_status_code_is(Integer statusCode) {  // statusCode is 200 coming from feature file

        assertEquals(statusCode,(Integer) response.statusCode());

    }
    @Then("JsonPlaceHolder content type is {string}")
    public void json_place_holder_content_type_is(String contentType) {

        assertEquals(contentType,response.contentType());

    }
    @Then("JsonPlaceHolder response body {string} value is {int}")
    public void json_place_holder_response_body_value_is(String attribute, Integer expectedValue) {

    responseJsonPath=response.jsonPath();

    assertEquals(expectedValue,(Integer) responseJsonPath.getInt(attribute));

    }
    @Then("JsonPlaceHolder response body {string} value is {string}")
    public void json_place_holder_response_body_value_is(String attribute, String expectedValue) {

        responseJsonPath=response.jsonPath();
        assertEquals(expectedValue,responseJsonPath.getString(attribute));



    }



}
