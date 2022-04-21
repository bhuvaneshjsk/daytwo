package com.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	static WebDriver driver;
	@Before
	public void Test() {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();

}
	@Test
	public void testone() throws InterruptedException {

		WebElement txtxuser = driver.findElement(By.id("email"));
		txtxuser.sendKeys("bhuvan");
		Thread.sleep(3000);
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("waran");
		Thread.sleep(3000);
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
}
	@Test
	public void testTwo() throws InterruptedException {

		WebElement txtxuser = driver.findElement(By.id("email"));
		txtxuser.sendKeys("jaisivakarthi");
		Thread.sleep(3000);
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("kutty");
		Thread.sleep(3000);
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
}
	@Test
	public void testThree() throws InterruptedException {

		WebElement txtxuser = driver.findElement(By.id("email"));
		txtxuser.sendKeys("Rasukutty");
		Thread.sleep(3000);
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("pasuvathi");
		Thread.sleep(3000);
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
}
	@After
	public void after() {
		driver.close();

	}
}