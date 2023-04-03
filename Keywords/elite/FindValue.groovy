package elite
import java.text.DecimalFormat

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.kms.katalon.core.annotation.Keyword




class FindValue {
	// Read all Cell value from the row
	@Keyword
	public void cellread() throws IOException{

		int rowNum = 2

		FileInputStream fis = new FileInputStream ('C:\\Users\\WeDoQA-ThinkPad-Man7\\Downloads\\AIG.xlsx')
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		XSSFSheet sheet = workbook.getSheet('Returns')
		XSSFRow row = sheet.getRow(rowNum)
		XSSFCell cell = row.getCell(1)

		row = sheet.getRow(2)
		int i = 1


		while (i<23) {
			cell = row.getCell(i)
			println(cell)
			i= i+1
		}
	}

	// Find Value from from row, and return Column value and Index value from row
	@Keyword
	public void findValueinRow(String value, int rowNum) throws IOException{


		FileInputStream fis = new FileInputStream ('C:\\Users\\WeDoQA-ThinkPad-Man7\\Downloads\\AIG.xlsx')
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		XSSFSheet sheet = workbook.getSheet('Returns')
		XSSFRow row = sheet.getRow(rowNum)
		XSSFRow row0 = sheet.getRow(0)
		XSSFCell cell = row.getCell(1)

		String index = ''
		String colName= ''

		for (int i = 1; i<22; i++) {

			cell = row.getCell(i)

			String cell1 = cell.getRawValue()

			if (cell1 == value) {
				println("This is a searched value: " + cell1)
				colName = row0.getCell(i)
				double test = Double.valueOf(colName)
				double test1 = test * 100
				//				test1 = test1 * 100
				//				test1 = Math.round(test1);
				//				test1 = test1 /100;
				cell = row.getCell(0)
				index = cell.getRawValue()
				println('Row value: '+ test1)
				println ('Index value' + index)
			}

		}
	}



	//	@Keyword
	//	public void findValueinTableTest2(String value) throws IOException{
	//
	//		int rowNum = 2
	//		String index = ''
	//		String colName= ''
	//
	//		FileInputStream fis = new FileInputStream ('C:\\Users\\WeDoQA-ThinkPad-Man7\\Downloads\\AIG.xlsx')
	//		XSSFWorkbook workbook = new XSSFWorkbook(fis)
	//		XSSFSheet sheet = workbook.getSheet('Returns')
	//		XSSFRow row = sheet.getRow(rowNum)
	//		XSSFRow row0 = sheet.getRow(0)
	//		XSSFCell cell = row.getCell(1)
	//
	//		for (int j=2; j<202; j++ ) {
	//			row = sheet.getRow(j)
	//
	//			for  (int k = 1; k<22; k++) {
	//
	//				cell = row.getCell(k)
	//
	//				String cell1 = cell.getRawValue()
	//
	//				if (cell1 == value) {
	//					println("This is a searched value: " + cell1)
	//					colName = row0.getCell(k)
	//					double test = Double.valueOf(colName)
	//					double test1 = test * 100
	//					//				test1 = test1 * 100
	//					//				test1 = Math.round(test1);
	//					//				test1 = test1 /100;
	//					cell = row.getCell(0)
	//					index = cell.getRawValue()
	//					println('Row value: '+ test1)
	//					println ('Index value: ' + index)
	//				}
	//			}
	//		}
	//
	//	}

	// Method to find value in the table (need input value)
	@Keyword
	public void findValueinTable(String value) throws IOException{

		String index = ''
		String colName= ''

		FileInputStream fis = new FileInputStream ('C:\\Users\\WeDoQA-ThinkPad-Man7\\Downloads\\AIG.xlsx')
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		XSSFSheet sheet = workbook.getSheet('Returns')
		XSSFRow row = sheet.getRow(3)
		XSSFRow row0 = sheet.getRow(0)
		XSSFCell cell = row.getCell(1)

		for (int j=2; j<202; j++ ) {
			row = sheet.getRow(j)

			findValueinRow(value, j)

		}

	}

}




