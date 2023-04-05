package elite
import java.text.DecimalFormat

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.kms.katalon.core.annotation.Keyword


class SetValuesFromTable {

	@Keyword
	public static setValues() throws IOException{

		String wsheet = ""

		FileInputStream fis = new FileInputStream ('C:\\Users\\WeDoQA-ThinkPad-Man7\\Downloads\\EliteScenarios.xlsx')
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		XSSFSheet sheet = workbook.getSheet('Scenario1')
		XSSFRow row = sheet.getRow(1)
		XSSFCell cell = row.getCell(1)

		double age = cell.getNumericCellValue()
		
		return age
	
}
}