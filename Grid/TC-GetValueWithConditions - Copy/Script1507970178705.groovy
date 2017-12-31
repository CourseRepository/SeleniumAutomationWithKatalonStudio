import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

if ('CheckBox'.equalsIgnoreCase(Type)) {
    WebUI.openBrowser('http://demos.telerik.com/kendo-ui/grid/checkbox-selection')

    WebUI.waitForPageLoad(GlobalVariable.TimeOut)

    WebUI.maximizeWindow()

    CustomKeywords.'com.helper.grid.GridHelper.getValueOrClickOnColumn'(findTestObject('WebTableTestObject/WebTableWithComponenet'), 
        2, 1, 'CheckBox')

    WebUI.delay(2)
}

if ('Button'.equalsIgnoreCase(Type)) {
    WebUI.openBrowser('http://demos.telerik.com/kendo-ui/grid/editing')

    WebUI.waitForPageLoad(GlobalVariable.TimeOut)

    CustomKeywords.'com.helper.grid.GridHelper.getValueOrClickOnColumn'(findTestObject('WebTableTestObject/WebTableWithComponenet'), 
        2, 5, 'Button')

    WebUI.waitForAlert(GlobalVariable.TimeOut)

    WebUI.acceptAlert()
}

if (''.equals(Type)) {
    WebUI.openBrowser('http://demos.telerik.com/kendo-ui/grid/editing')

    WebUI.waitForPageLoad(GlobalVariable.TimeOut)

    rowTwoVariable = CustomKeywords.'com.helper.grid.GridHelper.getValueOrClickOnColumn'(findTestObject('WebTableTestObject/WebTableWithComponenet'), 
        2, 2, '')

    KeywordUtil.markWarning('This is from Webtable : ' + rowTwoVariable)
}

WebUI.closeBrowser()

