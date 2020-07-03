package com.mmt.genericLib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

public class WebDriverCommonLib extends BaseTest {

		public String getPageTitle() 
		{
			return driver.getTitle();
		}
		
		public void verify(String actual, String expected, String pagename)
		{
			
			Assert.assertEquals(actual, expected, pagename);
			Reporter.log(pagename+" is dispalyed",true);
		}
		
		public void mouseHover(WebElement target)
		{
			Actions ac=new Actions(driver);
			ac.moveToElement(target).perform();
		}
		public void downKeyAction() throws AWTException, InterruptedException
		{
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_ENTER);

		}
		public void scrollThePageToElement(Point location)
		{
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy"+location);
			}
		
		public void scrollUp()
		{
			
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,-7500)");
			}
	}


