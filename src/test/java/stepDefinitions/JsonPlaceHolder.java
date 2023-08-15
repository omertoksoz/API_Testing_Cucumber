package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.ConfigurationReader;

public class JsonPlaceHolder {


// Breal till 8:15

    @Given("JsonPlaceHolder endpoint {int} for retrieving user information")
    public void json_place_holder_endpoint_for_retrieving_user_information(Integer id) {

        String jsonPlaceHolderUrl = ConfigurationReader.getProperty("jsonPLaceHolderUrl")+"/posts/"+id;
    }

    @When("Get request is sent to the JsonPlaceHolder end point")
    public void get_request_is_sent_to_the_json_place_holder_end_point() {

    }
    @Then("JsonPlaceHolder response status code is {int}")
    public void json_place_holder_response_status_code_is(Integer int1) {

    }
    @Then("JsonPlaceHolder content type is {string}")
    public void json_place_holder_content_type_is(String string) {

    }
    @Then("JsonPlaceHolder response body {string} value is {int}")
    public void json_place_holder_response_body_value_is(String string, Integer int1) {

    }
    @Then("JsonPlaceHolder response body {string} value is {string}")
    public void json_place_holder_response_body_value_is(String string, String string2) {

    }



}
