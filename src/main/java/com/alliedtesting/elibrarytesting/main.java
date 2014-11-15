package com.alliedtesting.elibrarytesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/*
 * TODO:
 * 	  Test Engine Framework?
 */
public class main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePage  home   = new HomePage(driver);
		
		home.openPage();
		home.clickSignInBtn();

		home.loginAs("superuser@alliedtesting.com", "123");

	}

}
