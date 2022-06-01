package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
		         "D:\\sele1\\chromedriver.exe");

				WebDriver driver =  new ChromeDriver();
               driver.manage().window().maximize();
				driver.get("https://www.saucedemo.com/");
				WebElement userName = driver.findElement(By.xpath("//form//div[1]//input"));
				userName.sendKeys("standard_user") ;
				WebElement password = driver.findElement(By.xpath("//form//div[2]//input"));
				password.sendKeys("secret_sauce");
				WebElement login = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input"));
				//login.click();
				Actions act = new Actions (driver);
				act.click(login).perform();
}
}