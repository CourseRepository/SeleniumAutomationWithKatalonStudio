import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://www.w3schools.com/html/html_tables.asp')

WebUI.waitForPageLoad(GlobalVariable.TimeOut)

WebUI.maximizeWindow()

rowTwoVariable = CustomKeywords.'com.helper.grid.GridHelper.GetValueFromGrid'(findTestObject('WebTableTestObject/WebTable'), 
    4, 3)

KeywordUtil.markWarning('This is from Webtable : ' + rowTwoVariable)

WebUI.delay(2)

WebUI.closeBrowser()

