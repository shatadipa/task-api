package com.example.wallet.support;

import com.example.wallet.models.EmailChangeRequest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ApiClient {

    public Response requestEmailChange(EmailChangeRequest body) {
        return RestAssured
                .given()
                .baseUri(TestConfig.baseUrl())
                .basePath(TestConfig.emailChangePath())
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(body)
                .log().all()
                .when()
                .post()
                .then()
                .log().all()
                .extract()
                .response();
    }
}
