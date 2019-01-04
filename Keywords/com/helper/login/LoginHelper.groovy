package com.helper.login

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

/**
 * Open browser
 * Open Bugzila --> Get from Global variable
 * Click on File Bug link
 * Provide Username and Password
 * Click on Login
 * */

/*
 * Will read value from Global variable
 * Will accept the argument from the script
 * 
 * */

public class LoginHelper {

	@Keyword
	public void loginIntoApplication(String applicationUrl,String Username,String Password){

		WebUI.openBrowser(applicationUrl)
		WebUI.waitForPageLoad(GlobalVariable.TimeOut)
		WebUI.maximizeWindow()

		WebUI.waitForElementVisible(findTestObject('Object Repository/Bugzilla/HomePage/FlieBugLink'), GlobalVariable.TimeOut)
		WebUI.click(findTestObject('Object Repository/Bugzilla/HomePage/FlieBugLink'))

		WebUI.waitForElementVisible(findTestObject('Object Repository/Bugzilla/LoginPage/LoginBtn'), GlobalVariable.TimeOut)

		WebUI.sendKeys(findTestObject('Object Repository/Bugzilla/LoginPage/UsernameTxtBox'), Username)
		WebUI.sendKeys(findTestObject('Object Repository/Bugzilla/LoginPage/PasswordTxtBox'), Password)
		WebUI.click(findTestObject('Object Repository/Bugzilla/LoginPage/LoginBtn'))
		WebUI.delay(1)
	}

	@Keyword
	public void loginIntoApplicationWith(){
		loginIntoApplication(GlobalVariable.ApplicationUrl,GlobalVariable.Username,GlobalVariable.Password)
	}

	@Keyword
	public void logoutFromApplication(){
		WebUI.waitForElementVisible(findTestObject('Object Repository/Bugzilla/HomePage/LogoutBtn'), GlobalVariable.TimeOut)
		WebUI.click(findTestObject('Object Repository/Bugzilla/HomePage/LogoutBtn'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/Bugzilla/HomePage/FlieBugLink'), GlobalVariable.TimeOut)
		WebUI.closeBrowser()
	}
}
