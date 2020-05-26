package com.usa.none;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class allright {
	public static WebDriver driver;

	public void Mouseaction() {

		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//a[@class='mnav__link mnav__link--account has-subnav']"));
		action.moveToElement(element).build().perform();

	}
	
	public void scrollpage() {
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("scroll(0,800)");
		
		js.executeScript("scroll(0,-800");
	}
	public void robotclass() throws Exception {
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		
	}
	

	public static void main(String[] args) throws Exception {

		allright obj = new allright();

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.zoopla.co.uk/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement element =driver.findElement(By.xpath("//a[@class='home-valuation__cta button button--secondary']"));
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		/*js.executeScript("scroll(0,1200)");
		Thread.sleep(3000);
		js.executeScript("scroll(0,-800)");
		/*int size =driver.findElements(By.tagName("iframe")).size();
		System.out.println("total frame number"+ size);
		driver.switchTo().frame("wpfooter");
		driver.findElement(By.id("search-submit")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@class='button button--tertiary-dark account-link__text']")).click();
		driver.findElement(By.id("signin_email")).sendKeys("choudhury1507@gmail.com");
		driver.findElement(By.id("signin_password")).sendKeys("md1979@#");
		driver.findElement(By.id("signin_submit")).click();
		// driver.findElement(By.xpath("//span[text()='e.g. Oxford, NW3 or Waterloo
		// Station']")).sendKeys("New York");
		// driver.findElement(By.xpath("//button[@type='submit']")).click();
		obj.Mouseaction();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='notifications__text is-l'])[5]")).click();*/
		
		//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']//descendant::li[@tabindex='-1']

	}

}
