package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		         "D:\\sele1\\chromedriver.exe");

				WebDriver driver =  new ChromeDriver();
               driver.manage().window().maximize();
				driver.get("https://vctcpune.com/selenium/practice.html");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				List<WebElement> columns= driver.findElements(By.xpath("//table//tbody//tr//th"));
				System.out.println(columns.size());
				
				for(int i=0; i<columns.size(); i++)
				{
					System.out.println(columns.get(i).getText());
				}
	
				
				List<WebElement> allcellData= driver.findElements(By.xpath("//table//tbody//tr//td"));
				System.out.println(allcellData.size());
				
				for(int i=0; i<allcellData.size(); i++)
				{
					System.out.println(allcellData.get(i).getText());
				}

}
}