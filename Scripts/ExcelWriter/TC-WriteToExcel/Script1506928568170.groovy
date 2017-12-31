import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.ApplicationUrl)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('Bugzilla/HomePage/QuickSearchTextBox'), GlobalVariable.TimeOut)

WebUI.sendKeys(findTestObject('Bugzilla/HomePage/QuickSearchTextBox'), 'This is Excel Writer')

WebUI.delay(1)

ui_variable = WebUI.getAttribute(findTestObject('Bugzilla/HomePage/QuickSearchTextBox'), 'value')

System.out.println(ui_variable)

CustomKeywords.'com.helper.excel.ExcelHelper.writeTOExcelFile'('C:\\Users\\Rahul\\Downloads\\poi-bin-3.17-20170915\\poi-3.17\\test.xlsx', 
    'TestData', ui_variable, 1, 1)

WebUI.delay(1)

WebUI.closeBrowser()

