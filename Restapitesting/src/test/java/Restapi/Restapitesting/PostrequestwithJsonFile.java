package Restapi.Restapitesting;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostrequestwithJsonFile {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
		File f = new File("../Restapitesting/inputpayload.json");     // connection establish krne k liye
		FileInputStream fi = new FileInputStream(f);                  // file ka object call kia
		JSONTokener js = new JSONTokener(fi);                        // input stream ka object call kia
		JSONObject ob = new JSONObject(js) ;                        // tokener ka object call kia
		
		
	System.out.println("Request bodyData is");
	System.out.println(ob.toString());
		
	Response res =                              ////// create response
			given()
			.contentType(ContentType.JSON)
			.body(ob.toString())   
			.when()
			.post("http://localhost:3000/apirevenue");

			System.out.println("status code is");
			System.out.println(res.statusCode());
			System.out.println("response body data is");
			System.out.println(res.asString());	
		

	
	
	
	
	
	}

}
