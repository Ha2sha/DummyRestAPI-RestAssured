package com.restapiexample.dummy.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase {

    @BeforeClass
    public static void inIt() {
        //set environment
        RestAssured.baseURI="https://dummy.restapiexample.com/";//test environment
        RestAssured.basePath="/api/v1";

    }
}
