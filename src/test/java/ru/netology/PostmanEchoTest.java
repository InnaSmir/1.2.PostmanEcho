package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    void shouldPostTestRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain")
                .body("Test request")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Тест"))
        ;
    }
}
