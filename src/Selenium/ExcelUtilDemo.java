package Selenium;

import java.io.IOException;

public class ExcelUtilDemo {

	public static void main(String[] args) throws IOException {
		
		ExcelUtil excel = new ExcelUtil("C:\\Users\\beile\\eclipse-workspace\\FreeCRMTest\\src\\test\\java\\testcases\\FreeCRMTestData.xlsx","test");
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);
		
		}

	}
