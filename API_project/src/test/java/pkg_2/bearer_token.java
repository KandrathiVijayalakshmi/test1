package pkg_2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.ResponseOptions;

public class bearer_token {
	@Test(enabled=true)
	public void test(){
	RestAssured.baseURI="https://api.github.com";
	String ep ="/users/KandrathiVijayalakshmi/repos";
	String token = "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";
	
	ResponseOptions res2=(ResponseOptions) RestAssured.given()
			.auth().oauth2(token)
			.get(ep).getBody();
	
	System.out.println(res2.toString());
	
	}
}
