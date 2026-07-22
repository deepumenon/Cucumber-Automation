package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public void Excel() throws IOException {

		String filelocation = "./Test-Data/Test_Data.xlsx";
		XSSFWorkbook wbook = new XSSFWorkbook(filelocation);
		XSSFSheet sheet = wbook.getSheetAt(0);
		int lastrownum = sheet.getLastRowNum();
		int lastcellnum = sheet.getRow(0).getLastCellNum();
		System.out.println("lastrownum: "+ lastrownum);
		System.out.println("lastcellnum: "+lastcellnum);
		
		for (int i = 1; i <= lastrownum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastcellnum; j++) {
				XSSFCell cell = row.getCell(j);
				
				DataFormatter df = new DataFormatter();
				String value = df.formatCellValue(cell);
				
				System.out.println(value);
				 
			}
		}

	}
}
