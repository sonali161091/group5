package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathIndex 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		         "D:\\sele1\\chromedriver.exe");

				WebDriver driver =  new ChromeDriver();
               driver.manage().window().maximize();
				driver.get("https://www.saucedemo.com/");
				WebElement userName = driver.findElement(By.xpath("//input[@class='input_error form_input'][1]"));
				userName.sendKeys("standard_user") ;
				WebElement password = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
				password.sendKeys("secret_sauce");
				WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
				login.click();
				
				
				
		
	}


}
