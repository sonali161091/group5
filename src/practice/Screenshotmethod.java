package practice;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotmethod {
	static WebDriver driver;
	public static void screenshotmeth() throws IOException
	
	{
		Date d = new Date();


		
		DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
	    String date = d1.format(d) ;
	    
	    TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("D:\\ScreenShot\\soucedemopp"+date+".jpg");
					
		FileHandler.copy(source, destination);	
		
	}
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver",
		         "D:\\sele1\\chromedriver.exe");

				 driver =  new ChromeDriver();
              driver.manage().window().maximize();
				driver.get("https://www.saucedemo.com/");
				
				screenshotmeth();
				
				WebElement userName = driver.findElement(By.xpath("//form//div[1]//input"));
				userName.sendKeys("standard_user") ;
				WebElement password = driver.findElement(By.xpath("//form//div[2]//input"));
				password.sendKeys("secret_sauce");
				WebElement login = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input"));
				login.click();
				
				screenshotmeth();
				
		
	}

}