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



//Start application
WebUI.openBrowser('')

WebUI.navigateToUrl('https://elite-qa.retireup.com/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Elite/Page_Login - RetireUp Elite/input_Email Address_email'), 'qtester97+scenarios@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Elite/Page_Login - RetireUp Elite/input_Password_password'), '2QpTVdkPu4Nn/AY2KB+8zQ==')

WebUI.click(findTestObject('Object Repository/Elite/Page_Login - RetireUp Elite/button_Login'))

WebUI.click(findTestObject('Object Repository/Elite/Page_Client Search - RetireUp Elite/button_Show all clients'))

WebUI.click(findTestObject('Object Repository/Elite/Page_Client Search - RetireUp Elite/a_Current Plan'))

'Source'
WebUI.click(findTestObject('Elite/Page_Plan - RetireUp Elite/a_Sources'))

// Set Contrabition for asset
WebUI.click(findTestObject('Object Repository/Elite/Page_Sources - RetireUp Elite/button_Employer_AssetsList__EditButton-sc-n_517339'))

'Set Contrabution'
CustomKeywords.'elite.SetContribution.Set'(wsheet)

WebUI.click(findTestObject('Object Repository/Elite/Page_Sources - RetireUp Elite/button_CONTINUE TO ALLOCATIONS'))

WebUI.click(findTestObject('Object Repository/Elite/Page_Sources - RetireUp Elite/div_Enter ManuallyEnter individual holdings_821d09'))

WebUI.click(findTestObject('Object Repository/Elite/Page_Sources - RetireUp Elite/button_DONE'))

WebUI.click(findTestObject('AIG/Page_Sources - Retirement Pathfinder/planPage-sideNavigation'))

'Info page'
WebUI.click(findTestObject('Object Repository/Elite/Page_Plan - RetireUp Elite/a_Info'))

////Get values for Info page
infovalues = CustomKeywords.'elite.SetValuesFromTable.setInfoValues'(wsheet)

age = (infovalues[0])

strAge = (infovalues[1])

endAge = (infovalues[2])

salary = (infovalues[3])

increases = (infovalues[4])

System.out.println((((((((('age:' + age) + ' | strAge: ') + strAge) + ' | endAge: ') + endAge) + '| salary: ') + salary) +
	'| increases: ') + increases)

//Set info page
WebUI.setText(findTestObject('Object Repository/Elite/Page_Information - RetireUp Elite/input_Years_client.age'), age)

CustomKeywords.'elite.SetRetirementAge.SetRetirement'(strAge, endAge)

WebUI.setText(findTestObject('Object Repository/Elite/Page_Information - RetireUp Elite/input_Amount_client.salary.amount'), 
    salary)

WebUI.click(findTestObject('Object Repository/Elite/Page_Information - RetireUp Elite/div_Annual Growth'))

WebUI.setText(findTestObject('Object Repository/Elite/Page_Information - RetireUp Elite/input_Annual Growth_client.salary.growth'), 
    increases)

WebUI.click(findTestObject('Object Repository/Elite/Page_Information - RetireUp Elite/a_Continue'))

WebUI.click(findTestObject('Elite/Page_Sources - RetireUp Elite/a_Plan'))

//Set Plan page
WebUI.click(findTestObject('Elite/Page_Plan - RetireUp Elite/button_Tax 18'))

WebUI.click(findTestObject('Elite/Page_Plan - RetireUp Elite/input_Variable Tax Timeframe_TaxSliderVaria_b7b09c'))

WebUI.sendKeys(findTestObject('Elite/Page_Plan - RetireUp Elite/input_Variable Tax Timeframe_TaxSliderVaria_b7b09c'), Keys.chord(
        Keys.DELETE, Keys.DELETE, '0'))

WebUI.setText(findTestObject('Elite/Page_Plan - RetireUp Elite/input_Variable Tax Timeframe_TaxSliderVaria_b7b09c'), '18')

WebUI.click(findTestObject('Elite/Page_Plan - RetireUp Elite/button_Inflation 2.5'))

WebUI.setText(findTestObject('Elite/Page_Plan - RetireUp Elite/input__Inflation'), '2.5', FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'elite.SetReturns.Set'(wsheet)

//Get return valus and Change it in table
WebUI.mouseOver(findTestObject('Elite/Page_Plan - RetireUp Elite/pathMarketReturn1'))

'Get Market return value for search index'
marketReturn1 = WebUI.getText(findTestObject('Elite/Page_Plan - RetireUp Elite/marketReturn1'))

marketReturn1 = marketReturn1.substring(0, marketReturn1.length() - 1)

double ret = Double.valueOf(marketReturn1)

ret = (ret / 100)

marketReturn1 = ret.toString()

marketReturn1 = marketReturn1.substring(0, 6)

WebUI.mouseOver(findTestObject('Elite/Page_Plan - RetireUp Elite/New/pathMarkerReturn2'))

marketReturn2 = WebUI.getText(findTestObject('Elite/Page_Plan - RetireUp Elite/New/marketReturn2'))

marketReturn2 = marketReturn2.substring(0, marketReturn2.length() - 1)

double ret2 = Double.valueOf(marketReturn2)

ret2 = (ret2 / 100)

marketReturn2 = ret2.toString()

marketReturn2 = marketReturn2.substring(0, 6)

System.out.println((marketReturn1 + ' | ') + marketReturn2)

'Find Index Value'
String realindex = CustomKeywords.'elite.FindValue.findValueinTableSC'(marketReturn1, marketReturn2)

double writeToTable = Double.valueOf(realindex)

'Write index to table'
CustomKeywords.'elite.WriteValueInTable.WriteinCellCS'(writeToTable, wsheet)

// Verify applicatin values (Starting balance and Growth) with table values


'Verify Starting Balance and Growth'
while (cell < 10) {
    System.out.println('Cell: ' + cell)

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

