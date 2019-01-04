package com.helper.javascript

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory

import internal.GlobalVariable

public class JavaScriptHelper {


	// To get implementation for webdriver api from KS
	WebDriver driver = DriverFactory.getWebDriver()

	//To get the instance of Java Script executor interface
	JavascriptExecutor executor = ((JavascriptExecutor)driver)

	@Keyword
	public void executeScript(String script){
		KeywordUtil.logInfo("[Java Script ] : " + script)
		executor.executeScript(script)
	}

	@Keyword
	public void executeScriptOnTestObject(String string,TestObject testObject){
		// Converting test object to webelement
		KeywordUtil.logInfo("[Java Script ] : " + string)
		try{
			WebElement element = WebUiCommonHelper.findWebElement(testObject, GlobalVariable.TimeOut)
			executor.executeScript(string, element)
		}catch(Exception ex){
			KeywordUtil.markErrorAndStop("[Custom Keyword Error] : " + ex.toString())
		}


	}

	@Keyword
	public Object executeAndReturnValue(String script,TestObject testObject){
		WebElement element = WebUiCommonHelper.findWebElement(testObject, GlobalVariable.TimeOut)
		// Will execute the js and retrun the value also
		return executor.executeScript(script, element)
	}

}
