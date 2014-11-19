package com.alliedtesting.elibrarytesting;
import java.util.Date;

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

	public static void main(String[] args) {
		/*
		System.setProperty("webdriver.chrome.driver", "D:/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePage  home   = new HomePage(driver);
		
		home.openPage();
		home.clickSignInBtn();

		home.loginAs("superuser@alliedtesting.com", "123");
		*/
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		String json = "{\"id\": 5, \"fullName\": \"Erich Gamma\","+
				   "\"dateOfBirth\": \"1961-03-13\",\"description\": \"Erich Gamma desc\"}";
		Author a = gson.fromJson(json, Author.class);
		
		System.out.println("Author id   = " + a.getId());
		System.out.println("Author name = " + a.getFullName());
		System.out.println("Author DOB  = " +  a.getDateOfBirth());
		String json2 = gson.toJson(a);
		System.out.println(json2);

	}
		
	
}
	

