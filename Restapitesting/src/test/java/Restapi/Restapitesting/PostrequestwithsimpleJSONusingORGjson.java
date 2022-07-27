package Restapi.Restapitesting;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;      //// is restassured class k through import krte hai aur static / .* manually add krte hai

public class PostrequestwithsimpleJSONusingORGjson {

public static void main(String[] args) {
	
    JSONObject requestBodyData = new JSONObject();
	requestBodyData.put("firstname", "divya");
	requestBodyData.put("lastname", "singh");
	requestBodyData.put("designation", "tl");
	requestBodyData.put("id", "divya");
	System.out.println(requestBodyData);

	
	Response res =                   ////// ise given likhne k bad likhte hai yaha
    given()
    .contentType(ContentType.JSON)
    .body(requestBodyData.toString())  // ise bad me to string me convert kia
    .when()
    .post("http://localhost:3000/apirevenue");

    System.out.println("status code is");
    System.out.println(res.statusCode());
    System.out.println("response body data is");
    System.out.println(res.asString());



	
	
	
	
	
	
	
}	
	
	
	
	
	
}
