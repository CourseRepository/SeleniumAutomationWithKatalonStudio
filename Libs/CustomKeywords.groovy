
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject


def static "com.helper.login.LoginHelper.loginIntoApplication"(
    	String applicationUrl	
     , 	String Username	
     , 	String Password	) {
    (new com.helper.login.LoginHelper()).loginIntoApplication(
        	applicationUrl
         , 	Username
         , 	Password)
}

def static "com.helper.login.LoginHelper.loginIntoApplicationWith"() {
    (new com.helper.login.LoginHelper()).loginIntoApplicationWith()
}

def static "com.helper.login.LoginHelper.logoutFromApplication"() {
    (new com.helper.login.LoginHelper()).logoutFromApplication()
}

def static "com.question.CustomDatabase.executeQuery"(
    	String connectionUrl	
     , 	String query	) {
    (new com.question.CustomDatabase()).executeQuery(
        	connectionUrl
         , 	query)
}

def static "com.helper.excel.ExcelHelper.writeTOExcelFile"(
    	String excelPath	
     , 	String sheetName	
     , 	String value	
     , 	int rowNo	
     , 	int colNo	) {
    (new com.helper.excel.ExcelHelper()).writeTOExcelFile(
        	excelPath
         , 	sheetName
         , 	value
         , 	rowNo
         , 	colNo)
}

def static "com.helper.javascript.JavaScriptHelper.executeScript"(
    	String script	) {
    (new com.helper.javascript.JavaScriptHelper()).executeScript(
        	script)
}

def static "com.helper.javascript.JavaScriptHelper.executeScriptOnTestObject"(
    	String string	
     , 	TestObject testObject	) {
    (new com.helper.javascript.JavaScriptHelper()).executeScriptOnTestObject(
        	string
         , 	testObject)
}

def static "com.helper.javascript.JavaScriptHelper.executeAndReturnValue"(
    	String script	
     , 	TestObject testObject	) {
    (new com.helper.javascript.JavaScriptHelper()).executeAndReturnValue(
        	script
         , 	testObject)
}

def static "com.question.CustomSendKeys.TypeInText"(
    	TestObject aLocator	
     , 	String text	) {
    (new com.question.CustomSendKeys()).TypeInText(
        	aLocator
         , 	text)
}

def static "com.question.CustomSendKeys.TypeInTextBoxWithWait"(
    	TestObject aLocator	
     , 	String text	
     , 	int timeOutInSeconds	) {
    (new com.question.CustomSendKeys()).TypeInTextBoxWithWait(
        	aLocator
         , 	text
         , 	timeOutInSeconds)
}

def static "com.helper.browserhelper.CustomBrowser.openBrowser"() {
    (new com.helper.browserhelper.CustomBrowser()).openBrowser()
}

def static "com.helper.browserhelper.CustomBrowser.openBrowserWithUrl"(
    	String url	) {
    (new com.helper.browserhelper.CustomBrowser()).openBrowserWithUrl(
        	url)
}

def static "com.helper.browserhelper.CustomBrowser.closeBrowser"() {
    (new com.helper.browserhelper.CustomBrowser()).closeBrowser()
}

def static "com.question.VerifyAllElements.scrollAndVerfiyElement"(
    	String tagName	) {
    (new com.question.VerifyAllElements()).scrollAndVerfiyElement(
        	tagName)
}

def static "com.question.VerifyInItemGrid.verifyItemInTheGrid"(
    	TestObject topDropDown	
     , 	int dropDownItemCount	
     , 	TestObject gridItemTestObject	) {
    (new com.question.VerifyInItemGrid()).verifyItemInTheGrid(
        	topDropDown
         , 	dropDownItemCount
         , 	gridItemTestObject)
}

def static "com.question.VerifyInItemGrid.multipleTestObject"(
    	String str	
     , 	TestObject objectOne	
     , 	TestObject objectTwo	
     , 	TestObject ObjectThree	) {
    (new com.question.VerifyInItemGrid()).multipleTestObject(
        	str
         , 	objectOne
         , 	objectTwo
         , 	ObjectThree)
}

def static "com.question.UniqueSelection.SelectCheckBox"() {
    (new com.question.UniqueSelection()).SelectCheckBox()
}

def static "com.question.CustomJsonParser.jsonExtractor"(
    	String response	) {
    (new com.question.CustomJsonParser()).jsonExtractor(
        	response)
}

def static "com.question.GetMetrics.getAlarmsCountfromGA"() {
    (new com.question.GetMetrics()).getAlarmsCountfromGA()
}

def static "com.question.RandomEmail.getEmail"(
    	String suffix	
     , 	String prefix	) {
    (new com.question.RandomEmail()).getEmail(
        	suffix
         , 	prefix)
}

def static "com.question.ClickAnyLink.wrapperClick"(
    	String linkName	) {
    (new com.question.ClickAnyLink()).wrapperClick(
        	linkName)
}

def static "com.helper.navigate.NavigationHelper.navigateToMenuItem"(
    	String menuName	) {
    (new com.helper.navigate.NavigationHelper()).navigateToMenuItem(
        	menuName)
}

def static "com.helper.grid.GridHelper.GetValueFromGrid"(
    	TestObject baseTestObject	
     , 	int rowIndex	
     , 	int colIndex	) {
    (new com.helper.grid.GridHelper()).GetValueFromGrid(
        	baseTestObject
         , 	rowIndex
         , 	colIndex)
}

def static "com.helper.grid.GridHelper.getValueOrClickOnColumn"(
    	TestObject baseTestObject	
     , 	int rowIndex	
     , 	int colIndex	
     , 	String type	) {
    (new com.helper.grid.GridHelper()).getValueOrClickOnColumn(
        	baseTestObject
         , 	rowIndex
         , 	colIndex
         , 	type)
}

def static "com.question.BrowserTab.openNewTab"() {
    (new com.question.BrowserTab()).openNewTab()
}

def static "com.question.UniqueScreenShot.takeScreenShot"(
    	String path	
     , 	String name	) {
    (new com.question.UniqueScreenShot()).takeScreenShot(
        	path
         , 	name)
}
