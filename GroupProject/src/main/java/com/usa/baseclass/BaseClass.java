package com.usa.baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;

	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	public void urlsetUp() {
		String url = "https://www.zoopla.co.uk";
	}

	public void tearDown() {
		driver.quit();
	}

	public static void getscreenshotmethod(String screensot) {
		
	 File srcfile  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	 TakesScreenshot tss= (TakesScreenshot)driver;
	
	 
	 try {
		FileUtils.copyFile(srcfile, new File("user.dir"+"C:\\Users\\moudo\\eclipse-workspace\\GroupProject\\Screenshot"+screensot + ".png" ));
	} catch (IOException e) {
		
		e.printStackTrace();
	}
		
		
	 
		
}
}
