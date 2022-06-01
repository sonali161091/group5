package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExelSheetProgram 
{
	public static void main(String[] args) throws IOException 
	{
		String path = "D:\\Excel docs\\Book1.xlsx";
		
FileInputStream file = new FileInputStream(path);       //exception accept
		
		//workbook read
		XSSFWorkbook workbook = new XSSFWorkbook(file);             //exception aaccept
		
		//read sheet
		 XSSFSheet sheet = workbook.getSheet("abcd");
		
		//read row
		 XSSFRow row = sheet.getRow(0);
		
		//read cell
		 XSSFCell cell = row.getCell(0);
		 
		 //data read
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		 XSSFRow row1 = sheet.getRow(4);
			
			//read cell
			 XSSFCell cell1 = row1.getCell(4);
			 
			 //data read
			String data1 = cell1.getStringCellValue();
			System.out.println(data1);
		
		

		
		
		
	}

	

}
