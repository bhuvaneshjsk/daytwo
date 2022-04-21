package com.junit;

import java.sql.Driver;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	static WebDriver driver;
	@BeforeClass
	public static void beforeclass() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
@AfterClass
public static void afterClass() {
//driver.close();
}
@Before
public void before() {
Date d = new Date();
System.out.println("Start Time:"+d);
}
@After
public void after() {
	Date d = new Date();
	System.out.println("End Time:"+d);
}
@Test
public void testone() throws InterruptedException {

	WebElement txtxuser = driver.findElement(By.id("email"));
	txtxuser.sendKeys("bhuvan");
	Thread.sleep(2000);
	WebElement txtpass = driver.findElement(By.id("pass"));
	txtpass.sendKeys("waran");
	Thread.sleep(3000);

	WebElement btnlogin = driver.findElement(By.name("login"));
	btnlogin.click();


}
}
