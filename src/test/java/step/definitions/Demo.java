import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import sun.security.mscapi.CPublicKey;

import java.net.URI;
import java.net.URISyntaxException;

public class Demo {

    private Scenario scenario;
    private Response response;

    private final String BASE_URL = "https://restful-booker.herokuapp.com";

    //@Before
    // public void before(Scenario scenariocval) {
    //   this.scenario = scenariocval;
    // }

    @Given("Get call to {string}")

    public void getCallTo(String basePath) throws URISyntaxException {
        RestAssured.baseURI = BASE_URL;
        RequestSpecification requestSpecification = RestAssured.given();
        response = requestSpecification.when().get(new URI(basePath));
    }

    @Then("Response Code {string} is verified")

    public void responseCodeIsVerified(String responseCode) {


        response.then().log().all().statusCode(Integer.parseInt(responseCode));
        System.out.println(response.prettyPrint());


    }

    @Given("Get call to {string}")
    public void get_call_to(String basePath) {
        // Write code here that turns the phrase above into concrete actions
        // Implement the logic to make a GET call using the provided string (URL)
        throw new io.cucumber.java.PendingException();
    }

    @Then("Response code {string} is verified")
    public void response_code_is_verified(String string) {
        // Write code here that turns the phrase above into concrete actions
        // Implement the logic to verify the response code
        throw new io.cucumber.java.PendingException();
    }


}