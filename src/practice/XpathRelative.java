package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathRelative 
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
				login.click();
				WebElement add = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
				add.click();
				WebElement out = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
				out.click();
				Thread.sleep(2000);
				WebElement logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
				logout.click();
				
				
				
				
				
		
	}


}
