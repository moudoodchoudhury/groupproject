package com.usa.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Getwait{
	static WebDriver driver;
	
	public static WebElement waitmethod(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		WebElement element1= wait.until(ExpectedConditions.elementToBeClickable(ele));
		return element1;
		
	}

}
