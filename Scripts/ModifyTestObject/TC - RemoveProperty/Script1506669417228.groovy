import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://192.168.1.106:5001/')

WebUI.waitForElementVisible(findTestObject('Bugzilla/HomePage/QuickSearchTextBox'), GlobalVariable.TimeOut)

new_Object = WebUI.removeObjectProperty(findTestObject('Bugzilla/HomePage/QuickSearchTextBox'), 'id')

// Add new property to test object
new_Object.addProperty("xpath", ConditionType.EQUALS, "//form[@id='quicksearchForm']//input[@name='quicksearch']", true)


WebUI.sendKeys(findTestObject('Bugzilla/HomePage/QuickSearchTextBox'), 'Before Remove')

WebUI.sendKeys(new_Object, 'After Remove')

WebUI.closeBrowser()

