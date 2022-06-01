package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size2 {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		         "D:\\sele1\\chromedriver.exe");

				WebDriver driver =  new ChromeDriver();
               driver.manage().window().maximize();
				driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
				
				WebElement textbox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
				
				Dimension d = textbox.getSize();
				System.out.println(d);
				
			int h =	textbox.getSize().getHeight();
			System.out.println("Height = "+h);
			
			int w =	textbox.getSize().getWidth();
			System.out.println("width = "+w);
				
			
			
			
				
	

}

}


