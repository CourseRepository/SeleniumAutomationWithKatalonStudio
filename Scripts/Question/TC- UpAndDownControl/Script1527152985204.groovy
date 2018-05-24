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
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser("https://demos.telerik.com/aspnet-ajax/numerictextbox/overview/defaultcs.aspx")

WebUI.waitForPageLoad(60);

WebUI.maximizeWindow()

// Apporach one

TestObject upAndDownTxtBox = new TestObject("upAndDownTxtBox")
upAndDownTxtBox.addProperty("id", ConditionType.EQUALS, "ctl00_ContentPlaceholder1_RadNumericTextBox1")

WebUI.waitForElementClickable(upAndDownTxtBox, 60)

WebUI.sendKeys(upAndDownTxtBox, "3") // Directly sending key in text box

// Apporach Two click on up button to increase the value

WebUI.clearText(upAndDownTxtBox);

TestObject upButton = new TestObject("upButton")
upButton.addProperty("id", ConditionType.EQUALS, "ctl00_ContentPlaceholder1_RadNumericTextBox1_SpinUpButton")

for(int i = 0; i < 3; i++){
	WebUI.click(upButton)
	WebUI.delay(1)
}

WebUI.delay(3)

WebUI.closeBrowser()
	
