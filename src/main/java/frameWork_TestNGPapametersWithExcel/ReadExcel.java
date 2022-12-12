package frameWork_TestNGPapametersWithExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readexcel() throws IOException {
		XSSFWorkbook wb= new XSSFWorkbook("./data/ReadExcel.xlsx");
		XSSFSheet sheet = wb.getSheetAt(0);
		int RowCount = sheet.getLastRowNum();
		short ColumnCount = sheet.getRow(0).getLastCellNum();
	    String[][]data= new String[RowCount][ColumnCount];
		for (int i = 1; i <= RowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < ColumnCount; j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				data[i-1][j]=cellValue;
			}
		}
		
		return data;

	}

}
