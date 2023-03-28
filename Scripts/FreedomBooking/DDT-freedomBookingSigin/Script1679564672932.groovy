import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(baseurl)

WebUI.click(findTestObject('Object Repository/FreedomBooking/Page_Freedom Travel/button_Sign In'))

WebUI.setText(findTestObject('Object Repository/FreedomBooking/Page_Freedom Travel/input_Email_email'), invalidEmail)

WebUI.setText(findTestObject('FreedomBooking/Page_Freedom Travel/input_sign up for trial_password'), invalidPass)

WebUI.click(findTestObject('Object Repository/FreedomBooking/Page_Freedom Travel/button_Sign In_1'))

WebUI.verifyTextPresent('Invalid Credentials', false)

WebUI.delay(0)

WebUI.setText(findTestObject('Object Repository/FreedomBooking/Page_Freedom Travel/input_Email_email'), email)

WebUI.setText(findTestObject('FreedomBooking/Page_Freedom Travel/input_sign up for trial_password'), pass)

WebUI.click(findTestObject('Object Repository/FreedomBooking/Page_Freedom Travel/button_Sign In_1'))

WebUI.verifyElementPresent(findTestObject('FreedomBooking/Page_Freedom Travel/LoggedinDropdown'), 0)

WebUI.delay(0)

WebUI.closeBrowser()

