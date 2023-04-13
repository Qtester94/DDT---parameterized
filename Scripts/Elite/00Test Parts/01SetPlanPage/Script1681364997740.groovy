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

////Get values for Info page
infovalues = CustomKeywords.'elite.SetValuesFromTable.setInfoValues'(wsheet)

age = (infovalues[0])

strAge = (infovalues[1])

endAge = (infovalues[2])

salary = (infovalues[3])

increases = (infovalues[4])

System.out.println((((((((('age:' + age) + ' | strAge: ') + strAge) + ' | endAge: ') + endAge) + '| salary: ') + salary) + 
    '| increases: ') + increases)

//Start application
WebUI.openBrowser('')

WebUI.navigateToUrl('https://elite-qa.retireup.com/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Elite/Page_Login - RetireUp Elite/input_Email Address_email'), 'qtester97+scenarios@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Elite/Page_Login - RetireUp Elite/input_Password_password'), '2QpTVdkPu4Nn/AY2KB+8zQ==')

WebUI.click(findTestObject('Object Repository/Elite/Page_Login - RetireUp Elite/button_Login'))

WebUI.click(findTestObject('Object Repository/Elite/Page_Client Search - RetireUp Elite/button_Show all clients'))

WebUI.click(findTestObject('Object Repository/Elite/Page_Client Search - RetireUp Elite/a_Current Plan'))

WebUI.click(findTestObject('Object Repository/Elite/Page_Plan - RetireUp Elite/a_Info'))

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

WebUI.closeBrowser()

