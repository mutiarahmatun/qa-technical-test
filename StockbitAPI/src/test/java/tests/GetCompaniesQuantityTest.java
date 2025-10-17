package tests;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetCompaniesQuantityTest {
    @Test
    public void testCompaniesQuantity() {
        int[] quantities = {20, 5, 1};
        for (int qty : quantities) {
            Response res = RestAssured
                    .given()
                    .get("https://fakerapi.it/api/v1/companies?_quantity=" + qty)
                    .then()
                    .statusCode(200)
                    .extract().response();
            int size = res.jsonPath().getList("data").size();
            Assert.assertEquals(size, qty, "Expected " + qty + " but got " + size);
        }
    }
}