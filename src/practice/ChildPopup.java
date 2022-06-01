package practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		         "D:\\sele1\\chromedriver.exe");

				WebDriver driver =  new ChromeDriver();
               driver.manage().window().maximize();
				driver.get("https://vctcpune.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				String mainaddress=driver.getWindowHandle();
				System.out.println(mainaddress);
				
				
				WebElement startlink = driver.findElement(By.xpath("//a[text()='Start Selenium Practice'][1]"));
				startlink.click();
				
				
				
				List<String>allpageAddress=new ArrayList<String>(driver.getWindowHandles());
				System.out.println(allpageAddress);
				
				
				driver.switchTo().window(allpageAddress.get(1));
				
				WebElement textbox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
				textbox.sendKeys("sonali");
				
				System.out.println("end program");
				
			

}
}