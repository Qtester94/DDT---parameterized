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

WebUI.navigateToUrl('https://freedom.travel/')

WebUI.click(findTestObject('Object Repository/FreedomBooking/Page_Freedom Travel/Page_Freedom Travel/a_About Us'))

WebUI.delay(0)

System.out.println(Check1)

Check1 = WebUI.getUrl()

System.out.println(Check1)

WebUI.verifyMatch(Check1, urlAbout, false)

WebUI.click(findTestObject('Object Repository/FreedomBooking/Page_Freedom Travel/Page_Freedom Travel/a_Terms  Conditions'))

Check2 = WebUI.getUrl()

WebUI.verifyMatch(Check2, urlTerms, false)

WebUI.click(findTestObject('Object Repository/FreedomBooking/Page_Freedom Travel/Page_Freedom Travel/a_Privacy Policy'))

Check3 = WebUI.getUrl()

WebUI.verifyMatch(Check3, urlPrivacy, false)

WebUI.closeBrowser()

