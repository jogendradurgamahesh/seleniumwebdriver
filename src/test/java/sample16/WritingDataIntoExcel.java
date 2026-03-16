package sample16;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	//  Excel-file->workbook->sheet->row->cells
	public static void main(String[] args) throws IOException {

		//		C:\Users\HELLO PC\OneDrive\Documents\selenium\seleniumwebdriver\testData
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testData\\myfile.xlsx");

		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Data");

		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("java");
		row1.createCell(1).setCellValue(8);
		row1.createCell(2).setCellValue("dev");
		
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("python");
		row2.createCell(1).setCellValue(3);
		row2.createCell(2).setCellValue("automation");
		
		XSSFRow row3=sheet.createRow(2);
		row3.createCell(0).setCellValue("c#");
		row3.createCell(1).setCellValue(3);
		row3.createCell(2).setCellValue("testing");
		
		workbook.write(file);
		
		workbook.close();
		file.close();
		
		
		System.out.println("File created");

	}

}
