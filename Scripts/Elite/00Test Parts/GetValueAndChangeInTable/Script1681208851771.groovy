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

WebUI.navigateToUrl('https://elite-qa.retireup.com/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Elite/Page_Login - RetireUp Elite/input_Email Address_email'), 'qtester97+scenarios@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Elite/Page_Login - RetireUp Elite/input_Password_password'), '2QpTVdkPu4Nn/AY2KB+8zQ==')

WebUI.click(findTestObject('Object Repository/Elite/Page_Login - RetireUp Elite/button_Login'))

WebUI.click(findTestObject('Object Repository/Elite/Page_Client Search - RetireUp Elite/button_Show all clients'))

WebUI.click(findTestObject('Object Repository/Elite/Page_Client Search - RetireUp Elite/a_Current Plan'))

WebUI.mouseOver(findTestObject('Elite/Page_Plan - RetireUp Elite/pathMarketReturn1'))

marketReturn1 = WebUI.getText(findTestObject('Elite/Page_Plan - RetireUp Elite/marketReturn1'))

marketReturn1 = marketReturn1.substring(0, marketReturn1.length() - 1)

double ret = Double.valueOf(marketReturn1)

ret = (ret / 10)

ret = (ret / 10)

marketReturn1 = ret.toString()

WebUI.mouseOver(findTestObject('Elite/Page_Plan - RetireUp Elite/New/pathMarkerReturn2'))

marketReturn2 = WebUI.getText(findTestObject('Elite/Page_Plan - RetireUp Elite/New/marketReturn2'))

marketReturn2 = marketReturn2.substring(0, marketReturn2.length() - 1)

double ret2 = Double.valueOf(marketReturn2)

ret2 = (ret2 / 10)

ret2 = (ret2 / 10)

marketReturn2 = ret2.toString()

String realindex = CustomKeywords.'elite.FindValue.findValueinTableSC'(marketReturn1, marketReturn2)

double writeToTable = Double.valueOf(realindex)

CustomKeywords.'elite.WriteValueInTable.WriteinCellCS'(writeToTable, wsheet)

WebUI.closeBrowser()

