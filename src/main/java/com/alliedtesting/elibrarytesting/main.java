package com.alliedtesting.elibrarytesting;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


/*
 * TODO:
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
 */
public class main {

	public static void main(String[] args) throws Exception {
		/*
		System.setProperty("webdriver.chrome.driver", "D:/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePage  home   = new HomePage(driver);
		
		home.openPage();
		home.clickSignInBtn();

		home.loginAs("superuser@alliedtesting.com", "123");
		*/
		REST API = new REST();
		API.removeBook(1);
		Book mybook = API.getBook(1);
		
	//	mybook.setId(666);
		//mybook.setTitle("This book is from Satan!!!");
		//API.createBook(mybook);
	//	mybook = API.getBook(666);
		//API.prettyPrint(mybook);
		API.prettyPrint(API.getAuthors());
		
	}
		
	
}
	