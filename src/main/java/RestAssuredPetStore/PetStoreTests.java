package RestAssuredPetStore;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PetStoreTests {

    @BeforeClass
    public void setUp() {
        // Base URL of the Pet Store API
        baseURI = "https://petstore.swagger.io";
        basePath = "/v2";
    }

    @Test
    public void testCreatePet() {
        // Define the request body JSON string
        String requestBody = "{\"id\":12345,\"category\":{\"id\":1,\"name\":\"dog\"},\"name\":\"snoopie\",\"photoUrls\":[\"string\"],\"tags\":[{\"id\":0,\"name\":\"string\"}],\"status\":\"pending\"}";


        // Create a pet using POST request with the stored request body
        given()
                .contentType("application/json")
                .body(requestBody)
                .when()
                .post("/pet")
                .then()
                .statusCode(200);
    }

    @Test(dependsOnMethods = {"testCreatePet"})
    public void testRetrievePet() {
        // Retrieve the pet using GET request and validate the response
        given()
                .pathParam("petId", 12345)
                .when()
                .get("/pet/{petId}")
                .then()
                .statusCode(200)
                .contentType("application/json")
                .body("category.name", equalTo("dog"))
                .body("name", equalTo("snoopie"))
                .body("status", equalTo("pending"));
    }
}
