package com.sel.sample;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class FlipcartTest {
	
	Base base = new Base();
	WebElement locator;
	String link="https://www.facebook.com/";
	
	@Test
	public void test1() throws InterruptedException{
		base.getChromeDriver();
		base.getURL(link);
		locator=base.nameLocator("firstname");
		base.sendKeyAction(locator, "Rahul");
		locator=base.nameLocator("lastname");
		base.sendKeyAction(locator, "Dravid");
		Thread.sleep(1000);
		base.quitBrowser();
		
	}
	
	@Test
	public void test2() throws InterruptedException{
		base.getChromeDriver();
		base.getURL(link);
		locator=base.nameLocator("reg_email__");
		base.sendKeyAction(locator, "977777777");
		Thread.sleep(1000);
		base.quitBrowser();
		
	}

}
