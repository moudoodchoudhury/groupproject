package com.usa.none;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hey {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='search_query form-control ac_input']")).sendKeys("mens dress");
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		String search=driver.findElement(By.xpath("//h1[@class='page-heading  product-listing']")).getText();
		System.out.println(search);
		
		if (search.equalsIgnoreCase("SEARCH 0 results have been found. ")){
				System.out.println("test passed");

	}else {
		
		System.out.println("test failed");
	}
		List<WebElement> lst=driver.findElements(By.xpath("//span[@class='price']"));
		System.out.println("total number of dress::"+lst.size());
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i).getText());
			
		}
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("(//*[@data-validate='isEmail'])[2]")).sendKeys("choudhury1507@gmail.com");
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("md1979@#");
		driver.findElement(By.xpath("//button[@name='SubmitLogin']")).click();
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		
		
		
	}

}
	
