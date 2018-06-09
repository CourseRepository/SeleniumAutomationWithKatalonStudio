package com.helper.grid

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

public class GridHelper {

	/**
	 * 1. Test Object for the web table
	 * 2. Row Index
	 * 3. Column Index
	 *
	 * */

	private TestObject getTestObject(TestObject baseTestObject,String xpath){
		/*
		 * 1. Get the base xpath from the test object
		 * 2. Append the additional xpath
		 * 3. Create a new Test Object
		 * 4. return the updated test object
		 * 
		 * */

		String baseXpath = baseTestObject.getProperties().get(0).getValue();
		String updatedXpath = baseXpath + xpath;

		TestObject updatedTestObject = new TestObject("Grid")
		updatedTestObject.addProperty("xpath", ConditionType.EQUALS, updatedXpath)
		return updatedTestObject
	}

	@Keyword
	public String GetValueFromGrid(TestObject baseTestObject,int rowIndex,int colIndex){
		TestObject updatedTestObject = getTestObject(baseTestObject,"/tr[" + rowIndex+  "]/td[" + colIndex + "]")
		return WebUI.getText(updatedTestObject)
	}

	@Keyword
	public String getValueOrClickOnColumn(TestObject baseTestObject,int rowIndex,int colIndex,String type){
		/**
		 * Type = CheckBox //table[@role='grid']/tbody - base xpath --- /tr[index]/td[index]/input
		 * Type = Button //table[@role='grid']/tbody - base xpath --- /tr[index]/td[index]/a
		 * Type = Value //table[@role='grid']/tbody/tr[3]/td[3]
		 * */


		TestObject updatedTestObject = null

		if("CheckBox".equalsIgnoreCase(type)){
			updatedTestObject = getTestObject(baseTestObject,"/tr[" + rowIndex+  "]/td[" + colIndex + "]/input")
			WebUI.click(updatedTestObject)
			return ""
		}else if("Button".equalsIgnoreCase(type)){
			updatedTestObject = getTestObject(baseTestObject,"/tr[" + rowIndex+  "]/td[" + colIndex + "]/a")
			WebUI.click(updatedTestObject)
			return ""
		}else {
			updatedTestObject = getTestObject(baseTestObject,"/tr[" + rowIndex+  "]/td[" + colIndex + "]")
			return WebUI.getText(updatedTestObject)
		}
	}
}
