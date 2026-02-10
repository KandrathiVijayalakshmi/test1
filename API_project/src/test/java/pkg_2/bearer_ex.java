package pkg_2;

import org.junit.Assert;
import org.testng.annotations.Test;

//import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class bearer_ex {
	@Test(enabled=true)
	public void two() {
		RestAssured.baseURI="https://api.github.com";
		RestAssured.basePath="/users/KandrathiVijayalakshmi/repos";
		
		RequestSpecification requestspec=RestAssured.given();
		requestspec.header("Authorization","Bearer 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");
		
		Response response= requestspec.get();
		
		JsonPath jsonpath=response.jsonPath();
		String resposname=jsonpath.getString("name");
		
		System.out.println(resposname);
		
		Assert.assertEquals(response.statusCode(), 200);
		
	
	
	}

}
