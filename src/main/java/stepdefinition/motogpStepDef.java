package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class motogpStepDef {
    RequestSpecification http_request;
    Response response;

    @Given("^I set get drivers information service api endpoint$")
    public void i_set_get_drivers_information_service_api_endpoint() throws Throwable {

        baseURI = "http://ergast.com/api/f1/drivers.json";
        http_request = RestAssured.given();


    }

    @When("^I send  get http request$")
    public void send_get_http_request() throws Throwable {
        response = http_request.get();
    }

    @When("^I validate  header type$")
    public void i_set_request_header() throws Throwable {
        String Contenttype = response.header("Content-Type");
        System.out.println("Content type --->" + Contenttype);
        Assert.assertEquals("application/json; charset=utf-8", Contenttype);

    }


    @Then("^i receive drivers information and status code as (\\d+)$")
    public void i_receive_drivers_information_and_status_code_as(int arg1) throws Throwable {

        String Jsonbody = response.getBody().asString();
        System.out.println("Drivers info ----->" + Jsonbody);
        int statuscode = response.getStatusCode();
        Assert.assertEquals(arg1, statuscode);

    }
}
