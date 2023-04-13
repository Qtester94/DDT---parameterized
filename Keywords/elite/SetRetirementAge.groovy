package elite
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys


class SetRetirementAge {


	// Sets Start and End retirement age 
	@Keyword
	def SetRetirement(String strAge, String endAge) {

		WebUI.sendKeys(findTestObject('Elite/Page_Information - RetireUp Elite/input_Years_client.age'), Keys.chord(Keys.TAB, Keys.DELETE,
				Keys.ENTER))

		WebUI.sendKeys(findTestObject('Elite/Page_Information - RetireUp Elite/input_Years_client.age'), Keys.chord(Keys.TAB, Keys.DELETE,
				Keys.ENTER))

		WebUI.sendKeys(findTestObject('Elite/Page_Information - RetireUp Elite/input_Years_client.age'), Keys.chord(Keys.TAB, Keys.DELETE,
				strAge, Keys.TAB))

		WebUI.sendKeys(findTestObject('Elite/Page_Information - RetireUp Elite/input_Years_client.age'), Keys.chord(Keys.TAB, Keys.TAB,
				Keys.DELETE, endAge, Keys.ENTER))


	}
}