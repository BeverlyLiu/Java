package Selenium;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	/* Constructor is a special method without any return type and name same as the class name
	 * Constructor is calling every time a class object is created using the new() keyword
	 * Parameterize the constructor to get excel path and sheet name
	 */
	public ExcelUtil(String excelPath, String sheetName) throws IOException {
		
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
		
	}
	
		public static void getRowCount() throws IOException {
			
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of rows: " + rowCount);
		}
		
		//rowNum and colNum is avoid hard coding of values and get the values from calling function
		public static void getCellDataString(int rowNum, int colNum) throws IOException {
			
			String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData);
			
			
		}
		
		public static void getCellDataNumber(int rowNum, int colNum) throws IOException {
			
			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellData);
			
		}

	}


