import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable


WebUI.openBrowser("http://192.168.1.106:5001/")

WebUI.waitForElementVisible(findTestObject('Object Repository/Bugzilla/HomePage/QuickSearchTextBox'), GlobalVariable.TimeOut)

//Get the test object
TestObject new_object = findTestObject('Object Repository/Bugzilla/HomePage/QuickSearchTextBox')


// Add new property to test object
new_object.addProperty("xpath", ConditionType.EQUALS, "//form[@id='quicksearchForm']//input[@name='quicksearch']", true)

// Uisng the object for Repo.
WebUI.sendKeys(findTestObject('Object Repository/Bugzilla/HomePage/QuickSearchTextBox'), "Old Test Object")

// Modified Test object
WebUI.sendKeys(new_object, "New Test Object")

WebUI.closeBrowser()
