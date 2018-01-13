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

WebUI.openBrowser('https://www.w3schools.com/bootstrap/tryit.asp?filename=trybs_ref_comp_dropdown-header&stacked=h')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(30)

// Wait for BootStrap Combo box
'Wait for BootStrap Combo box'
WebUI.waitForElementVisible(findTestObject('Object Repository/BootStrapcombo/DropDown'), 30)

// Click on the BootStrap Combo box
'Click on the BootStrap Combo box'
WebUI.click(findTestObject('Object Repository/BootStrapcombo/DropDown'))

// Wait for the menuitem to b visible
'Wait for the menuitem to b visible'
WebUI.waitForElementVisible(findTestObject('Object Repository/BootStrapcombo/MenuItem/JavaScript'), 30)

// Click on Menu Item
'Click on Menu Item'
WebUI.click(findTestObject('Object Repository/BootStrapcombo/MenuItem/JavaScript'))

WebUI.comment('Closing of browser is in Listener')

