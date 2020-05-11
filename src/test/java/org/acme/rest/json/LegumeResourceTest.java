package org.acme.rest.json;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThan;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class LegumeResourceTest {

    @Test
    public void testList() {
        given()
          .when().get("/legumes")
          .then()
             .statusCode(200)
             .body("$.size()", greaterThan(3));
    }
}
