package com.restapiexample.dummy.userinfo;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class EmployeeDeleteTest extends TestBase {

    @Test
    public void deleteEmployee(){
        Response response = given()
                .pathParam("id", 4)
                .when()
                .delete("/delete/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
