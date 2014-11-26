package com.alliedtesting.elibrarytesting;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import com.google.gson.Gson;


/*
 * TODO: 15.11.2014 
 * 	  - Test Engine Framework?
 * 	  - httpclient - > Send request so server etc. SET, PUT etc. No JS:
 * 			->     make it singleton ( if  == NIL => create, ruby's |= )
 * 			->     make a RestAPI class 
 * 			->     send requests -> get JSON's. (GSON lib)  to_gson, from_gson methods check.
 * 			->     make a class for each entity
 * 			->     Authors make a List<Author> .... etc
 * 			->     date use as Date?:
 * 			-> Homework
 * 			To write login, logout
 * 			RESTAPI work class (httpclient)
 * 			Classes entities. experiment with GSON.
 * 
 */

/*	
 * TODO: 22.11.2014 
 * 	    TestNG:
 * 			DataProvider - > prepare data for tests
 * 	 		Checkout maven build
 * 
 * 
 */
public class main {

	public static void main(String[] args) throws Exception {
		
		//System.setProperty("webdriver.chrome.driver", "D:/Software/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//HomePage  home   = new HomePage(driver);
		
		//home.openPage();
		//home.clickSignInBtn();

		//home.loginAs("worker@alliedtesting.com", "123");
		
	    REST API = new REST();
	    /* Wow post method works */
	    String filter = "{\"levelName\":\"INFO\"}";
	    System.out.println(API.getLogsCount(filter));
		
	}

}
	