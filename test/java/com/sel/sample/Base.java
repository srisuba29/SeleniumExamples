package com.sel.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {

	public static WebDriver driver;
	public static Select text;
	public static Boolean val;

	public WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public WebDriver getFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Selenium\\Softwares\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

	public WebDriver getIEDriver() {
		System.setProperty("webdriver.ie.driver",
				"D:\\Selenium\\Softwares\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		return driver;
	}

	public void getURL(String url) {
		driver.get(url);
	}

	public WebElement byIdLocator(String element) {
		WebElement byIdLocator = driver.findElement(By.id(element));
		return byIdLocator;
	}

	public WebElement textLinkLocator(String element) {
		WebElement textLinkLocator = driver.findElement(By.linkText(element));
		return textLinkLocator;
	}

	public WebElement partialLinkLocator(String element) {
		WebElement partialLinkLocator = driver.findElement(By
				.partialLinkText(element));
		return partialLinkLocator;
	}

	public WebElement xpathLocator(String element) {
		WebElement xpathLocator = driver.findElement(By.xpath(element));
		return xpathLocator;
	}

	public WebElement cssLocator(String element) {
		WebElement cssLocator = driver.findElement(By.cssSelector(element));
		return cssLocator;
	}

	public WebElement nameLocator(String element) {
		WebElement nameLocator = driver.findElement(By.name(element));
		return nameLocator;
	}

	public WebElement classLocator(String element) {
		WebElement classLocator = driver.findElement(By.className(element));
		return classLocator;
	}

	public void sendKeyAction(WebElement element, String value) {
		element.sendKeys(value);
	}

	public Boolean isDisplay(WebElement element) {
		val = element.isDisplayed();
		return val;
	}

	public Boolean isEnable(WebElement element) {
		val = element.isEnabled();
		return val;
	}

	public Boolean isSelect(WebElement element) {
		val = element.isSelected();
		return val;
	}

	public void clickAction(WebElement element) {
		element.click();
	}
	public void submitAction(WebElement element) {
		element.submit();
	}

	public void clearAction(WebElement element) {
		element.clear();
	}

	public void getTextAction(WebElement element) {
		element.getText();
	}

	public void dropDownByText(WebElement element, String value) {
		text = new Select(element);
		text.selectByVisibleText(value);
	}

	public void dropDownByIndex(WebElement element, int value) {
		text = new Select(element);
		text.selectByIndex(value);
	}

	public void dropDownByValue(WebElement element, String value) {
		text = new Select(element);
		text.selectByValue(value);
	}

	public void quitBrowser() {
		driver.quit();
	}

}
