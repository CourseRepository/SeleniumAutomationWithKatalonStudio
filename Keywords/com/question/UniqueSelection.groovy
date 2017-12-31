package com.question

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class UniqueSelection {
	
	private String tableXpath = "//table[@id='draggable']//tbody" 
	private Map<String,Integer> uniqueStore = new HashMap<String, Integer>()
	private int MOPColumn = 7
	private int MDPColumn = 10
	private int CheckBoxColumn = 1
	
	private String getColumnText(TestObject testObject){
		return WebUI.getText(testObject)
	}
	
	
	private TestObject getTestObject(String objectId,String locator,ConditionType type,String locatorValue){
		TestObject table = new TestObject(objectId)
		table.addProperty(locator, type, locatorValue,true)
		return table
	}
	
	private boolean isDuplicate(String key){
		if(uniqueStore.containsKey(key)){
			return true;
		}
		uniqueStore.put(key, 1)
		return false
	}
	
	@Keyword
	public void SelectCheckBox(){
		int row = 1;
		while (WebUI.waitForElementPresent(getTestObject("Table","xpath",ConditionType.EQUALS,tableXpath + "/tr[" + row +  "]"), 5)) {
			String mop = getColumnText(getTestObject("MOP", "xpath", ConditionType.EQUALS, tableXpath +"/tr[" + row +"]/td[" + MOPColumn + "]"))
			String mdp = getColumnText(getTestObject("MOP", "xpath", ConditionType.EQUALS, tableXpath +"/tr[" + row +"]/td[" + MDPColumn + "]"))
			
			if(!isDuplicate(mop.toLowerCase() + mdp.toLowerCase())){
				WebUI.click(getTestObject("Checkbox", "xpath", ConditionType.EQUALS, tableXpath + "/tr[" + row +"]/td[" + CheckBoxColumn + "]"))
			}
			(row)++
		}
	}
}
