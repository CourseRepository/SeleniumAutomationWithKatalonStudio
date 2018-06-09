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
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://focis.agility.com/pages/qm/multiquote/multiquotecarrierratesearchlspg.aspx?q=cGFnZWlkfE11bHRpUXVvdGVDYXJyaWVyUmF0ZVNlYXJjaExzUGcmYWN0aW9uaWR8T3BlblFNTVFTZWFyY2gmYWN0aW9uY3JpdGVyaWF8JTdiU0lEJTNhMTA3JTJjQnV0dG9uTmFtZSUzYSUyN1NlYXJjaCUyNyU3ZCZuZXh0YWN0aW9uY3JpdGVyaWF8JklzUG9wdXBQYWdlfGZhbHNlJnBnY2hpZHxlMmE4YjJkNjRhZTI0MDJiYTVkNGZjMmM4MGJiODljYV9jdXE0anN1YmRuajJucXBlaDUwZ2piYW8mVXNlckxhbmd1YWdlfCY%3d-DHkppmmCHFU%3d')

WebUI.waitForPageLoad(30)

WebUI.maximizeWindow()

WebElement element = WebUiCommonHelper.findWebElement(null, GlobalVariable.TimeOut)





CustomKeywords.'com.question.UniqueSelection.SelectCheckBox'()

