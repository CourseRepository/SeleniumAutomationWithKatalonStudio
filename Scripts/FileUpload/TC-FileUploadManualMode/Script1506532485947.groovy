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

CustomKeywords.'com.helper.login.LoginHelper.loginIntoApplicationWith'()

WebUI.waitForElementVisible(findTestObject('Object Repository/Bugzilla/EnterBug/TestngProductLink'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('Object Repository/Bugzilla/EnterBug/TestngProductLink'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Bugzilla/EnterBugDetailScreen/Component'), GlobalVariable.TimeOut)

WebUI.selectOptionByValue(findTestObject('Object Repository/Bugzilla/EnterBugDetailScreen/Component'), 'Groups of groups', 
    false)

WebUI.sendKeys(findTestObject('Object Repository/Bugzilla/EnterBugDetailScreen/Summary'), 'TestNg Bug')

WebUI.sendKeys(findTestObject('Object Repository/Bugzilla/EnterBugDetailScreen/Description'), 'TestNg Bug')

WebUI.scrollToElement(findTestObject('Bugzilla/EnterBugDetailScreen/AddAnAttachment'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('Bugzilla/EnterBugDetailScreen/AddAnAttachment'))

WebUI.waitForElementVisible(findTestObject('Bugzilla/EnterBugDetailScreen/AttachmentDescription'), GlobalVariable.TimeOut)

WebUI.sendKeys(findTestObject('Bugzilla/EnterBugDetailScreen/AttachmentDescription'), description)

WebUI.uploadFile(findTestObject('Bugzilla/EnterBugDetailScreen/BrowseBtn'), 'C:\\Users\\Rahul\\Desktop\\Capture.PNG')

WebUI.delay(2)

WebUI.click(findTestObject('Bugzilla/EnterBugDetailScreen/SubmitBugButton'))

WebUI.waitForElementVisible(findTestObject('Bugzilla/EnterBugDetailScreen/Hardware'), GlobalVariable.TimeOut)

WebUI.verifyTextPresent('Bug \\d+', true)

WebUI.verifyTextPresent(description, false)


CustomKeywords.'com.helper.login.LoginHelper.logoutFromApplication'()

