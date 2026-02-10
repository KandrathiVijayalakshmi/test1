package restAssured_pkg;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
//import io.restassured.matcher.ResponseAwareMatcher;
//import static io.restassured.matcher.ResponseAwareMatcher.*;

import io.restassured.response.Response;
//import io.restassured.response.ValidatableResponse;
//import io.restassured.response.ValidatableResponseOptions;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class test_1 {

	@Test//(enabled=false)
	void test_get() {
		
		baseURI="https://reqres.in/api";
		
		given().header("x-api-key","reqres_8b8146234e8544818a6ea76e7c4ecc91")
		.get("/users?page=2").then().statusCode(200).log().all();

	}
	
	@Test//(enabled=false)
	void test1_get() {
		

	RequestSpecification httpRequest = RestAssured.given();
	httpRequest.header("x-api-key","reqres_8b8146234e8544818a6ea76e7c4ecc91");
	httpRequest.baseUri("https://reqres.in/api");
	Response response =httpRequest.get("/users?page=2");
	
	System.out.println(response.getBody().asString());
	System.out.println(response.getStatusCode());
	
	System.out.println(response.getStatusLine());
	System.out.println(response.getHeader("content-type"));
	
	int code =response.getStatusCode();
	Assert.assertEquals(code,200);
		
}
	
	@Test//(enabled=false)
	void test2_get() {
		baseURI="https://reqres.in/api";
		given().header("x-api-key","reqres_8b8146234e8544818a6ea76e7c4ecc91")
		.get("/users?page=2").then().statusCode(200)
		.body("data[0].first_name",equalTo("vijju"))
		.body("data.first_name",hasItems("vijju","nani"));
	}

	
}
	

		

