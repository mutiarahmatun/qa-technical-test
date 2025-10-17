package tests;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class ValidateCompanySchemaTest {

    @Test
    public void validateSchemaAndIdNotNull() {
        Response res = RestAssured.get("https://fakerapi.it/api/v1/companies");

        // Check HTTP 200 OK
        res.then().statusCode(200);

        // Check that each 'id' in the response is not null
        for (Object id : res.jsonPath().getList("data.id")) {
            Assert.assertNotNull(id, "Found null ID in response data!");
        }

        // Validate JSON Schema
        assertThat(res.getBody().asString(),
                JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/company_schema.json"));
    }
}
