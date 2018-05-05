package com.question

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
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class ClickAnyLink {
	private String createLinkXpath(String linkXpath) {
		return "//span[text()='"+linkXpath+"']"
	}

	private TestObject getLinkXpath(String linkName) {
		TestObject linkToCLick = new TestObject(linkName);
		println "getLinkXpath called"
/*		println("**********************"+linkToCLick)
		println("**********************"+createLinkXpath(linkName))
		linkToCLick.addProperty("xpath", ConditionType.EQUALS, createLinkXpath(linkName), true);
		println("**********************"+linkToCLick)
*/		return linkToCLick
	}
	@Keyword
	public void wrapperClick(String linkName){
		clickALink(linkName)
	}


	public void clickALink(String linkName) {
		/*TestObject linkToCLick = getLinkXpath(linkName);
		println("*********++++++++++++++*************"+linkToCLick)
		WebUI.waitForElementVisible(linkToCLick, GlobalVariable.GlobalDelay)
		WebUI.click(linkToCLick)
		WebUI.delay(5)*/
		println linkName
	}

}
