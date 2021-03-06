package com.restapiexample.dummy.userinfo;

import com.restapiexample.dummy.model.EmployeePojo;
import com.restapiexample.dummy.testbase.TestBase;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class EmployeePostTest extends TestBase {

    @Test
    public void createEmployee() {

        EmployeePojo employeePojo =new EmployeePojo();
        employeePojo.setName("Hina");
        employeePojo.setSalary("65000");
        employeePojo.setAge("22");


        Response response=given()
                .header("Content-Type", "application/json")
                .body(employeePojo)
                .when()
                .post("/create");
        response.then().statusCode(200);
        response.prettyPrint();
//471

    }
}
