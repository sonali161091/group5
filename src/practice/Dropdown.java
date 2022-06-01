package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		         "D:\\sele1\\chromedriver.exe");

				WebDriver driver =  new ChromeDriver();
               driver.manage().window().maximize();
				driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
				
				WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
				dropdown.click();
				Select s =new Select(dropdown);
				//s.selectByIndex(1);
				//s.selectByValue("option2");
				s.selectByVisibleText("Option3");

}
}