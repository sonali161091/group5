package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		         "D:\\sele1\\chromedriver.exe");

				WebDriver driver =  new ChromeDriver();
               driver.manage().window().maximize();
				driver.get("https://opensource-demo.orangehrmlive.com");
				WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
				userName.sendKeys("Admin") ;
				WebElement password = driver.findElement(By.xpath("//input[contains(@id,'txtPassword')]"));
				password.sendKeys("admin123");
				WebElement login = driver.findElement(By.xpath("//input[contains(@id,'btnLogin')]"));
				login.click();
				
				
				
		
	}

}
