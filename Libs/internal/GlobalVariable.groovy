package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object ApplicationUrl
     
    /**
     * <p></p>
     */
    public static Object Username
     
    /**
     * <p></p>
     */
    public static Object Password
     
    /**
     * <p></p>
     */
    public static Object DelayTime
     
    /**
     * <p>Profile default : Explicit Wait Timeout</p>
     */
    public static Object TimeOut
     
    /**
     * <p></p>
     */
    public static Object Path
     
    /**
     * <p></p>
     */
    public static Object Name
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['ApplicationUrl' : 'http://192.168.1.108:5001/', 'Username' : 'rahul@bugzila.com', 'Password' : 'welcome', 'DelayTime' : 3, 'TimeOut' : 40, 'Path' : 'D:\\src\\', 'Name' : 'test'])
        allVariables.put('stage', allVariables['default'] + [:])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        ApplicationUrl = selectedVariables['ApplicationUrl']
        Username = selectedVariables['Username']
        Password = selectedVariables['Password']
        DelayTime = selectedVariables['DelayTime']
        TimeOut = selectedVariables['TimeOut']
        Path = selectedVariables['Path']
        Name = selectedVariables['Name']
        
    }
}
