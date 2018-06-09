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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://tiportal-url1.itg.ti.com/portal/dt?provider=TIPassLoginSingleContainer&amp;o2=2&amp;goto=https://starfish3-test.itg.ti.com')

WebUI.setText(findTestObject('Upload a file/Page_TI-pass Login/input_fld2'), 'x0258798')

WebUI.setText(findTestObject('Upload a file/Page_TI-pass Login/input_fld5'), 'abcd1234')

WebUI.sendKeys(findTestObject('Upload a file/Page_TI-pass Login/input_fld5'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Upload a file/Page_NOTICE/input_Continue'))

WebUI.doubleClick(findTestObject('Upload a file/Page_Starfish/span_CAS'))

WebUI.click(findTestObject('Upload a file/Page_Starfish/span_OTHER'))

WebUI.click(findTestObject('Upload a file/Page_Starfish/span_SANDBOX'))

WebUI.click(findTestObject('Upload a file/Page_Starfish/span_Athena_Test'))

WebUI.rightClick(findTestObject('Upload a file/Page_Starfish/input_Datasheet'))

WebUI.click(findTestObject('Upload a file/Page_Starfish/input_Data Management'))

WebUI.click(findTestObject('Upload a file/Page_Starfish/input_Biswal Akash'))

WebUI.click(findTestObject('Upload a file/Page_Starfish/svg'))

WebUI.click(findTestObject('Upload a file/Page_Starfish/div_mat-select-arrow'))

WebUI.click(findTestObject('Upload a file/Page_Starfish/span_SIM-CORNERS'))

WebUI.click(findTestObject('Upload a file/Page_Starfish/span_BROWSE'))

WebUI.click(findTestObject('Upload a file/Page_Starfish/span_SUBMIT'))

WebUI.click(findTestObject('Upload a file/Page_Starfish/svg_1'))

WebUI.click(findTestObject('Upload a file/Page_Starfish/span_Logout'))

WebUI.closeBrowser()