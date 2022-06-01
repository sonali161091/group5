package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplay {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
		         "D:\\sele1\\chromedriver.exe");

				WebDriver driver =  new ChromeDriver();
               driver.manage().window().maximize();
				driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
				WebElement hidebutten = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
				hidebutten.click();
				Thread.sleep(2000);
				WebElement textbox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
				boolean result1= textbox.isDisplayed();
				System.out.println("After clicking on hide butten " +result1);
				
				WebElement showbutten = driver.findElement(By.xpath("//input[@id='show-textbox']"));
				showbutten.click();
				
				boolean result2= textbox.isDisplayed();
				System.out.println("After clicking on show butten " +result2);
				
				if(result2== true)
				{
					textbox.sendKeys("India");
				}
				else
				{
					showbutten.click();
					textbox.sendKeys("India");
				}
}
}
