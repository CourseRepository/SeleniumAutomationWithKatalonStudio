import com.kms.katalon.core.annotation.SetUp as SetUp
import internal.GlobalVariable as GlobalVariable

@SetUp
void Setup() {
    CustomKeywords.'com.helper.login.LoginHelper.loginIntoApplication'(Url, User, Pass)
	System.out.println(Url)
	System.out.println(User)
	System.out.println(Pass)
}

