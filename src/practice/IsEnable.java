package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		         "D:\\sele1\\chromedriver.exe");

				WebDriver driver =  new ChromeDriver();
               driver.manage().window().maximize();
				driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
				
				WebElement textbox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
				boolean result= textbox.isEnabled();
				System.out.println(result);
				
				if(result==true)
				{
					textbox.sendKeys("india");
				}
				else
				{
					System.out.println("We can not pass the values");
				}

}
}