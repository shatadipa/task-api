package com.example.wallet.support;

import com.example.wallet.models.EmailChangeRequest;
import com.example.wallet.models.EmailChangeResponse;
import io.restassured.response.Response;

/**
 * Acts as a shared state holder for a single scenario.
 * This stores Request object, Raw HTTP response and Parsed response model
 *
 * Cucumber steps run in separate methods so this allows data to be passed clearly between Given, When and Then
 */
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
