package elite
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import elite.SetValuesFromTable

class SetContribution {
	/**
	 * Sets contribution (type and values) dependent on the type from table (use the real table from the client)
	 */
	@Keyword
	public void Set (String wsheet) {

		String [] assetValues = new elite.SetValuesFromTable().setAsetValues(wsheet)

		String contribution = (assetValues[0])

		String contribution3 = (assetValues[2])

		String contributionType = (assetValues[1])

		System.out.println(contributionType +"  " + contribution +"   " + contribution3)

		if (contributionType == 'Monthly') {
			WebUI.click(findTestObject('Elite/Page_Sources - RetireUp Elite/div_DownArrow-Contribution'))

			WebUI.click(findTestObject('Elite/Page_Sources - RetireUp Elite/ContributiomDropdown/div_Monthly'))

			WebUI.setText(findTestObject('Elite/Page_Sources - RetireUp Elite/input_Monthly_contributionAmountEmployeeCurrency'),
					contribution)
		}
		else if (contributionType == 'Annual') {
			WebUI.click(findTestObject('Elite/Page_Sources - RetireUp Elite/div_DownArrow-Contribution'))

			WebUI.click(findTestObject('Elite/Page_Sources - RetireUp Elite/ContributiomDropdown/div_Annual'))

			WebUI.setText(findTestObject('Elite/Page_Sources - RetireUp Elite/input_Monthly_contributionAmountEmployeeCurrency'),
					contribution)
		}
		else if (contributionType == 'Maximum Allowable') {
			WebUI.click(findTestObject('Elite/Page_Sources - RetireUp Elite/div_DownArrow-Contribution'))

			WebUI.click(findTestObject('Elite/Page_Sources - RetireUp Elite/ContributiomDropdown/New/div_Maximum Allowable1'))
		}
		else if (contributionType == '% of Salary') {
			WebUI.click(findTestObject('Elite/Page_Sources - RetireUp Elite/div_DownArrow-Contribution'))

			WebUI.click(findTestObject('Object Repository/Elite/Page_Sources - RetireUp Elite/ContributiomDropdown/div_Salary'))

			WebUI.setText(findTestObject('Elite/Page_Sources - RetireUp Elite/input_Salary_contributionAmountEmployeePercent'),
					contribution3)
		}
	}
}