package com.question

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.sun.org.apache.xpath.internal.compiler.Keywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class VerifyAllElements {
	
	public static String getAbsoluteXPath(WebDriver driver,WebElement element) {
		return (String) ((JavascriptExecutor) driver).executeScript(
				"function absoluteXPath(element) {"+
				"var comp, comps = [];"+
				"var parent = null;"+
				"var xpath = '';"+
				"var getPos = function(element) {"+
				"var position = 1, curNode;"+
				"if (element.nodeType == Node.ATTRIBUTE_NODE) {"+
				"return null;"+
				"}" +
				"for (curNode = element.previousSibling; curNode; curNode = curNode.previousSibling){"
				+
				"if (curNode.nodeName == element.nodeName) {"+
				"++position;"+
				"}"+
				"}"+
				"return position;"+
				"};"+

				"if (element instanceof Document) {"+
				"return '/';"+
				"}"+

				"for (; element && !(element instanceof Document); element = element.nodeType == Node.ATTRIBUTE_NODE ? element.ownerElement : element.parentNode) {"+
				"comp = comps[comps.length] = {};"+
				"switch (element.nodeType) {"+
				"case Node.TEXT_NODE:"+
				"comp.name = 'text()';"+
				"break;"+
				"case Node.ATTRIBUTE_NODE:"+
				"comp.name = '@' + element.nodeName;"+
				"break;"+
				"case Node.PROCESSING_INSTRUCTION_NODE:"+
				"comp.name = 'processing-instruction()';"+
				"break;"+
				"case Node.COMMENT_NODE:"+
				"comp.name = 'comment()';"+
				"break;"+
				"case Node.ELEMENT_NODE:"+
				"comp.name = element.nodeName;"+
				"break;"+
				"}"+
				"comp.position = getPos(element);"+
				"}"+

				"for (var i = comps.length - 1; i >= 0; i--) {"+
				"comp = comps[i];"+
				"xpath += '/' + comp.name.toLowerCase();"+
				"if (comp.position !== null) {"+
				"xpath += '[' + comp.position + ']';"+
				"}"+
				"}"+

				"return xpath;"+

				"} return absoluteXPath(arguments[0]);", element);
	}
	
	private TestObject getTestObject(String objectId,String locator,ConditionType type,String locatorValue){
		TestObject table = new TestObject(objectId)
		table.addProperty(locator, type, locatorValue,true)
		return table
	}
	
	private void verify(TestObject testObject){
		if(WebUI.waitForElementPresent(testObject, 5)){
			WebUI.scrollToElement(testObject, 5)
			WebUI.verifyElementPresent(testObject, 5)
		}
		else{
			KeywordUtil.markWarning("Test Object not Found : " + testObject.toString())
		}
	}
	
	@Keyword
	public void scrollAndVerfiyElement(String tagName){
		WebDriver driver =  DriverFactory.getWebDriver();
		
		List<WebElement> elements = driver.findElements(By.tagName(tagName))
		
		for(WebElement element : elements){
			String xpath = getAbsoluteXPath(driver,element)
			println xpath
			TestObject testObject = getTestObject("Item", "xpath", ConditionType.EQUALS, xpath)
			
		}
		
	}

}
