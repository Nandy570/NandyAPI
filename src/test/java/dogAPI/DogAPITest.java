package dogAPI;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.Method;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

import java.util.HashMap;



public class DogAPITest {


	@Test
	 void RetrieveAllSubBreeds()
	{

		given()
		.when()
			.get("https://dog.ceo/api/breed/hound/list")

		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.log().all();

		given()
		.when()
		.get("https://dog.ceo/api/breed/hound/afghan/images")

		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.log().all();

	}

			@Test
			 void VerifySuccessfulMsg()
			{

				given()
				.when()
					.get("https://dog.ceo/api/breeds/image/random")

				.then()
				.statusCode(200)
				.statusLine("HTTP/1.1 200 OK")
				.log().all();

}
	 @Test
	 void VerifyBulldog()
	{

		given()
		.when()
			.get("https://dog.ceo/api/breeds/list/all")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.log().all();
	}	


 }

