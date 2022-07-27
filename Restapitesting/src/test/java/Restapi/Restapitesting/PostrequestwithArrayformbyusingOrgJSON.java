package Restapi.Restapitesting;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostrequestwithArrayformbyusingOrgJSON {

public static void main(String[] args) {
	
	
JSONObject innerObject1 = new JSONObject();    //// Create inner object 1
innerObject1.put("desig", "tl");
innerObject1.put("comp", "res");
innerObject1.put("type", "PrimaryAddress");
	
JSONObject innerObject2 = new JSONObject();    //// Create inner object 2
innerObject2.put("mom", "ind");
innerObject2.put("dad", "shiv");
innerObject2.put("type", "SecondaryAddress");


JSONArray array = new JSONArray();             //// create Array
array.put(0,innerObject1);
array.put(1,innerObject2);
	

JSONObject outerObject = new JSONObject();    //// Create outer object 
outerObject.put("role", "qa");
outerObject.put("office", "filmcity");
outerObject.put("id", "bcdvgh");
outerObject.put("Address", array);

Response res =                              ////// create response
given()
.contentType(ContentType.JSON)
.body(outerObject.toString())   
.when()
.post("http://localhost:3000/apirevenue");

System.out.println("status code is");
System.out.println(res.statusCode());
System.out.println("response body data is");
System.out.println(res.asString());
	
	
	
	
	
}	
	
}
