package RestAssuredPetStore;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class APIAutomationTask2 {

    @Test
    public void validateUserAPI() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given()
                .when()
                .get("/users")
                .then()
                .assertThat().statusCode(200)
                .assertThat().body("size()", greaterThan(3))
                .assertThat().body("find { it.name == 'Ervin Howell' }", notNullValue());
    }
}
