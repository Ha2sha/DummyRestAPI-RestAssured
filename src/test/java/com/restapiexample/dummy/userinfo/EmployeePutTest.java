package com.restapiexample.dummy.userinfo;

import com.restapiexample.dummy.model.EmployeePojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class EmployeePutTest extends TestBase {
    @Test
    public void updateEmployeeWithPut(){
        EmployeePojo employeePojo =new EmployeePojo();
        employeePojo.setName("Swara");
        employeePojo.setSalary("55000");
        employeePojo.setAge("28");

        Response response=given()
                .header("Content-Type", "application/json")
                .pathParam("id", 471)
                .body(employeePojo)
                .when()
                .put("/update/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }

}
