package org.UIAutomation.February.Feb192026;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class getUsers5 {

    @Test
    public void getUsers(){

        RestAssured.baseURI = "https://reqres.in";

  given()
                .queryParam("page",2)
          .header("x-api-key","YOUR_API_KEY")
                .when()
                .get("/api/users")
                .then()
                .assertThat()
                .statusCode(200);


    }
}
