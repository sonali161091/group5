package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathInsta 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		         "D:\\sele1\\chromedriver.exe");

				WebDriver driver =  new ChromeDriver();
               driver.manage().window().maximize();
				driver.get("https://www.instagram.com/?hl=en");
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//			Options o = driver.manage();
//			Timeouts t = o.timeouts();
//			Timeouts p = t.implicitlyWait(Duration.ofSeconds(30));
//			
//				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//				WebElement userName = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='username']"))));
//	
				
				
				WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
				userName.sendKeys("sonaliskothule@gmail.com") ;
				WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
				password.sendKeys("admin123");
				WebElement login = driver.findElement(By.xpath("//div[contains(text(),'Log')]"));
				login.click();
				
				
				
		
	}

	

}
