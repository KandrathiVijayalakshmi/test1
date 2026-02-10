package pkg_2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;


//import org.junit.Test;

public class basicauthDemo {
	@Test(enabled=false)
	public void basicauth1() {
		RestAssured.baseURI="http://postman-echo.com";
		String response = given().log().all().auth().
				preemptive().basic("postman","password")
				.when().get("basic-auth")
				.then().log().all().assertThat().statusCode(200)
				.extract().response().asString();
		System.out.println(response);
	
	}
	@Test(enabled=false)
	public void basicauth2() {
		
		given()
		.auth()
		.preemptive()
		.basic("username","password")
		.when()
		.get("https://reqres.in/api")
		.then()
		.log().all().assertThat().statusCode(200);
	}
}
