import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.ApplicationUrl)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('Bugzilla/HomePage/FlieBugLink'), GlobalVariable.TimeOut)

CustomKeywords.'com.helper.javascript.JavaScriptHelper.executeScript'('alert(\'Hi this is JavaScript!\')')

WebUI.waitForAlert(GlobalVariable.TimeOut)

WebUI.acceptAlert()

WebUI.closeBrowser()

