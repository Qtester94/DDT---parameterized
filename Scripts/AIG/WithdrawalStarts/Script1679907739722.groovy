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

WebUI.click(findTestObject('Object Repository/AIG/Page_Client Search - Retirement Pathfinder/a_Test1'))

WebUI.click(findTestObject('Object Repository/AIG/Page_Plan - Retirement Pathfinder/a_Sources'))

WebUI.click(findTestObject('Object Repository/AIG/Page_Sources - Retirement Pathfinder/btn-EditAsset'))

WebUI.setText(findTestObject('Object Repository/AIG/Page_Sources - Retirement Pathfinder/input-WithdrawalStartAge'), age)

WebUI.click(findTestObject('Object Repository/AIG/Page_Sources - Retirement Pathfinder/button_SAVE  CONTINUE'))

WebUI.click(findTestObject('Object Repository/AIG/Page_Sources - Retirement Pathfinder/planPage-sideNavigation'))

value = WebUI.getText(findTestObject('AIG/Page_Plan - Retirement Pathfinder/withdrawalFirsAge-Cell', [('withdrawalAge') : withdrawalAge]))

value2 = WebUI.getText(findTestObject('AIG/Page_Plan - Retirement Pathfinder/withdrawalAgeBefore-Cell', [('ageBeforeWithdrawal') : ageBeforeWithdrawal]))

WebUI.verifyMatch(value2, '$0', false)

WebUI.verifyNotMatch(value, value2, false)

System.out.println('First withdrawal: ' + value)

System.out.println('Value before first withdrawal: ' + value2)

CustomKeywords.'aig.WriteExcel.withdrawalValue'(value, sheet)

CustomKeywords.'aig.WriteExcel.BeforewithdrawalValue'(value2, sheet)

WebUI.closeBrowser()

