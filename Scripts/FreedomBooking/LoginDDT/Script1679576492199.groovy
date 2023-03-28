import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://freedom.travel/')

WebUI.click(findTestObject('Object Repository/FreedomBooking/Login/Page_Freedom Travel/button_Sign In'))

WebUI.setText(findTestObject('Object Repository/FreedomBooking/Login/Page_Freedom Travel/input_Email_email'), email)

WebUI.setText(findTestObject('Object Repository/FreedomBooking/Login/Page_Freedom Travel/input_Password_password'), password)

WebUI.click(findTestObject('Object Repository/FreedomBooking/Login/Page_Freedom Travel/button_Sign In_1'))

String result = 'Test'

if (WebUI.verifyTextPresent('Invalid Credentials', false, FailureHandling.CONTINUE_ON_FAILURE)) {
    result = 'Failed'

    System.out.println(result)
} else if (WebUI.verifyElementPresent(findTestObject('Object Repository/FreedomBooking/Login/Page_Freedom Travel/span_Test'), 0, FailureHandling.CONTINUE_ON_FAILURE)) {
    result = 'Passed'

    System.out.println(result)
}

System.out.println(result)

//CustomKeywords.'WriteExcelRow.demoKey'(result)
//CustomKeywords.'WriteExcelColumn.demoKey'(result)

CustomKeywords.'WriteExcelColumnWhile.demoKey'(result)

WebUI.closeBrowser()



