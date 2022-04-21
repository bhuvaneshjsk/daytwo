package com.test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {
  static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@AfterClass
	public static void afterClass() {
		//driver.quit();
	}
	@Before
	public void before() {
	Date d = new Date();
	System.out.println("start time is"+d);
	}
	@After
	public void after() {
		Date d = new Date();
		System.out.println("start time is"+d);
	}
	
	@Test
	public void test() {
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("bhuvanesh");
	}
	@Test
	public void test1() {
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("kutty123");
	}
	
	
	
}