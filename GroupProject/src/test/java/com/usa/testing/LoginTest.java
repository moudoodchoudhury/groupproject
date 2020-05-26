package com.usa.testing;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.usa.baseclass.BaseClass;
import com.usa.pagefactory.MyPageFactory;
import com.usa.utility.ListenClass;


@Listeners(ListenClass.class)
public class LoginTest extends BaseClass {
	MyPageFactory mpf;
	
	@BeforeTest
	public void firstMethod() {
		setUp();
		mpf=PageFactory.initElements(driver, MyPageFactory.class);
	}
	@Test
	public void secondMethod() {
		
		driver.get("https://www.zoopla.co.uk/");
		mpf.getSignIn().click();
		mpf.getUserName().sendKeys("xyz");
		mpf.getPsw().sendKeys("pss");
		
	}
	@AfterTest
	public void thirdMethod() {
		tearDown();
	}

}
