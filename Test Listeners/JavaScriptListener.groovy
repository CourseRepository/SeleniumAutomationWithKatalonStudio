import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.After

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class JavaScriptListener {
	
	@BeforeTestSuite
	public void beforeTestSuiteListener(TestSuiteContext testSuite){
		WebUI.openBrowser('https://www.w3schools.com/js/js_popup.asp')
		WebUI.waitForPageLoad(GlobalVariable.TimeOut)
		WebUI.maximizeWindow()
		KeywordUtil.markWarning("Before Test Suite Listener : " + testSuite.getTestSuiteId())
	}
	
	//@AfterTestCase
	public void afterTestCase(TestCaseContext testCase){
		WebUI.switchToDefaultContent()
		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
		/*KeywordUtil.markWarning("Test Case Name : " + testCase.getTestCaseId())
		KeywordUtil.markWarning("Test Case Status : " + testCase.getTestCaseStatus())
		*/
		
		if("PASSED".equalsIgnoreCase(testCase.getTestCaseStatus())){
			println WebUI.takeScreenshot()
		}
	}
	
	@AfterTestSuite
	public void afterTestSuite(TestSuiteContext testSuite){
		WebUI.closeBrowser()
		KeywordUtil.markWarning("After Test Suite Listener : " + testSuite.getTestSuiteId())
	}
	
//	/@AfterTestCase
	public void closeBrowser(){
		WebUI.switchToDefaultContent()
		WebUI.closeBrowser()
	}
	
	
}