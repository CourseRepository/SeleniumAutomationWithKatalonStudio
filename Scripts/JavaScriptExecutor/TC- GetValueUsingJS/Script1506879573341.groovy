import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.ApplicationUrl)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('Bugzilla/HomePage/FlieBugLink'), GlobalVariable.TimeOut)

WebUI.sendKeys(findTestObject('Bugzilla/HomePage/QuickSearchTextBox'), 'This is Quick Search Text Box')

WebUI.delay(1)

value = CustomKeywords.'com.helper.javascript.JavaScriptHelper.executeAndReturnValue'('return arguments[0].value;', findTestObject(
        'Bugzilla/HomePage/QuickSearchTextBox'))

System.out.println(value)

WebUI.delay(2)

WebUI.closeBrowser()

