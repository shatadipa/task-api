package com.example.wallet.support;

import com.example.wallet.models.EmailChangeRequest;
import com.example.wallet.models.EmailChangeResponse;
import io.restassured.response.Response;

public class ScenarioContext {
    private EmailChangeRequest request;
    private Response rawResponse;
    private EmailChangeResponse response;

    public EmailChangeRequest getRequest() { return request; }
    public void setRequest(EmailChangeRequest request) { this.request = request; }

    public Response getRawResponse() { return rawResponse; }
    public void setRawResponse(Response rawResponse) { this.rawResponse = rawResponse; }

    public EmailChangeResponse getResponse() { return response; }
    public void setResponse(EmailChangeResponse response) { this.response = response; }
}
