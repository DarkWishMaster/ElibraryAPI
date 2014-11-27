package com.alliedtesting.elibrarytesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


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
		
		HomePage home = new HomePage();
		home.openPage();
		home.clickSignInBtn();
		home.loginAs("worke2r@alliedtesting.com", "123");
		
		System.out.println(home.getLogged());
		
//	    REST API = new REST();
//	    /* Wow post method works */
//	    String filter = "{\"levelName\":\"INFO\"}";
//	    System.out.println(API.getLogsCount(filter));
		
	}

}
	