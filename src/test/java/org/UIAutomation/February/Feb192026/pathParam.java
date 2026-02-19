package org.UIAutomation.February.Feb192026;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class pathParam {

    @Test
    public void pathParam(){

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

     Response responsee=given()
                .pathParam("id",2)
        .when()
                .get("/posts/{id}")
                .then()
                .extract()
                .response();
        System.out.println(responsee.body().asString());

    }
}
