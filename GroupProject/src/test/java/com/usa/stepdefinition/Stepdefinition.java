package com.usa.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.usa.baseclass.BaseClass;
import com.usa.pagefactory.MyPageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends BaseClass {
	MyPageFactory mp;
	
	@Given("^Open the browser$")
	public void open_the_browser()  {
		setUp();
		mp=PageFactory.initElements(driver, MyPageFactory.class);
		
		
	
		
		
	}

	@Given("^navigate to \"([^\"]*)\"$")
	public void navigate_to(String URL)  {
		
		driver.get(URL);
		
	}

	/*@When("^input userName\"([^\"]*)\" Password \"([^\"]*)\"$")
	public void input_userName_Password(String userName, String Password)  {
	
		driver.findElement(By.id("signin_email")).sendKeys(userName);
		driver.findElement(By.id("signin_password")).sendKeys(Password);
		
	    
	    
	}*/
	@When("^enter userName \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void enter_userName_and_Password(String userName, String Password) {
	mp.getSignIn().click();
	mp.getUserName().sendKeys(userName);
	mp.getPsw().sendKeys(Password);
		
	    
	}

	@Then("^Close the browser$")
	public void close_the_browser()  {
		driver.quit();
	    
	    
	}

}
