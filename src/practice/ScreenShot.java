package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver",
		         "D:\\sele1\\chromedriver.exe");

				WebDriver driver =  new ChromeDriver();
               driver.manage().window().maximize();
				driver.get("https://www.saucedemo.com/");
				
				//TakesScreenshot ts = new ChromeDriver();
				
				TakesScreenshot ts = (TakesScreenshot)driver;
				
	File source = ts.getScreenshotAs(OutputType.FILE);
	
	File destination = new File("D:\\ScreenShot\\soucedemologin.jpg");
				
	FileHandler.copy(source, destination);	
	
	WebElement userName = driver.findElement(By.xpath("//form//div[1]//input"));
	userName.sendKeys("standard_user") ;
	WebElement password = driver.findElement(By.xpath("//form//div[2]//input"));
	password.sendKeys("secret_sauce");
	WebElement login = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input"));
	login.click();
	
File source1 = ts.getScreenshotAs(OutputType.FILE);
	
	File destination1 = new File("D:\\ScreenShot\\soucedemohome.jpg");
				
	FileHandler.copy(source1, destination1);	
	
	
				

}
}	
