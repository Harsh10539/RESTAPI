package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Main {
    public static void main(String[] args) {
        RestAssured.baseURI="https://reqres.in/";
        Response response=RestAssured.given().get("/api/users/2");
        System.out.println(response.getBody().asString());
        String firstName=response.path("data.first_name");
        System.out.println(firstName);
    }
}