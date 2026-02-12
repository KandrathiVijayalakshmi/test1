package builder;

public class differentAuth {

	@Test
	void dif_auth_method() {
		given().
		auth().
		basic("username","password")
		.when()
		.get("https://reqres.in/api")
		.then()
		.log().all().statusCode(200);
	}
}
