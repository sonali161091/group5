package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLoop {
	public static void main(String[] args) throws IOException {
		
	
	String path = "D:\\Excel docs\\Book1.xlsx";
	
	FileInputStream file = new FileInputStream(path);       //exception accept
			
			
			XSSFWorkbook workbook = new XSSFWorkbook(file);             //exception aaccept
			XSSFSheet sheet = workbook.getSheet("pqrs");
			
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<5;j++)
				{
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell = row.getCell(j);
			String data = cell.getStringCellValue();
			System.out.print(data+" ");
				}
				System.out.println();
			}
			
}
}
