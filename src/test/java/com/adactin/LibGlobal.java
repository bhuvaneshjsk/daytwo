package com.adactin;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
static WebDriver driver;
private WebElement element;
String locatioin ="C:\\Users\\ELCOT\\eclipse-workspace\\PageObjectModel\\Excel\\frameBook.xlsx";
public static void browserconfigchrome() {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
}
public void openUrl(String url) {
driver.get(url);
}
public void maximizewindow() {
driver.manage().window().maximize();
}
public WebElement locateById(String id) {
WebElement findElement = driver.findElement(By.id(id));
return findElement;
}
public WebElement locateByName(String name) {
WebElement findElement = driver.findElement(By.name(name));
return findElement;
}
public WebElement locateByClassName(String classname) {
WebElement findElement = driver.findElement(By.className(classname));
return findElement;
}
public WebElement locateByXpath(String StringxpathExpression) {
	WebElement findElement = driver.findElement(By.xpath(StringxpathExpression));
	return findElement;
}
public void locateBytagname(String tagName) {
	driver.findElement(By.tagName(tagName));
}
public void locateByLinkText(String linkText) {
driver.findElement(By.linkText(linkText));
}
public void locateBypartiallyLinkText(String partialLinktest) {
driver.findElement(By.partialLinkText(partialLinktest));
}
public void locateBycssSelector(String cssSelector) {
driver.findElement(By.cssSelector(cssSelector));
}
public  String getCurrentUrl() {
String currentUrl = driver.getCurrentUrl();
return currentUrl;
}
public void getTittle(String value) { 
driver.getTitle();
}
public void currenWindowClsoe() {
driver.close();
}
public void allWindowClsoe() {
driver.quit();
}
public void inputText(WebElement element, String value) {
element.sendKeys(value);
}
public void click(WebElement element) {
	element.click();
}
public String getAttribute(WebElement element, String value) {
	String attribute = element.getAttribute(value);
	return attribute;
}
public String getText(String text) {
	String String = element.getText();
	return String;
}
public void navigation(String url) {
	driver.navigate().to(url);}
public void navigateBack() {
	driver.navigate().back();
}
public void navigateForward() {
driver.navigate().forward();
}
public void navigateRefresh() {
driver.navigate().refresh();
}

public static void thread(long millls) throws Exception {
Thread.sleep(millls);
}
public void mouseOverAction(WebElement target) {
Actions a = new Actions(driver);
a.moveToElement(target).perform();
}
public void rightClick() {
	Actions a = new Actions(driver);
a.contextClick();
}
public void doubleClick() {
	Actions a = new Actions(driver);
a.doubleClick();
}

public void dragAndDrop(WebElement source, WebElement target) {
	Actions a = new Actions(driver);
a.dragAndDrop(source, target);
}
public void alertAccept() {
	Alert al = driver.switchTo().alert();
	al.accept();}
