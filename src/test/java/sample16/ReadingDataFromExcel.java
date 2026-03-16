package sample16;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {

		//	C:\Users\HELLO PC\OneDrive\Documents\selenium\seleniumwebdriver\testData\Book1.xlsx
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testData\\Book1.xlsx");//opening file as reading mode
		XSSFWorkbook workbook=new XSSFWorkbook(file);

		XSSFSheet sheet=workbook.getSheet("Sheet1"); 
		//XSSFSheet sheet= workbook.getSheetAt(0);

		//count rows and cols(cells)
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(0).getLastCellNum();

		System.out.println(rows);
		System.out.println(cols);

		for(int r=0;r<=rows;r++) {
			XSSFRow currentRow=sheet.getRow(r);
			for(int  c=0;c<cols;c++) {
				XSSFCell currentCol=currentRow.getCell(c);
				System.out.print(currentCol.toString()+"\t");
			}
			System.out.println();
		}

		workbook.close();
		file.close();



	}

}
