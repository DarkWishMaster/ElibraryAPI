package com.alliedtesting.elibrarytesting;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


/*
 * TODO:
 * 	- UI API
 */
public class HomePage extends WebPage {
	
	
	public HomePage()
	{
		super();
	}
	
	public void openPage()
	{
		driver.get("http://81.180.75.144:8080/elibrary/");
	}
	
	
    public void clickSignInBtn()
    {
    	String sign_in_path = "/html/body/div/header/div[1]/div/button[1]";
    	/* Click sign in button */
    	driver.findElement(By.xpath(sign_in_path)).click(); 	
    }
    
    public void clickSignOutBtn()
    {
    	String sign_out_path = "/html/body/div/header/div[1]/div/a";
    	/* Click sign in button */
    	driver.findElement(By.xpath(sign_out_path)).click(); 	
    }
    
    public void clickRegisterBtn()
    {
    	String reg_path = "/html/body/div/header/div[1]/div/button[2]";
    	driver.findElement(By.xpath(reg_path)).click();
    }
    
    public void clickHomeMenu()
    {
    	String home_menu_path = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[1]/a";
    	driver.findElement(By.xpath(home_menu_path)).click();	
    }
    
    public void clickAllBooksMenu()
    {
    	String all_books_path = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[2]/aa";
    	driver.findElement(By.xpath(all_books_path)).click();	
    }
   
    public void loginAs(String name, String password)  
    {
    	String jsSignEmail = "document.getElementById(\"signin_email\").value=\""+name+"\"";
    	String jsSignPass  = "document.getElementById(\"signin_password\").value=\""+password+"\"";
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(jsSignEmail);
        js.executeScript(jsSignPass);
        
        WebElement el = driver.findElement(By.xpath("//*[@id=\"user_login_form\"]/div[3]/button[2]"));
        
        Wait(1);
        el.click();
        //driver.quit();
    }
    
    public void registerAs(String firstName, String lastName, String email, 
    		String pass, String passConfirm)
    {
    	String jsRegFirstName = 
    			"document.getElementById(\"reg_first_name\").value=\"" + firstName + "\"";
    	String jsRegLastName  = 
    			"document.getElementById(\"reg_last_name\").value=\"" + lastName + "\"";
    	String jsRegEmail     = 
    			"document.getElementById(\"reg_email\").value=\""     + email + "\"";
    	String jsRegPass      = 
    			"document.getElementById(\"reg_password\").value=\""  + pass + "\"";
    	String jsRegPassConf  = 
    			"document.getElementById(\"reg_password_conf\").value=\"" + passConfirm + "\"";
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(jsRegFirstName);
        js.executeScript(jsRegLastName);
        js.executeScript(jsRegEmail);
        js.executeScript(jsRegPass);
        js.executeScript(jsRegPassConf);
        
        WebElement el = driver.findElement(By.xpath("//*[@id=\"reg_request_form\"]/div[3]/button[2]"));
        Wait(1);
        el.click();
    }
    
    public String getLogged(){
    	String path = "/html/body/div/header/div[1]/div/span/b";
    	String log;
    	try {
    		log = driver.findElement(By.xpath(path)).getText();
    	} 
    	catch (Exception e)
    	{
    		log = "EXCEPTION";
    	}
    	return log;
    }

}
