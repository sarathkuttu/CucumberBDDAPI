package step.definitions;

import Modules.PayloadManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;

public class PostStepDefinitions {

    private final String BASE_URL = "https://restful-booker.herokuapp.com";
    private PayloadManager payloadManager;

    private Response response;

    @Given("Get Payload from a \\{string} and make a call")

    public void get_payload_from_and_make_a_call(String basePath) {

        payloadManager = new PayloadManager();

        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri(BASE_URL);
        requestSpecification.basePath(basePath);
        requestSpecification.contentType(ContentType.JSON);
        response = requestSpecification.body(payloadManager.createPayload()).post();


    }

    @Then("Verify response message {string}")
    public void verifyResponseMessage(String responseCode) {

        ValidatableResponse validatableResponse = response.then().log().all();
        validatableResponse.statusCode(Integer.parseInt(responseCode));
        validatableResponse.body("token", Matchers.notNullValue());
        validatableResponse.body("token.length()", Matchers.is(15));

    }
}