import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://www.google.co.za')
WebUI.waitForPageLoad(30)
WebUI.maximizeWindow()
WebUI.closeBrowser()