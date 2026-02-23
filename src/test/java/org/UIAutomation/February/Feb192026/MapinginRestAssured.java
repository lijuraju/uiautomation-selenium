package org.UIAutomation.February.Feb192026;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class MapinginRestAssured {


    @Test
    public void headers(){

        RestAssured.baseURI = "https://reqres.in/api";

        Map headers = new HashMap();
        headers.put("Content-Type", "application/json");
        headers.put("Authorization","Bearer <your_token_here>");


        given()
                .headers(headers)
                .queryParam("page",2)
                .when()
                .get("/users")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200);
        System.out.println("Multiple headers in Map");

    }
}
