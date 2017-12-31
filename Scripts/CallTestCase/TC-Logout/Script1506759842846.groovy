import com.kms.katalon.core.annotation.TearDown

@TearDown
void TearDown(){
	CustomKeywords.'com.helper.login.LoginHelper.logoutFromApplication'()
}



