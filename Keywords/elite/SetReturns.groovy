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

class SetReturns {

	
	//Sets market return value
	@Keyword
	public void Set (String wsheet) {


		String returns = new elite.SetValuesFromTable().setReturnsValue(wsheet)

		System.out.println("Returns is: "+returns)


		WebUI.click(findTestObject('Elite/Page_Plan - RetireUp Elite/div_Before Retirement_rc-slider-handle'))


		if (returns == "2") {

			WebUI.dragAndDropByOffset(findTestObject('Elite/Page_Plan - RetireUp Elite/div_Before Retirement_rc-slider-handle'), -250,
					0)

			WebUI.dragAndDropByOffset(findTestObject('Elite/Page_Plan - RetireUp Elite/div_Before Retirement_rc-slider-handle'), 40,
					0)
		}

		else if (returns == "3") {
			WebUI.dragAndDropByOffset(findTestObject('Elite/Page_Plan - RetireUp Elite/div_Before Retirement_rc-slider-handle'), -250,
					0)

			WebUI.dragAndDropByOffset(findTestObject('Elite/Page_Plan - RetireUp Elite/div_Before Retirement_rc-slider-handle'), 70,
					0)
		}

		else if (returns == "4") {
			WebUI.dragAndDropByOffset(findTestObject('Elite/Page_Plan - RetireUp Elite/div_Before Retirement_rc-slider-handle'), -250,
					0)

			WebUI.dragAndDropByOffset(findTestObject('Elite/Page_Plan - RetireUp Elite/div_Before Retirement_rc-slider-handle'), 90,
					0)
		}

		else if (returns == "5") {
			WebUI.dragAndDropByOffset(findTestObject('Elite/Page_Plan - RetireUp Elite/div_Before Retirement_rc-slider-handle'), -250,
					0)

			WebUI.dragAndDropByOffset(findTestObject('Elite/Page_Plan - RetireUp Elite/div_Before Retirement_rc-slider-handle'), 110,
					0)
		}

		else if (returns == "6") {
			WebUI.dragAndDropByOffset(findTestObject('Elite/Page_Plan - RetireUp Elite/div_Before Retirement_rc-slider-handle'), -250,
					0)

			WebUI.dragAndDropByOffset(findTestObject('Elite/Page_Plan - RetireUp Elite/div_Before Retirement_rc-slider-handle'), 135,
					0)
		}

		else if (returns == "7") {
			WebUI.dragAndDropByOffset(findTestObject('Elite/Page_Plan - RetireUp Elite/div_Before Retirement_rc-slider-handle'), -250,
					0)

			WebUI.dragAndDropByOffset(findTestObject('Elite/Page_Plan - RetireUp Elite/div_Before Retirement_rc-slider-handle'), 150,
					0)
		}

		else if (returns == "8") {
			WebUI.dragAndDropByOffset(findTestObject('Elite/Page_Plan - RetireUp Elite/div_Before Retirement_rc-slider-handle'), -250,
					0)

			WebUI.dragAndDropByOffset(findTestObject('Elite/Page_Plan - RetireUp Elite/div_Before Retirement_rc-slider-handle'), 180,
					0)
		}
	}
}