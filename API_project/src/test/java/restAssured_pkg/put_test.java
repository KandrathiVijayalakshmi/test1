package restAssured_pkg;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class put_test {
	@Test
	public void test_put() {
		
		JSONObject request=new JSONObject();
		request.put("name", "vijju");
		request.put("job", "Tester");
		
		given().header("Content-Type","application/json").
		header("x-api-key","reqres_8b8146234e8544818a6ea76e7c4ecc91").
		body(request.toJSONString()).
		when().put("https://reqres.in/api/users/2").
		then().
		statusCode(200).log().all();
	}

}
