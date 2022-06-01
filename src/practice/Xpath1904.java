package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1904 {
	
		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver",
			         "D:\\sele1\\chromedriver.exe");

					WebDriver driver =  new ChromeDriver();
	               driver.manage().window().maximize();
					driver.get("https://opensource-demo.orangehrmlive.com");
					WebElement fpass = driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
					fpass.click();

}
	}
