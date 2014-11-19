package com.alliedtesting.elibrarytesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.gson.Gson;


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
		Gson gson = new Gson();
		Author a = gson.fromJson("{id : 2}", Author.class);
		
		System.out.println("Author id = " + a.getId());
		

	}
		
		
	class Author
		{
			int id;

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}
			
		}

}
	

