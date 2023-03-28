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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://aigrs-test.retireup.com/login')

WebUI.setText(findTestObject('Object Repository/AIG/Page_Login - Retirement Pathfinder/input_Email Address_email'), 'qtester97+030610@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/AIG/Page_Login - Retirement Pathfinder/input_Password_password'), 
    '2QpTVdkPu4NVz4sLYjnEaQ==')

WebUI.click(findTestObject('Object Repository/AIG/Page_Login - Retirement Pathfinder/span_Login'))

WebUI.click(findTestObject('Object Repository/AIG/Page_Client Search - Retirement Pathfinder/button_Show all clients'))

WebUI.click(findTestObject('AIG/Page_Client Search - Retirement Pathfinder/a_Test2'))

WebUI.click(findTestObject('Object Repository/AIG/Page_Plan - Retirement Pathfinder/a_Sources'))

WebUI.click(findTestObject('AIG/Page_Sources - Retirement Pathfinder/button_4,000,000_AssetsList__EditButton-sc-_f3a0af'))

WebUI.setText(findTestObject('AIG/Page_Sources - Retirement Pathfinder/input_Age_widthdrawStopTypeAge'), age)

WebUI.click(findTestObject('AIG/Page_Sources - Retirement Pathfinder/button_SAVE  CONTINUE'))

WebUI.click(findTestObject('AIG/Page_Sources - Retirement Pathfinder/planPage-sideNavigation'))

value1 = WebUI.getText(findTestObject('AIG/Page_Plan - Retirement Pathfinder/withdrawalFirsAge-CellStop', [('withdrawalCellAtEnd') : withdrawalCellAtEnd]))

value2 = WebUI.getText(findTestObject('AIG/Page_Plan - Retirement Pathfinder/withdrawalAgeBefore-CellStop', [('withdrawalCellBeforeStop') : withdrawalCellBeforeStop]))

WebUI.verifyMatch(value1, '$0', false)

WebUI.verifyNotMatch(value1, value2, false)

System.out.println('Value1: ' + value1)

System.out.println('Value2: ' + value2)

CustomKeywords.'aig.WriteExcel.withdrawalValue'(value1, sheet)

CustomKeywords.'aig.WriteExcel.BeforewithdrawalValue'(value2, sheet)


WebUI.closeBrowser()

