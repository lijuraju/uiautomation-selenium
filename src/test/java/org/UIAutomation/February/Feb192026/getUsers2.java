package org.UIAutomation.February.Feb192026;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class getUsers2 {

    @Test
    public void getUsers2(){

        given().
                when().get("https://petstore.swagger.io/#/pet/findPetsByStatus").
                then().
                assertThat().statusCode(200);
    }
}
