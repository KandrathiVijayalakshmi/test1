package pkg_2;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restAs_testget {
	@Test(enabled=true)
	void test_get() {
	baseURI="https://reqres.in/api";

	given()
	.header("x-api-key","reqres_8b8146234e8544818a6ea76e7c4ecc91")
    .get("/users?page=2")
	.then().statusCode(200)
	.log().all();
	}
	@Test(enabled=true)
	
	void test_get2() {
		RequestSpecification httpRequest= RestAssured.given();
		httpRequest.header("x-api-key","reqres_8b8146234e8544818a6ea76e7c4ecc91");
		httpRequest.baseUri("https://reqres.in/api");
		Response response=httpRequest.get("/users?page=2");
		
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		
		int code = response.getStatusCode();
		Assert.assertEquals(code, 200);
	}
	
	@Test
	void test_get3() {
		baseURI="https://reqres.in/api";

		given()
		.header("x-api-key","reqres_8b8146234e8544818a6ea76e7c4ecc91")
	
		.get("/users?page=2")
		.then().statusCode(200)
		.body("data[4].first_name",equalTo("vijju"))
		.body("data.first_name",hasItems("vijju","nani"))
		.log().all();
		
	}
	
	
}
