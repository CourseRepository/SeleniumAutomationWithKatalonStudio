package com.helper.navigate

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class NavigationHelper {
	
	private String getMenuItemXpath(String menuName){
		return ".//*[@id='header']//a[text()='" + menuName + "']"
	}
	
	// xpath will get generated during the run time
	// I need to create test object during run time
	// For creating test object one can use TestObject class
	
	private TestObject getMenuTestObject(String menuName){
		TestObject menuItem = new TestObject(menuName);
		menuItem.addProperty("xpath", ConditionType.EQUALS, getMenuItemXpath(menuName), true);
		System.out.println("Xpath : " + getMenuItemXpath(menuName))
		return menuItem
	}
	
	
	@Keyword
	public void navigateToMenuItem(String menuName){
		TestObject menuItem = getMenuTestObject(menuName)
		WebUI.waitForElementVisible(menuItem, GlobalVariable.TimeOut)
		WebUI.click(menuItem)
		WebUI.delay(1)
	}
}
