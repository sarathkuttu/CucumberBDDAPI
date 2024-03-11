import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.net.URI;
import java.net.URISyntaxException;

public class GetStepDefinitions {

    private Response response;

    private final String BASE_URL = "https://restful-booker.herokuapp.com";

    @Given("Get call to {string}")
    public void get_call_to(String string) {
        // Implement code to make the GET call
        // For example: RestAssured.get(string);
    }

    @Then("Response code {string} is verified")
    public void response_code_is_verified(String string) {
        // Implement code to verify the response code
        // For example: response.then().statusCode(Integer.parseInt(string));
    }
}

