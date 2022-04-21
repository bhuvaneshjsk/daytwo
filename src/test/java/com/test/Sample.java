package com.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Sample {
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String currentUrl = driver.getCurrentUrl();
		boolean contains = currentUrl.contains("facebook");
		System.out.println(contains);
		
		Assert.assertTrue(contains);
	
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("bhuvanesh");
		
		String attribute = txtuser.getAttribute("value");
		Assert.assertEquals("bhuvanesh",attribute);
		System.out.println(attribute);
	
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("kutty123");
		
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();

	}

}
