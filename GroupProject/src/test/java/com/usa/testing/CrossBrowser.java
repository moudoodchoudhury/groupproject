package com.usa.testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.usa.pagefactory.MyPageFactory;
import com.usa.utility.Getwait;

public class CrossBrowser {

	public Properties pr;
	public FileInputStream fl;
	public WebDriver driver;
	MyPageFactory pf;
	

	@BeforeMethod
	public void testone() {
	
		pr = new Properties();
		try {
			fl= new FileInputStream(System.getProperty("user.dir")+ "./src/main/java/com/usa/config/login.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pr.load(fl);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}	
	@Test
	@Parameters("browser")
	public void testtwo(String mybrowserName) {

		if (mybrowserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (mybrowserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();

		}
		driver.get(pr.getProperty("URL"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	pf =	PageFactory.initElements(driver, MyPageFactory.class);
	
	Getwait.waitmethod(pf.getSignIn()).click();
	Getwait.waitmethod(pf.getUserName()).sendKeys("USERNAME");
	}

	
}
