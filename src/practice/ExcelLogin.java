package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ExcelLogin 
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
				 XSSFCell cell = row.getCell(1);
				 
				 //data read
				String data = cell.getStringCellValue();
				System.out.println(data);
				
				 XSSFRow row1 = sheet.getRow(1);
					
					//read cell
					 XSSFCell cell1 = row1.getCell(1);
					 
					 //data read
					String data1 = cell1.getStringCellValue();
					System.out.println(data1);
			
			System.setProperty("webdriver.chrome.driver",
			         "D:\\sele1\\chromedriver.exe");

					WebDriver driver =  new ChromeDriver();
	               driver.manage().window().maximize();
					driver.get("https://www.saucedemo.com/");
					WebElement userName = driver.findElement(By.xpath("//input[@class='input_error form_input'][1]"));
					userName.sendKeys(data) ;
					WebElement password = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
					password.sendKeys(data1);
					WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
					login.click();
		
		

		
		
		
	}

}
