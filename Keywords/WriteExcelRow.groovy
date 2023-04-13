import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;

import com.kms.katalon.core.annotation.Keyword
public class WriteExcelRow {


	@Keyword
	public void demoKey(String result) throws IOException{


		FileInputStream fis = new FileInputStream ('C:\\Users\\WeDoQA-ThinkPad-Man7\\Downloads\\Test DDT-BookingFreedom.xlsx')
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		XSSFSheet sheet = workbook.getSheet('Sheet4')
		XSSFRow row = sheet.getRow(1)

		int colNum=row.getLastCellNum()
		println('Total number Columns: '+colNum)
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