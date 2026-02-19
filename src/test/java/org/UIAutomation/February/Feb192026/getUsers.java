package org.UIAutomation.February.Feb192026;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class getUsers {

    @Test
    public void getUsers(){

        given().
                baseUri("https://jsonplaceholder.typicode.com").
        when().
                get("/posts/1").
        then().
                assertThat().
                statusCode(200);



    }
}
