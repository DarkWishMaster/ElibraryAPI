package com.alliedtesting.elibrarytesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/*
 * TODO:
 * 	- UI API
 */
public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	void openPage()
	{
		driver.get("http://81.180.75.144:8080/elibrary/");
	}
	
    void clickSignInBtn()
    {
    	String sign_in_path = "/html/body/div/header/div[1]/div/button[1]";
    	/* Click sign in button */
    	driver.findElement(By.xpath(sign_in_path)).click(); 	
    }
    
    void clickRegisrBtn()
    {
    	String reg_path = "/html/body/div/header/div[1]/div/button[2]";
    	driver.findElement(By.xpath(reg_path)).click();
    }
    
    void clickHomeMenu()
    {
    	String home_menu_path = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[1]/a";
    	driver.findElement(By.xpath(home_menu_path)).click();	
    }
    
    void clickAllBooksMenu()
    {
    	String all_books_path = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[2]/aa";
    	driver.findElement(By.xpath(all_books_path)).click();	
    }
   
    void loginAs(String name,String password)  
    {
    	String jsSignEmail = "document.getElementById(\"signin_email\").value=\""+name+"\"";
    	String jsSignPass  = "document.getElementById(\"signin_password\").value=\""+password+"\"";
    	
    	//String email_path   = "//*[@id=\"signin_email\"]";
    	//String pass_path    = "//*[@id=\"signin_password\"]";
    	//driver.findElement(By.xpath(pass_path)).sendKeys(pass_path);
    	//driver.findElement(By.xpath(email_path)).sendKeys(name); 
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(jsSignEmail);
        js.executeScript(jsSignPass);
        
        WebElement el = driver.findElement(By.xpath("//*[@id=\"user_login_form\"]/div[3]/button[2]"));
        try {
            Thread.sleep(1000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        el.click();

        //driver.quit();
    }

}
