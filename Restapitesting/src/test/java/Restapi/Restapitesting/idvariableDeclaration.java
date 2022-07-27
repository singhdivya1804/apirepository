package Restapi.Restapitesting;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Random;
import java.util.regex.Pattern;



import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class idvariableDeclaration {



public static void main(String[] args) throws FileNotFoundException {
	
	for (int i=0;i<3;i++) // for hitting multiple time loop chala do
	{
	
      Random r = new Random();                     // in place of scanner we can use random number for id declaration
    Integer value = r.nextInt();
    String idValue = value.toString();
   
	
	
   File f = new File ("../Restapitesting/inputpayload.json");  // establish connection
   FileInputStream fi =  new  FileInputStream(f);
   
   JSONTokener js = new JSONTokener(fi);
   JSONObject ob = new JSONObject(js);
   
   String bodyData = ob.toString();
   bodyData = bodyData.replaceAll(Pattern.quote("{{id}}"), idValue);
   
   System.out.println("After Replacement");
   System.out.println(bodyData);
   
   

   Response res =                              ////// create response
		   given()
		   .contentType(ContentType.JSON)
		   .body(bodyData)   
		   .when()
		   .post("http://localhost:3000/apirevenue");

		   System.out.println("status code is");
		   System.out.println(res.statusCode());
		   System.out.println("response body data is");
		   System.out.println(res.asString());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	
}	
	
}
