package pkg_2;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Request_builder {
	RequestSpecBuilder reqbuilder = new RequestSpecBuilder();
	reqBuilder.setBaseUri("https://restful-booker.herokuapp.com");
	reqBuilder.setBasedPath("/booking");
	RequestSpecification reqSpec =reqbuilder.build();
	
	System.out.println("====================");
	
	Response res2=RestAssured.given(reqSpec).get();
	System.out.println(res2.asString());
	System.out.println("=====================");
	
}
}
