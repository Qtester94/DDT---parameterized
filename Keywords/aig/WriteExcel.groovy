package aig
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;

import com.kms.katalon.core.annotation.Keyword
public class WriteExcel{



	//Write First Withdrawal value to the table, need value and sheet name as input
	@Keyword
	public void withdrawalValue(String result, wsheet) throws IOException{

		int row1 = 1

		FileInputStream fis = new FileInputStream ('C:\\Users\\WeDoQA-ThinkPad-Man7\\Downloads\\AIG.xlsx')
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		XSSFSheet sheet = workbook.getSheet(wsheet)
		XSSFRow row = sheet.getRow(row1)

		int colNum=row.getLastCellNum()



		while (colNum > 4) {
			row1=row1+1
			row = sheet.getRow(row1)
			colNum=row.getLastCellNum()
		}


		println('For Withdrawal Value Total number Columns: '+colNum+'. The current row: '+row1)
		XSSFCell cell = null
		if (cell==null)
			cell = row.createCell(colNum)
		cell.setCellValue(result)
		FileOutputStream fos = new FileOutputStream('C:\\Users\\WeDoQA-ThinkPad-Man7\\Downloads\\AIG.xlsx')
		workbook.write(fos)
		fos.close()
	}

	//Write the value before the withdrawal to the table, need value and sheet name as input
	@Keyword
	public void BeforewithdrawalValue(String result, wsheet) throws IOException{

		int row1 = 1

		FileInputStream fis = new FileInputStream ('C:\\Users\\WeDoQA-ThinkPad-Man7\\Downloads\\AIG.xlsx')
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		XSSFSheet sheet = workbook.getSheet(wsheet)
		XSSFRow row = sheet.getRow(row1)

		int colNum=row.getLastCellNum()


		while (colNum ==5) {
			row1=row1+1
			row = sheet.getRow(row1)
			colNum=row.getLastCellNum()
		}


		println('Before withdrawal value Total number Columns: '+colNum+'. The current row: '+row1)
		XSSFCell cell = null
		if (cell==null)
			cell = row.createCell(colNum)
		cell.setCellValue(result)
		FileOutputStream fos = new FileOutputStream('C:\\Users\\WeDoQA-ThinkPad-Man7\\Downloads\\AIG.xlsx')
		workbook.write(fos)
		fos.close()
	}
}



