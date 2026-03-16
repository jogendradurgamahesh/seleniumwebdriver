package sample13;

import java.io.FileOutputStream;
import java.io.IOException;

import io.restassured.RestAssured;

public class DownloadUsingRestAssured {

	 public static void main(String[] args) throws IOException {

		  String path = System.getProperty("user.dir")+"\\downloads\\sample-upload.txt";
	        byte[] file =
	                RestAssured
	                .given()
	                .when()
	                .get("https://the-internet.herokuapp.com/download/sample-upload.txt")
	                .asByteArray();
	        
	        FileOutputStream fos = new FileOutputStream(path);
	        fos.write(file);
	        fos.close();

//	        System.out.println("File downloaded successfully");
//
//
//	        System.out.println("File downloaded");
	        
	        System.out.println("File downloaded at: " + path);

	    }
}
