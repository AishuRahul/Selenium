package testcases;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readExcel(String filename) throws IOException {
		
		// Open workbook

		XSSFWorkbook wbook = new XSSFWorkbook("./data/" + filename + ".xlsx");
		

		// go to sheet

		XSSFSheet sheet = wbook.getSheetAt(0);

		int rowCount = sheet.getLastRowNum();// gets the last used row count

		//int actualRow = sheet.getPhysicalNumberOfRows(); //gets the total number of rows

		System.out.println(rowCount);

		int columnCount = sheet.getRow(0).getLastCellNum();

		System.out.println(columnCount);

		String[][] data = new String[rowCount][columnCount];

		for (int i = 1; i <= rowCount; i++) {

			// go to row

			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < columnCount; j++) {

				// go to the column of row

				XSSFCell column = row.getCell(j);

				// read data
				
	            DataFormatter formatter=new DataFormatter();
	            data[i-1][j]=formatter.formatCellValue(column);
				//data[i - 1][j] = column.getStringCellValue();

				//data[i - 1][j]=column.getNumericCellValue();
				//column.getDateCellValue()

			}

		}

		return data;

		/*
		 * for (String[] row : data) {
		 * 
		 * for (String column : row) {
		 * 
		 * System.out.println(column);
		 * 
		 * }
		 * 
		 * }
		 */

	}

}