public void alertDismiss() {
	Alert al = driver.switchTo().alert();
	al.dismiss();
}
public void alertsendKeys(String value) {
	Alert al = driver.switchTo().alert();
	al.sendKeys(value);
}
public void alertg(String value) {
	Alert al = driver.switchTo().alert();
	al.getText();
}
public void screenShot(String pathname) throws Exception {
TakesScreenshot ss = (TakesScreenshot) driver;
File s = ss.getScreenshotAs(OutputType.FILE);
File d = new File(pathname);
FileUtils.copyFile(s, d);
}
public void screenShotwebElement(String pathname, WebElement element) throws Throwable {
File s1 = element.getScreenshotAs(OutputType.FILE);
File d = new File(pathname);
FileUtils.copyFile(s1, d);
}
public void javaScriptSetAttribute(WebElement element) {
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].setAttribute('value','')",element);
}
public void javaScriptGetAttribute(WebElement element) {
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("returnarguments[0].getAttribute('value')", element).toString();
}
public void javaScriptClick(WebElement element) {
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].click()",element);
}
public void javaScriptScrollDown(WebElement element) {
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].ScrollInToView(true)", element);
}
public void javaScriptScrollUp(WebElement element) {
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].ScrollInToView(false)", element);
}
public void dropDownDeselectAll(WebElement element) {
Select select = new Select(element);
select.deselectAll();
}
public void dropDowndeselectByIndex(WebElement element,int index) {
	Select select = new Select(element);
	select.deselectByIndex(index);
}
public void dropDowndeselectByValue(WebElement element,String value) {
	Select select = new Select(element);
select.deselectByValue(value);
}
public void dropDowndeselectByVisibleText(WebElement element,String text) {
	Select select = new Select(element);
select.deselectByVisibleText(text);
}
public void dropDowndGetAllselectedOptions(WebElement element) {
	Select select = new Select(element);
select.getAllSelectedOptions();
}
public void dropDowndGetOptions(WebElement element) {
	Select select = new Select(element);
select.getOptions();
}
public void dropDowndGetFirstSelectedOption(WebElement element, String value) {
	Select select = new Select(element);
select.getFirstSelectedOption();
}
public void dropDowndisMultiple(WebElement element) {
	Select select = new Select(element);
select.isMultiple();
}
//public WebElement dropDownselectByIndex(WebElement element,int index) {
//	Select select = new Select(element);
//select.selectByIndex(index);

//return element;
//}
public void ddnSelectByIndex(WebElement element,int i) {
	Select select = new Select(element);
	select.selectByIndex(i);
	
}

public void dropDownselectByValue(WebElement element,String value) {
	Select select = new Select(element);
select.selectByValue(value);
}

public void dropDownselectVisibleText(WebElement element,String text) {
	Select select = new Select(element);
select.selectByVisibleText(text);
}
public void SwitchToFrameById(String id) {
driver.switchTo().frame(id);
}
public void SwitchToFrameByName(String name) {
driver.switchTo().frame(name);
}
public void SwitchToFrameByElement(String frameElement) {
driver.switchTo().frame(frameElement);
}
public void SwitchToFrameByIndex(String index) {
driver.switchTo().frame(index);
}
public void switchTowindows(String windowsId) {
driver.switchTo().window(windowsId);
}
public void getParentWindowId(String windowsId) {
driver.getWindowHandle();
}
public void getAllWindowsId(String windowsId) {
driver.getWindowHandles();
}
public void webTable(String tagName) {
driver.findElements(By.tagName(tagName));
}
public void robot() throws AWTException {
Robot r = new Robot();
}
public void contains(WebElement element) {

}
public String excelRead(String path,String sheet, int row, int cell) throws Throwable {
	String value = null;
	File file = new File(path);
	FileInputStream stream = new FileInputStream(file);
	Workbook workbook = new XSSFWorkbook(stream);
	Sheet sheet1 = workbook.getSheet(sheet);
	Row row2 = sheet1.getRow(row);
Cell cell2 = row2.getCell(cell);
CellType Type = cell2.getCellType();
switch (Type) {
case STRING:
	value = cell2.getStringCellValue();
	
	break;
case NUMERIC:
	if (DateUtil.isCellDateFormatted(cell2)) {
		Date date = cell2.getDateCellValue();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yy");
		 value = dateFormat.format(date);
	}
	
	else {
		double d = cell2.getNumericCellValue();
		BigDecimal b = BigDecimal.valueOf(d);
		 value = b.toString();
	

	}
	break;
	
}
return value;

}
public void ecxelWrite(String path, String sheet, int row, int cell) throws IOException {

	File fil = new File(path);
	FileInputStream stream = new FileInputStream(fil);
	Workbook work = new XSSFWorkbook(stream);
	Sheet sheet1 = work.getSheet(sheet);
	Row row1 = sheet1.getRow(row);
	Cell cell1 = row1.getCell(cell);
	
	FileOutputStream fileout = new FileOutputStream(fil);
	work.write(fileout);
}
public void clear(WebElement element) {
element.clear();
}
}



