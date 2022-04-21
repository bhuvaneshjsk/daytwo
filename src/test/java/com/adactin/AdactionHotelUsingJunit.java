package com.adactin;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class AdactionHotelUsingJunit extends LibGlobal {
	 static AdactionHotelUsingJunit aa;
	@BeforeClass
	public static void beforeclass() throws Throwable {
		AdactionHotelUsingJunit aa = new AdactionHotelUsingJunit();
		AdactionHotelUsingJunit.browserconfigchrome();
		aa.openUrl("https://adactinhotelapp.com/");
		String currentUrl = aa.getCurrentUrl();
		boolean contains = currentUrl.contains("adactinhotel");
		System.out.println(contains);
		Assert.assertTrue(contains);
		aa.maximizewindow();
		thread(3000);

}
	@Before
	public void befor() {
		Date d = new Date();
		long time = d.getTime();
		System.out.println(time);
	}
//	@After
//	public void after() {
//		Date d = new Date();
//		long time = d.getTime();
//		System.out.println(time);
//	}
	@AfterClass
	
	public static void afterclass() throws Throwable {
		Thread.sleep(3000);
		driver.quit();

	}
	@Test
	public void test() throws Throwable {
		WebElement locateById = aa.locateById("username");
		aa.inputText(locateById, "bhuvaneshmech");
		WebElement locateById2 = aa.locateById("password");
		aa.inputText(locateById2, "bhuvanesh185");
		WebElement locateById3 = aa.locateById("login");
		aa.click(locateById3);
		

	}
}
