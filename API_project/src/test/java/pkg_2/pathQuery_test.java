package pkg_2;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class pathQuery_test {
	
	@Test
	public void
	getUserUsingPathAndQuery() {
	baseURI="https://reqres.in";

		given()
		.header("x-api-key","reqres_8b8146234e8544818a6ea76e7c4ecc91")
		.pathParam("resource","users")
		.queryParam("page",1)
		.get("/{resourse}")
		.then().statusCode(200)
		.body("data[0].first_name",equalTo("vijju"))
		.body("data.first_name",hasItems("vijju","nani"));
	}


}
