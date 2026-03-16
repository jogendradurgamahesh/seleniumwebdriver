package sample16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataIntoExcel {

	//  Excel-file->workbook->sheet->row->cells
	public static void main(String[] args) throws IOException {

		//		C:\Users\HELLO PC\OneDrive\Documents\selenium\seleniumwebdriver\testData
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testData\\myfile_dynamic.xlsx");

		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("DynamicData");

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter how many rows?");
		int rows=sc.nextInt();

		System.out.println("Enter how many cells?");
		int cols=sc.nextInt();

		for(int r=0;r<=rows;r++) {
			XSSFRow currentRow=	sheet.createRow(r);
			for(int c=0;c<cols;c++) {
				XSSFCell currentCol=currentRow.createCell(c);
				currentCol.setCellValue(sc.next());
			}
		}





		workbook.write(file);

		workbook.close();
		file.close();


		System.out.println("File created");

	}

}
