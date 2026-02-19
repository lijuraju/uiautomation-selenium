package org.UIAutomation.February.Feb192026;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;

public class getUsers4 {

    @Test
    public void getUsers4(){

       Response response = given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts")
                .then()
                .extract()
                .response();

       assertThat(response.jsonPath().getList("title"),hasItems("qui est esse","eum et est occaecati"));
       assertThat(response.jsonPath().getList(""),hasSize(100));
    }
}
