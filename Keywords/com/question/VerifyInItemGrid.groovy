package com.question

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class VerifyInItemGrid {

	/**
	 * @param topDropDown :- Locator of the top drop down which have item count
	 * @param dropDownItemCount :- Count of the item present in the topDropDown
	 * @param gridItemTestObject :- Base locator for the item present in the grid
	 */

	@Keyword
	public void verifyItemInTheGrid(TestObject topDropDown,int dropDownItemCount,TestObject gridItemTestObject){
		WebUI.waitForElementVisible(topDropDown, GlobalVariable.TimeOut) // Wait for top drop down

		for (int dropDown = 0; dropDown < 3; dropDown++) { // for iterating each entry in the top drop down

			WebUI.selectOptionByIndex(topDropDown, dropDown) // Select the value one by one in the item count drop down

			WebUI.delay(2)

			// Get the count from the top drop down
			String itemGridCount = 	WebUI.getText(getTestObject('dropdown', 'xpath', ConditionType.EQUALS, topDropDown.getActiveProperties().get(0).getValue() + "/option[" + (dropDown + 1) + "]")).trim()

			// Get the base xpath for the item present in the result grid
			String itemGridXpath = gridItemTestObject.getActiveProperties().get(0).getValue()

			// Loop to iterate each element in the result grid
			// Check for visible , verify and then scroll to
			for (int i = 1; i <= Integer.parseInt(itemGridCount); i++) {

				if (!(WebUI.waitForElementVisible(getTestObject('Item', 'xpath', ConditionType.EQUALS, ((itemGridXpath + '[') +
				i) + ']'), 5))) { // Check for visible
					break
				}

				// Verify
				WebUI.verifyElementPresent(getTestObject('Item', 'xpath', ConditionType.EQUALS, ((itemGridXpath + '[') + i) + ']'),
						GlobalVariable.TimeOut)

				// Scroll to Element
				WebUI.scrollToElement(getTestObject('Item', 'xpath', ConditionType.EQUALS, ((itemGridXpath + '[') + i) + ']'), GlobalVariable.TimeOut)
			}
		}
	}

	// Method to create the test object @ run time
	private TestObject getTestObject(String objectId, String locator, ConditionType type, String locatorValue) {
		TestObject table = new TestObject(objectId)

		table.addProperty(locator, type, locatorValue, true)

		return table
	}

	@Keyword
	public void multipleTestObject(String str,TestObject objectOne,TestObject objectTwo,TestObject ObjectThree){
		println objectOne.toString()
		println objectTwo.toString()
		println ObjectThree.toString()
	}

}
