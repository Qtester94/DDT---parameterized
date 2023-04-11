package elite
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.text.StringCharacterIterator

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.kms.katalon.core.annotation.Keyword


class SetValuesFromTable {


	//Get info values
	@Keyword
	public static setInfoValues(String wsheet) throws IOException{

		String[] infovalues

		FileInputStream fis = new FileInputStream ('C:\\Users\\WeDoQA-ThinkPad-Man7\\Downloads\\EliteScenarios.xlsx')
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		XSSFSheet sheet = workbook.getSheet(wsheet)
		XSSFRow row = sheet.getRow(1)
		XSSFCell cell = row.getCell(1)

		double age = cell.getNumericCellValue()
		age = age * 10
		int age1 = age
		age1 = age/10

		row = sheet.getRow(2)
		cell = row.getCell(1)
		double strAge = cell.getNumericCellValue()
		strAge = strAge *10
		int strAge1 = strAge/10


		row = sheet.getRow(3)
		cell = row.getCell(1)
		double endAge = cell.getNumericCellValue()
		endAge = endAge * 10
		int endAge1 = endAge / 10

		row = sheet.getRow(10)
		cell = row.getCell(1)
		double salary = cell.getNumericCellValue()
		salary = salary * 10
		int salary1 = salary / 10


		row = sheet.getRow(11)
		cell = row.getCell(1)
		double increases = cell.getNumericCellValue()
		increases = increases * 1000
		increases = increases /10
		int increases1= increases

		infovalues = [
			age1,
			strAge1,
			endAge1,
			salary1,
			increases1
		]


		return infovalues
	}



	// Get asset contributions values and contribution types
	@Keyword
	public static setAsetValues(String wsheet) throws IOException{

		String[] assetvalues


		FileInputStream fis = new FileInputStream ('C:\\Users\\WeDoQA-ThinkPad-Man7\\Downloads\\EliteScenarios.xlsx')
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		XSSFSheet sheet = workbook.getSheet(wsheet)
		XSSFRow row = sheet.getRow(5)
		XSSFCell cell = row.getCell(4)

		double contribution = cell.getNumericCellValue()
		contribution = contribution * 10
		contribution = contribution / 10
		int contribution1 = contribution


		row = sheet.getRow(6)
		cell = row.getCell(4)
		double contribution2 = cell.getNumericCellValue()
		contribution2 = contribution2 * 100
		int contribution3 = contribution2

		row = sheet.getRow(4)
		cell = row.getCell(4)
		String contributionType = cell.getRawValue()

		assetvalues = [
			contribution1 ,
			contributionType,
			contribution3
		]

		return assetvalues
	}


	@Keyword
	public static setReturnsValue(String wsheet) throws IOException{

		String reurnsvalue = ''

		FileInputStream fis = new FileInputStream ('C:\\Users\\WeDoQA-ThinkPad-Man7\\Downloads\\EliteScenarios.xlsx')
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		XSSFSheet sheet = workbook.getSheet(wsheet)
		XSSFRow row = sheet.getRow(5)
		XSSFCell cell = row.getCell(1)

		double returns = cell.getNumericCellValue()
		returns = returns * 1000

		int returns1 = returns /10

		reurnsvalue = returns1

		return reurnsvalue

	}
}