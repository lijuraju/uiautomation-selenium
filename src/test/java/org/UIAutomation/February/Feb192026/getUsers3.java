package org.UIAutomation.February.Feb192026;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class getUsers3 {

    @Test
    public void getUsers3(){

        RestAssured.baseURI ="https://jsonplaceholder.typicode.com";

        given()
                .get("/todos/1")
                .then()
                .assertThat()
                .statusCode(200)
                .body(not(isEmptyString()))
                 .body("userId", equalTo(1))
                .body("title",equalTo("delectus aut autem"));
    }
}
