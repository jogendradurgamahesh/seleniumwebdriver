package testNgProvider;

import java.io.FileInputStream;
import java.io.IOException;

//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceUtil {
	
	 public static Object[][] getExcelData(String filePath, String sheetName) {

	        Object[][] data = null;

	        try {
	            FileInputStream fis = new FileInputStream(filePath);
	            Workbook workbook = new XSSFWorkbook(fis);
	            Sheet sheet = workbook.getSheet(sheetName);

	            int rows = sheet.getLastRowNum();
	            int cols = sheet.getRow(0).getLastCellNum();
	            
	            DataFormatter formatter = new DataFormatter();

	            data = new Object[rows][cols];

	            for (int i = 1; i <= rows; i++) {
	                Row row = sheet.getRow(i);
	                for (int j = 0; j < cols; j++) {
	                	 Cell cell = row.getCell(j);

	                     if (cell == null) {
	                         data[i - 1][j] = "";
	                     } else {
	                         data[i - 1][j] = formatter.formatCellValue(cell);
	                     }
	                     System.out.println("Rows: " + rows + " Cols: " + cols);
	                 }
	                }
	            

	            workbook.close();
	            fis.close();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return data;
	    }

}
