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

WebUI.openBrowser(GlobalVariable.ApplicationUrl)

WebUI.waitForPageLoad(GlobalVariable.TimeOut)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Bugzilla/HomePage/FlieBugLink'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Bugzilla/LoginPage/LoginBtn'), GlobalVariable.TimeOut)

WebUI.sendKeys(findTestObject('Object Repository/Bugzilla/LoginPage/UsernameTxtBox'), GlobalVariable.Username)

WebUI.sendKeys(findTestObject('Object Repository/Bugzilla/LoginPage/PasswordTxtBox'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Bugzilla/LoginPage/LoginBtn'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Bugzilla/EnterBug/TestProductLink'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('Object Repository/Bugzilla/EnterBug/TestProductLink'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Bugzilla/EnterBugDetailScreen/Severity'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('Object Repository/Bugzilla/HomePage/LogoutBtn'))

WebUI.closeBrowser()
