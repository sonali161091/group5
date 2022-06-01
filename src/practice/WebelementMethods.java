package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementMethods {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		         "D:\\sele1\\chromedriver.exe");

				WebDriver driver =  new ChromeDriver();
               driver.manage().window().maximize();
				driver.get("https://opensource-demo.orangehrmlive.com/symfony/web/index.php/auth/login");
				WebElement fp = driver.findElement(By.xpath("//div[2]//div//a"));
				String idattribute = fp.getAttribute("id");
				System.out.println(idattribute);
				
				String text = fp.getText();
				System.out.println(text);
				
				String tagname = fp.getTagName();
				System.out.println(tagname);
				

}
}