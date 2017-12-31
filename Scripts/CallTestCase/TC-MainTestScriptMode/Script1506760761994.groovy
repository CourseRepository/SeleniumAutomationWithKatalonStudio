import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.annotation.SetUp as SetUp
import com.kms.katalon.core.annotation.TearDown as TearDown
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Test Cases/CallTestCase/TC-BugDetails'), null)

@SetUp
void setUp() {
    WebUI.callTestCase(findTestCase('Test Cases/CallTestCase/TC-Login'), [('Username') : GlobalVariable.Username, ('Password') : GlobalVariable.Password
            , ('applicationUrl') : GlobalVariable.ApplicationUrl], FailureHandling.STOP_ON_FAILURE)
}

@TearDown
void TearDown() {
    WebUI.callTestCase(findTestCase('Test Cases/CallTestCase/TC-Logout'), null, FailureHandling.STOP_ON_FAILURE)
}

