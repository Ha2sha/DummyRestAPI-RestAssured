package com.restapiexample.dummy.userinfo;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class EmployeeGetTest extends TestBase {

    @Test
    public void getAllUsersInfo() {
        Response response = given()
                .when()
                .get("/employees");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getSingleEmployeeInfo() {
        Response response = given()
                .pathParam("id", 7)
                .when()
                .get("/employee/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }


}
