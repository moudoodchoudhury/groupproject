package com.usa.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.usa.baseclass.BaseClass;

public class MyPageFactory extends BaseClass {
	
public MyPageFactory() {
	
	PageFactory.initElements(driver,this);

}

@FindBy(xpath="//*[@class='button button--tertiary-dark account-link__text']")
private WebElement SignIn;

public WebElement getSignIn() {
	return SignIn;
}

@FindBy(id="signin_email")
private WebElement userName;

public WebElement getUserName() {
	return userName;
}
@FindBy(id="signin_password")
private WebElement psw;

public WebElement getPsw() {
	return psw;
}


}
