package com.example.wallet.steps;

import com.example.wallet.models.EmailChangeRequest;
import com.example.wallet.models.EmailChangeResponse;
import com.example.wallet.models.JBody;
import com.example.wallet.models.JHeader;
import com.example.wallet.support.ApiClient;
import com.example.wallet.support.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

/**
 * STEP DEFINITIONS
 * Acts as the glue between Gherkin steps and Java code.
 * Translates human-readable steps into executable actions.
 */
public class EmailChangeSteps {

    private final ScenarioContext ctx = new ScenarioContext();
    private final ApiClient api = new ApiClient();

    @Given("I have a valid request for email change")
    public void i_have_a_valid_request_for_email_change() {
        JHeader header = new JHeader();
        header.setIp("10.0.2.15");
        header.setVersion("1.0.0");
        header.setChannel("MOBILE");
        header.setRequestType("updateprofile");
        header.setImeiNo("5iuv8iuhr1K3WyFrkVbK8ChhRK37uonmr0+q+OSQgL");
        header.setSerialNo("12345678");
        header.setDeviceType("sdk_gphone64_arm64");
        header.setOsType("android");
        header.setMacAddress("test");
        header.setUserId("2438012345678");

        JBody jBody = new JBody();
        jBody.setEmailId("srikanth@cevasoftware.com");
        jBody.setIsoCountryCode("234");

        EmailChangeRequest req = new EmailChangeRequest();
        req.setJheader(header);
        req.setJbody(jBody);

        ctx.setRequest(req);
    }

    @When("I call the request email change API")
    public void i_call_the_request_email_change_api() {
        var raw = api.requestEmailChange(ctx.getRequest());
        ctx.setRawResponse(raw);

        EmailChangeResponse parsed = raw.as(EmailChangeResponse.class);
        ctx.setResponse(parsed);
    }

    @Then("the response code should be {string}")
    public void the_response_code_should_be(String expectedCode) {
        Assert.assertNotNull(ctx.getResponse(), "Response object was null");
        Assert.assertEquals(ctx.getResponse().getResponseCode(), expectedCode);
    }

    @Then("the response description should be {string}")
    public void the_response_description_should_be(String expectedDescription) {
        Assert.assertEquals(ctx.getResponse().getResponseDescription(), expectedDescription);
    }
}
