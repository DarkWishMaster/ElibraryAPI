package com.alliedtesting.elibrarytesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPage {

	public static WebDriver driver;
	
	public WebPage()
	{
		if (driver == null) {
			 System.setProperty("webdriver.chrome.driver", "D:/Software/chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		}
	}
	
	public void Wait(int seconds) {
	    
		try {
	        Thread.sleep(1000);                 //1000 milliseconds 
	    } catch(InterruptedException ex) {
	    	System.out.println("Exception in WebPage.Wait() method!");
	        Thread.currentThread().interrupt();
	    }
	}
	
	public void Quit()
	{
		driver.close();
	}
	
	public void findAndClick(String xpath)
	{
		// ...
	}
}
