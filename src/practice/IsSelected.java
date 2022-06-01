package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		         "D:\\sele1\\chromedriver.exe");

				WebDriver driver =  new ChromeDriver();
               driver.manage().window().maximize();
				driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
				
				WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
				boolean result = radio1.isSelected();
				System.out.println(result);
				
				if(result==false)
				{
					radio1.click();
				}
				else
				{
					System.out.println("Button is already selected");
					
				}
				boolean result1 = radio1.isSelected();
				System.out.println("after clicking - "+result1);
				

}
}