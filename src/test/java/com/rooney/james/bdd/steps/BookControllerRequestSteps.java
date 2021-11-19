package com.rooney.james.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;
import org.springframework.http.HttpStatus;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class BookControllerRequestSteps {
    private RequestSpecification request;
    protected static Response response;

    @When("users want to get a list of all books")
    public void requestToGetAllBooks() throws IOException {
        request = given();
    }

    @Then("the requested data is returned")
    public void returnAllBooks() throws IOException {
        response = request.get("/books");

        Assertions.assertEquals(HttpStatus.OK.value(), response.getStatusCode());
    }
}
