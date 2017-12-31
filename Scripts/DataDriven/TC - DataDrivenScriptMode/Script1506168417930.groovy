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
import junit.framework.Assert

TestData excelData = findTestData('Data Files/ExcelDataSource/EnterBugTestData')

System.out.println("[Row Count] : " + excelData.getRowNumbers())

for(int i = 1; i <= excelData.getRowNumbers(); i++){
	
	// i = 1 => Row 1
	// i = 2 => Row 2
	
	WebUI.waitForElementVisible(findTestObject('Bugzilla/EnterBug/TestngProductLink'), GlobalVariable.TimeOut)
	
	WebUI.click(findTestObject('Bugzilla/EnterBug/TestngProductLink'))
	
	WebUI.waitForElementVisible(findTestObject('Bugzilla/EnterBugDetailScreen/Component'), GlobalVariable.TimeOut)
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/Bugzilla/EnterBugDetailScreen/Component'), excelData.getValue("Component", i), false)
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/Bugzilla/EnterBugDetailScreen/Version'), excelData.getValue("Version", i), false)
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/Bugzilla/EnterBugDetailScreen/Severity'), excelData.getValue("Severity", i), false)
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/Bugzilla/EnterBugDetailScreen/Hardware'), excelData.getValue("Hardware", i), false)
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/Bugzilla/EnterBugDetailScreen/Os'), excelData.getValue("Os", i), false)
	
	WebUI.sendKeys(findTestObject('Object Repository/Bugzilla/EnterBugDetailScreen/Summary'), excelData.getValue("Summary", i))
	
	WebUI.sendKeys(findTestObject('Object Repository/Bugzilla/EnterBugDetailScreen/Description'), excelData.getValue("Description", i))
	
	WebUI.click(findTestObject('Object Repository/Bugzilla/EnterBugDetailScreen/SubmitBugButton'))
	
	WebUI.waitForElementVisible(findTestObject('Object Repository/Bugzilla/EnterBugDetailScreen/Hardware'), GlobalVariable.TimeOut)
	
	WebUI.verifyTextNotPresent("Bug //d+", true)
	
	if(i == 3){
		Assert.fail();
	}
		
	
	WebUI.click(findTestObject('Object Repository/Bugzilla/BugSubmitted/NewMenuItem'))
}




@com.kms.katalon.core.annotation.SetUp
void SetUp() {
    CustomKeywords.'com.helper.login.LoginHelper.loginIntoApplicationWith'()
}

@com.kms.katalon.core.annotation.TearDown
void TearDown() {
    CustomKeywords.'com.helper.login.LoginHelper.logoutFromApplication'()
}

