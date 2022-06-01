package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathAmazon 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		         "D:\\sele1\\chromedriver.exe");

				WebDriver driver =  new ChromeDriver();
               driver.manage().window().maximize();
				driver.get("https://www.amazon.in/");
//				WebElement searchbox = driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]"));
//				searchbox.sendKeys("mobile") ;
//				
//				WebElement search = driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit-button')]"));
//				search.click();
				
				WebElement sign = driver.findElement(By.xpath("//div//a[2]//div//span"));
				sign.click();
				WebElement login = driver.findElement(By.xpath("//input[@id='ap_email']"));
				login.sendKeys("8308830074");
				WebElement start = driver.findElement(By.xpath("//input[@id='continue']"));
				start.click();
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				WebElement password = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='password']"))));

				
				
				//WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
				password.sendKeys("sonali16");
				WebElement signin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
				signin.click();
				
				
				
		
	}

}
