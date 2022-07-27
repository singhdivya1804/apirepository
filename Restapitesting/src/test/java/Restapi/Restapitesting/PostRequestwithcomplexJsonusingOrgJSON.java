package Restapi.Restapitesting;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequestwithcomplexJsonusingOrgJSON
{



public static void main(String[] args) {
	
	
JSONObject innerObject = new JSONObject();         // create inner object for complex json
innerObject.put("houseno", "70");
innerObject.put("sector", "1");
innerObject.put("landmark", "policechowki");

JSONObject outerObject = new JSONObject();         // create outer object for complex json
outerObject.put("fn", "div");
outerObject.put("ln", "singh");
outerObject.put("id", "dcdccyu");              // id bhi yaha dege outer object me
outerObject.put("Address", innerObject);       // Address dena must hai
	

Response res =                   ////// 
given()
.contentType(ContentType.JSON)
.body(outerObject.toString())  // 
.when()
.post("http://localhost:3000/apirevenue");

System.out.println("status code is");
System.out.println(res.statusCode());
System.out.println("response body data is");
System.out.println(res.asString());
	
	
	
	
	
}	
	
	
	
}
