import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;

import com.kms.katalon.core.annotation.Keyword
public class WriteExcelColumnWhile {


	@Keyword
	public void demoKey(String result) throws IOException{

		int row1 = 1

		FileInputStream fis = new FileInputStream ('C:\\Users\\WeDoQA-ThinkPad-Man7\\Downloads\\Test DDT-BookingFreedom.xlsx')
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		XSSFSheet sheet = workbook.getSheet('Sheet4')
		XSSFRow row = sheet.getRow(row1)

		int colNum=row.getLastCellNum()


		while (colNum ==3) {
			row1=row1+1
			row = sheet.getRow(row1)
			colNum=row.getLastCellNum()
		}


		println('Total number Columns: '+colNum+'. The current row: '+row1)
		println('Value in strTest is: '+result)
		XSSFCell cell = null
		if (cell==null)
			cell = row.createCell(colNum)
		cell.setCellValue(result)
		FileOutputStream fos = new FileOutputStream('C:\\Users\\WeDoQA-ThinkPad-Man7\\Downloads\\Test DDT-BookingFreedom.xlsx')
		workbook.write(fos)
		fos.close()
	}
}