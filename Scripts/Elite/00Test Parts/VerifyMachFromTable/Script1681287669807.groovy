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

while (cell < 10) {
	System.out.println('Cell: '+cell)
	 startingBalanceA = WebUI.getText(findTestObject('Elite/Page_Plan - RetireUp Elite/TableVerify/div_StartingBalance', 
            [('cell') : cell]))

    growthA = WebUI.getText(findTestObject('Elite/Page_Plan - RetireUp Elite/TableVerify/div_Growth', [('cell') : cell]))

    startingBalanceA = startingBalanceA.replaceAll(',', '').replace('$', '')

    growthA = growthA.replace('$', '').replace(',', '')

    growthA = (growthA.split(' ')[0])

    System.out.println((('Application values: Starting Balance: ' + startingBalanceA) + ' | Growth: ') + growthA)

    startingBalanceT = CustomKeywords.'elite.SetValuesFromTable.startingBalanceValue'(wsheet, cell)

    growthT = CustomKeywords.'elite.SetValuesFromTable.growthValue'(wsheet, cell)

    System.out.println((('Table values: Starting Balance: ' + startingBalanceT) + ' | Growth: ') + growthT)

    WebUI.verifyMatch(startingBalanceA, startingBalanceT, false)

    WebUI.verifyMatch(growthA, growthT, false)

    cell = (cell + 1)
}

WebUI.closeBrowser()

