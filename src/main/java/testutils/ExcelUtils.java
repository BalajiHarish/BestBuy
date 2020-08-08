package testutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
	
	static String projectPath = System.getProperty("user.dir");
	static String filePath = "/InputData/Data.xlsx";
	static FileInputStream file;
	static Workbook workbook;
	static Sheet sheet; 

	public String getCellDataString(String sheetName, int rowNumber, String columnName) {

		try {
			file = new FileInputStream(projectPath + filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			workbook = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = workbook.getSheet(sheetName);
		DataFormatter formatter = new DataFormatter();

		Row row = sheet.getRow(0);

		int colNum = 0;
		for(int i=0; i<row.getLastCellNum(); i++) {
			if(row.getCell(i).getStringCellValue().equalsIgnoreCase(columnName))
				colNum = i;
		}

		row = sheet.getRow(rowNumber);

		String cellcontent = formatter.formatCellValue(sheet.getRow(rowNumber).getCell(colNum));
		return cellcontent;

	}
	
	public int getRowCount(String sheetName)throws Exception
	{
		try {
			file = new FileInputStream(projectPath + filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			workbook = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = workbook.getSheet(sheetName);
		int	LastRow = sheet.getLastRowNum();
		return LastRow;

	}

}
