import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.waitForElementVisible(findTestObject('Bugzilla/EnterBug/TestngProductLink'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('Bugzilla/EnterBug/TestngProductLink'))

WebUI.waitForElementVisible(findTestObject('Bugzilla/EnterBugDetailScreen/Component'), GlobalVariable.TimeOut)

WebUI.selectOptionByValue(findTestObject('Bugzilla/EnterBugDetailScreen/Component'), findTestData('ExcelDataSource/EnterBugTestData').getValue(
        1, 1), false)

WebUI.selectOptionByValue(findTestObject('Bugzilla/EnterBugDetailScreen/Version'), findTestData('ExcelDataSource/EnterBugTestData').getValue(
        2, 1), false)

WebUI.selectOptionByValue(findTestObject('Bugzilla/EnterBugDetailScreen/Severity'), findTestData('ExcelDataSource/EnterBugTestData').getValue(
        3, 1), false)

WebUI.selectOptionByValue(findTestObject('Bugzilla/EnterBugDetailScreen/Hardware'), findTestData('ExcelDataSource/EnterBugTestData').getValue(
        4, 1), false)

WebUI.selectOptionByValue(findTestObject('Bugzilla/EnterBugDetailScreen/Os'), findTestData('ExcelDataSource/EnterBugTestData').getValue(
        5, 1), false)

WebUI.sendKeys(findTestObject('Bugzilla/EnterBugDetailScreen/Summary'), findTestData('ExcelDataSource/EnterBugTestData').getValue(
        6, 1), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Bugzilla/EnterBugDetailScreen/Description'), findTestData('ExcelDataSource/EnterBugTestData').getValue(
        7, 1))

WebUI.click(findTestObject('Bugzilla/EnterBugDetailScreen/SubmitBugButton'))

WebUI.waitForElementVisible(findTestObject('Bugzilla/EnterBugDetailScreen/Hardware'), GlobalVariable.TimeOut)

WebUI.verifyTextPresent('Bug \\d+', true)

@com.kms.katalon.core.annotation.SetUp
def SetUp() {
    CustomKeywords.'com.helper.login.LoginHelper.loginIntoApplicationWith'()
}

@com.kms.katalon.core.annotation.TearDown
def TearDown() {
    CustomKeywords.'com.helper.login.LoginHelper.logoutFromApplication'()
}

