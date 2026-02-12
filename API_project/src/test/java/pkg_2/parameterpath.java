package pkg_2;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.testng.annotations.Test;

public class parameterpath {
	
	@Test
	 void path_method() {
		
	baseURI="https://reqres.in/api";

		given()
		.header("x-api-key","reqres_8b8146234e8544818a6ea76e7c4ecc91")
		.pathParam("resource","users")
		//.queryParam("page",1)
		.get("/{resourse}?page=2")
		.then().statusCode(200)
		.body("data[4].first_name",equalTo("vijju"))
		.body("data.first_name",hasItems("vijju","nani"))
		.log().all();
		
	}
	
	@Test
	void query_method() {
		baseURI="https://reqres.in/api";

		given()
		.header("x-api-key","reqres_8b8146234e8544818a6ea76e7c4ecc91")
		.pathParam("resource","users")
		.queryParam("page",2)
		.get("/{resourse}?page=2")
		.then().statusCode(200)
		.body("data[4].first_name",equalTo("vijju"))
		.body("data.first_name",hasItems("vijju","nani"))
		.log().all();

}

}
