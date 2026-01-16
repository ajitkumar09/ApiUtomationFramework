package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class LoginApiTest2 {

    @Test(description = "verify if login api is working")
    public void loginTest() {

        Response response = given()
                .baseUri("http://64.227.160.186:8080")
                .header("Content-type", "application/json")
                .body("{\"username\":\"uday123\",\"password\":\"uday1234\"}")
                .post("/api/auth/login");

        System.out.println(response.asPrettyString());
        
       Assert.assertEquals(response.getStatusCode(), 200);
    }
}
