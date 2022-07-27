package Restapi.Restapitesting;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;



public class PostrequestusingPOJO {

	public static void main(String[] args) {
		
	SimplejsonusingPOJO simple = new SimplejsonusingPOJO();   // simple class jo pojo ki hai uska method call krne k liye object create kia hai	
	simple.setFirstName("divya");
	simple.setLastName("singh");
	simple.setId("div");
	simple.setDesignation("qa");
	simple.setCompanyName("cres");
	

	   Response res =                              ////// create response
			   given()
			   .contentType(ContentType.JSON)
			   .body(simple)   
			   .when()
			   .post("http://localhost:3000/apirevenue");

			   System.out.println("status code is");
			   System.out.println(res.statusCode());
			   System.out.println("response body data is");
			   System.out.println(res.asString());
	
			
	
		
		
		
		
		
		
		
		
	}	
}
